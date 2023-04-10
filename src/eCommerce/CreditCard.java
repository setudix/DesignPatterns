package eCommerce;

public class CreditCard implements PaymentMethod {

    @Override
    public void pay(double price){
        System.out.println("payment of " + price + " successful using credit card");
    }
}
