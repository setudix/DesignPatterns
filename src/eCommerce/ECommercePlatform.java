package eCommerce;

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform extends ECommerceMediator{
    private List<Product> products;
    private List<User> users;
    private List<Payment> payments;

    public ECommercePlatform(){
        this.products = new ArrayList<Product>();
        this.users = new ArrayList<User>();
        this.payments = new ArrayList<Payment>();
    }
    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void showProducts() {
        System.out.println(products.toString());
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void pay(Payment payment) {
        payments.add(payment);
    }

    @Override
    public Product selectProductName(String name) {
        for (var product: products){
            if (product.getName() == name){
                return product;
            }
        }
        return null;
    }
    @Override
    public void purchaseProduct(User user, String productName, PaymentMethod paymentMethod, Discount discount){
        ProductPurchase productPurchase = new ProductPurchase(this, productName, paymentMethod, discount.getDiscountAmount());
        productPurchase.purchaseProduct();
    }
}
