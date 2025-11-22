package Orl27281.q10;

public class Product extends Category {
    private String productName;
    private double price;
    private String sku;

    public Product(int id, String createdDate, String updatedDate,
                   String storeName, String location,
                   String categoryName, String categoryCode,
                   String productName, double price, String sku) throws DataException {
        super(id, createdDate, updatedDate, storeName, location, categoryName, categoryCode);

        if (price <= 0) throw new DataException("Price must be > 0");
        if (sku == null || sku.isEmpty()) throw new DataException("SKU required");

        this.productName = productName;
        this.price = price;
        this.sku = sku;
    }

    public double getPrice() { return price; }
    public String getProductName() { return productName; }
}
