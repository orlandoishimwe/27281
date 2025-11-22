package Orl27281.q6;

public class Payment extends Loan {
    private double paymentAmount;
    private String paymentDate;

    public Payment(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType,double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate,
                   double withdrawalAmount, String withdrawalDate,
                   double loanAmount, double interestRate, int duration,
                   double paymentAmount, String paymentDate) throws DataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
              customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate,
              withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration);
        if (paymentAmount <= 0) throw new DataException("Payment amount must be > 0");
        if (paymentDate == null || paymentDate.isEmpty()) throw new DataException("Payment date required");
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
}
