package Orl27281.q6;

public final class AccountRecord extends Payment {

    public AccountRecord(int id, String createdDate, String updatedDate,
                         String bankName, String branchCode, String address,
                         String accountNumber, String accountType,double balance,
                         String customerName, String email, String phoneNumber,
                         String transactionId, String transactionType, double amount,
                         double depositAmount, String depositDate,
                         double withdrawalAmount, String withdrawalDate,
                         double loanAmount, double interestRate, int duration,
                         double paymentAmount, String paymentDate) throws DataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address,
              accountNumber, accountType, balance, customerName, email, phoneNumber,
              transactionId, transactionType, amount, depositAmount, depositDate,
              withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration,
              paymentAmount, paymentDate);
    }

    public double calculateInterest() {
        // (loanAmount × interestRate × duration) / 100
        return (getLoanAmount() * getInterestRate() * getDuration()) / 100.0;
    }
}
