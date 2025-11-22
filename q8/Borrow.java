package Orl27281.q8;

public class Borrow extends Member {
    private String borrowDate;
    private String returnDate;

    public Borrow(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  String borrowDate, String returnDate) throws DataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber);
        if (borrowDate == null || borrowDate.isEmpty()) throw new DataException("Borrow date required");
        if (returnDate == null || returnDate.isEmpty()) throw new DataException("Return date required");
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getBorrowDate() { return borrowDate; }
    public String getReturnDate() { return returnDate; }
}
