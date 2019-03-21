package lab10.entity;

public class Product {
    
    private String type;
    private double price;
    private String style;
    private String color;
    private String parametr;

    
    public Product(){
        type="unknown";
        price=0;
        style="unknown";
        color="unknown";
        parametr="unknown";
    }
    
    
    public Product(Product product) {
        type = product.type;
        price = product.price;
        style = product.style;
        color = product.color;
        parametr = product.parametr;
    }
    
    
    public Product(String type, double price, String style, String color, String parametr) {
        this.type = type;
        this.price = price;
        this.style = style;
        this.color = color;
        this.parametr = parametr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>0){
            this.price = price;
        }
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getParametr() {
        return parametr;
    }

    public void setParametr(String parametr) {
        this.parametr = parametr;
    }

    @Override
    public String toString() {
        return "Product{" + "type=" + type + ", price=" + price + ", "
                + "style=" + style + ", color=" + color + ", "
                + "parametr=" + parametr + '}';
    }
    
    
    
}
