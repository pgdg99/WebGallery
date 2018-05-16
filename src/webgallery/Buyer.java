
package webgallery;

import java.util.ArrayList;


public class Buyer extends User {
    
    private ArrayList<Painting> buyedPaintings;

    public Buyer(String name, int accountNumber, double accountMoney) {
        super(name, accountNumber, accountMoney);
    }
    
    
}
