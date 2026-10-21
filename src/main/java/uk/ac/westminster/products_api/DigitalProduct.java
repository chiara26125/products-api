package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    // declaring variables within DigitalProduct class
    private String downloadUrl;
    private double fileSizeMB;

    // no-arg constructor
    public DigitalProduct() {}

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
}
