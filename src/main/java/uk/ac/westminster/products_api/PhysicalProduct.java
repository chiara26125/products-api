/* A PhysicalProduct IS-A Product because PhysicalProduct
 is a subclass of product and inherits all the characteristics
 and behaviours of a Product */

/* Name one other class a shop system might have that would
 NOT pass this text, and say why */
/* Customer would not pass IS-A test because a Customer is
 not a Product. A Customer HAS-A Product */

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product implements Discountable{
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getSummary() {
        return getName() + ": " + getWeightKg();
    }

    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        double capped = Math.min(rate, 0.20);
        discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountPrice() {
        return discountedPrice;
    }
}
