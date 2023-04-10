package eCommerce;

public class Product {

    private final ECommerceMediator mediator;
    private String name;
    private String description;
    private double price;
    private String image;
    private int inventory;

    public Product(ECommerceMediator eCommerceMediator, String name, String description, double price, String image, int inventory) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
        this.inventory = inventory;

        this.mediator = eCommerceMediator;

        mediator.addProduct(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
