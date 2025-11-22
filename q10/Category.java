package Orl27281.q10;

public class Category extends Store {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String createdDate, String updatedDate,
                    String storeName, String location,
                    String categoryName, String categoryCode) throws DataException {
        super(id, createdDate, updatedDate, storeName, location);

        if (categoryCode == null || categoryCode.length() < 3)
            throw new DataException("Category code must be ≥ 3 chars");

        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
}
