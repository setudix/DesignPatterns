package eCommerce;

public abstract class ECommerceMediator {
    public abstract void addProduct(Product product);
    public abstract void showProducts();
    public abstract void addUser(User user);

    public abstract void pay(Payment payment);

    public abstract Product selectProductName(String name);

    public abstract void purchaseProduct(User user, String productName, PaymentMethod paymentMethod, Discount discount);
}
