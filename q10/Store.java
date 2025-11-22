package Orl27281.q10;

public class Store extends Entity {
    private String storeName;
    private String location;

    public Store(int id, String createdDate, String updatedDate,
                 String storeName, String location) throws DataException {
        super(id, createdDate, updatedDate);

        if (storeName == null || storeName.isEmpty())
            throw new DataException("Store name required");

        if (location == null || location.isEmpty())
            throw new DataException("Location required");

        this.storeName = storeName;
        this.location = location;
    }

    public String getStoreName() { return storeName; }
}
