
package webgallery;

import java.util.ArrayList;


public class Artist extends User {
    
    private ArrayList<Painting> paintings;

    public Artist(String name, int accountNumber, double accountMoney) {
        super(name, accountNumber, accountMoney);
        this.paintings= new ArrayList<>();
    }
    
    public void addPainting(Painting painting){
        paintings.add(painting);
    }
}
