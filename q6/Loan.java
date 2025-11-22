package Orl27281.q6;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate;
    private int duration; // years

    public Loan(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address,
                String accountNumber, String accountType,double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double depositAmount, String depositDate,
                double withdrawalAmount, String withdrawalDate,
                double loanAmount, double interestRate, int duration) throws DataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
              customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate,
              withdrawalAmount, withdrawalDate);
        if (loanAmount <= 0 || interestRate <= 0 || duration <= 0) throw new DataException("Loan values must be > 0");
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public int getDuration() { return duration; }
}
