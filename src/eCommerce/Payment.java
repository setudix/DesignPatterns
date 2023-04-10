package eCommerce;

public class Payment extends PaymentTemplate {

    private PaymentMethod paymentMethod;
    private double price;
    Payment(PaymentMethod paymentMethod, double price){
        this.paymentMethod = paymentMethod;
        this.price = price;
    }

    protected void paymentProcess(){
        selectPaymentMethod();
        makePayment();
        getReceipt();
    }
    @Override
    protected PaymentMethod selectPaymentMethod() {
        return paymentMethod;
    }
    @Override
    protected void makePayment(){
        paymentMethod.pay(price);
    }

    @Override
    protected void getReceipt() {
        System.out.println("payment of " + price + " successfull");
    }
}
