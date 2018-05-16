
package webgallery;

/**
 *
 * @author Pablo Gonzalez De Greiff
 */
public class WebGallery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SaveFile f= new SaveFile();
        f.load("test.txt");
        //System.out.println(f.getTitle()+" "+f.getStyle()+" "+f.getTechnic()+" "+f.getPrice());
        
    }
    
}
