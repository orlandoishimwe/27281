package Orl27281.q8;

public class Record extends Payment {
    private double totalFine;

    public Record(int id, String createdDate, String updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  String borrowDate, String returnDate,
                  double fineAmount, int daysLate,
                  String paymentDate, String paymentMode,
                  double totalFine) throws DataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN, memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode);
        if (totalFine <= 0) throw new DataException("Total fine must be > 0");
        this.totalFine = totalFine;
    }

    public double getTotalFine() { return totalFine; }
}
