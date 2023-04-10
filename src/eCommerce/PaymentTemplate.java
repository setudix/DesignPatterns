package eCommerce;

public abstract class PaymentTemplate {
    protected abstract PaymentMethod selectPaymentMethod();
    protected abstract void makePayment();

    protected abstract void getReceipt();
    protected abstract void paymentProcess();
}
