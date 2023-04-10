package eCommerce;

public class ProductPurchase extends ProductPurchaseTemplate{

    private ECommerceMediator mediator;
    private Product product;
    private String productName;
    private PaymentMethod paymentMethod;

    private double discount;
    ProductPurchase(ECommerceMediator mediator, String productName, PaymentMethod paymentMethod, double discount){
        this.mediator = mediator;
        this.productName = productName;
        this.paymentMethod = paymentMethod;
        this.discount = discount;
    }
    @Override
    public void purchaseProduct() {
        displayProduct();
        product = selectProduct(productName);
        processPayment(product);
    }

    @Override
    public void displayProduct() {
        mediator.showProducts();
    }

    @Override
    public Product selectProduct(String productName) {
        return mediator.selectProductName(productName);
    }

    @Override
    public void processPayment(Product product) {
        double productPrice = product.getPrice();
        double newPrice = productPrice - discount*productPrice;
        Payment payment = new Payment(paymentMethod, newPrice);
        payment.paymentProcess();
    }
}
