package Orl27281.q8;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber) throws DataException {
        super(id, createdDate, updatedDate);
        if (libraryName == null || libraryName.isEmpty()) throw new DataException("Library name required");
        if (location == null || location.isEmpty()) throw new DataException("Library location required");
        if (phoneNumber == null || phoneNumber.length() != 10) throw new DataException("Phone must be 10 digits");
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getLibraryName() { return libraryName; }
}
