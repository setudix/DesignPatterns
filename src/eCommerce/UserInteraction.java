package eCommerce;

public class UserInteraction {
    public static void main(String[] args) {
        ECommercePlatform eCommercePlatform = new ECommercePlatform();
        Product product1 = new Product(eCommercePlatform,"phone", "smart phone 2023", 100, "Phone", 1 );
        Product product2 = new Product(eCommercePlatform,"laptop", "latest model", 200, "Laptop" , 2);

        User user = new User(eCommercePlatform,"user", "user@user.com", "1234", "dhaka");


        eCommercePlatform.purchaseProduct(user, "phone", new CreditCard(), new RegularDiscount("0.5"));

    }
}
