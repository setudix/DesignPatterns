package eCommerce;

public abstract class ProductPurchaseTemplate {
    public abstract void purchaseProduct();

    public abstract void displayProduct();

    public abstract Product selectProduct(String productName);

    public abstract void processPayment(Product product);


}
