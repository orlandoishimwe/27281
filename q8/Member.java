package Orl27281.q8;

public class Member extends Book {
    private String memberName;
    private int memberId;
    private String contactNumber;

    public Member(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber) throws DataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN);
        if (memberId <= 0) throw new DataException("Member ID must be > 0");
        if (contactNumber == null || contactNumber.length() != 10) throw new DataException("Contact must be 10 digits");
        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }

    public String getMemberName() { return memberName; }
    public int getMemberId() { return memberId; }
}
