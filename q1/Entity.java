package Orl27281.q1;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) throws DataException {
        if (id <= 0) throw new DataException("ID must be greater than 0");
        if (createdDate == null || createdDate.isEmpty()) throw new DataException("Invalid created date");
        if (updatedDate == null || updatedDate.isEmpty()) throw new DataException("Invalid updated date");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public String getCreatedDate() { return createdDate; }
    public String getUpdatedDate() { return updatedDate; }
}
