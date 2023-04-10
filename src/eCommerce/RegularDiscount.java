package eCommerce;

public class RegularDiscount implements Discount{
    private String discount;

    RegularDiscount(String discount){
        this.discount = discount;
    }
    @Override
    public double getDiscountAmount() {
        return Double.parseDouble(discount);
    }
}
