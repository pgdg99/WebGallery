
package webgallery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class SaveFile {
    
    

    public SaveFile() {
    }

    public ArrayList<Artist> load(String dir) {
        
        File f = new File(dir);
        ArrayList artists= new ArrayList();
        
        if(f.exists()){
            try {
                Scanner input = new Scanner(f);
                BufferedReader reader= new BufferedReader(new FileReader(f));
                String line= reader.readLine();
                while(line!=null){
                    while(input.hasNext(">")){
                        input.nextLine();
                        String name=input.next();

                        String a=input.next();
                        int account=Integer.parseInt(a);

                        String m=input.next();
                        double money= Double.parseDouble(m);

                        Artist artist= new Artist(name,account,money);
                        artists.add(artist);
                        //System.out.println(ar.getName()+" "+ar.getAccountNumber()+" "+ar.getAccountMoney());
                        input.nextLine();
                        
                        //ArrayList paintings= new ArrayList();

                        while(input.hasNext("--")){
                            input.nextLine();
                            String title=input.next();
                            String style=input.next();
                            String technic=input.next();
                            double price=input.nextDouble();
                            artist.addPainting(new Painting(title, style, technic, price));
                            input.nextLine();

                        }
                    }
                    line=reader.readLine();
                }
                
            } catch (FileNotFoundException ex) {
                System.err.println("Error 404 -- File not found");   
            } catch (IOException ex) {
                System.err.println("Error 405 -- An unknown shit just happened");
            }
            
            return artists;
        }else{
             try {
                 f.createNewFile();
            } catch (IOException ex) {
                System.err.println("Error 405 -- File couldn't be created");
            }
        }
        return null;
        
    }

    
    
    
    
}
