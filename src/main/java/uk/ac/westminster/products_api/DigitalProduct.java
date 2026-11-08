package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    // declaring variables within DigitalProduct class
    private String downloadUrl;
    private double fileSizeMB;

    // no-arg constructor
    public DigitalProduct() {
    }

    // full-arg constructor
    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    // getters
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }

    @Override
    public String getSummary() {
        return getName() + ": " + downloadUrl;
    }

    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountPrice() {
        return discountedPrice;
    }
}