package eCommerce;

public class CouponDiscount implements Discount{

    private String discount;

    CouponDiscount(String discount){
        this.discount = discount;
    }
    @Override
    public double getDiscountAmount() {
        double d = Integer.parseInt(discount) / 100;
        return d;
    }
}
