package Orl27281.q9;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws DataException {
        if (id <= 0) throw new DataException("ID must be > 0");
        if (createdDate == null || createdDate.isEmpty()) throw new DataException("createdDate required");
        if (updatedDate == null || updatedDate.isEmpty()) throw new DataException("updatedDate required");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
