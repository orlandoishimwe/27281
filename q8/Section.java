package Orl27281.q8;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;

    public Section(int id, String createdDate, String updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode) throws DataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        if (sectionCode == null || sectionCode.length() < 3) throw new DataException("Section code must be ≥ 3 chars");
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }

    public String getSectionName() { return sectionName; }
    public String getSectionCode() { return sectionCode; }
}
