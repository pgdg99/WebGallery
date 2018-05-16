
package webgallery;


public class Painting {
    
    private String title;
    private String style;
    private String technic;
    private double price;

    public Painting(String title, String style, String technic, double price) {
        this.title = title;
        this.style = style;
        this.technic = technic;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getStyle() {
        return style;
    }

    public String getTechnic() {
        return technic;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setTechnic(String technic) {
        this.technic = technic;
    }

    public void setPrice(double price) {
        this.price = price;
    }
            
}
