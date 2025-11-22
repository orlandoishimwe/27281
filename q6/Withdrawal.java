package Orl27281.q6;

public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    private String withdrawalDate;

    public Withdrawal(int id, String createdDate, String updatedDate,
                      String bankName, String branchCode, String address,
                      String accountNumber, String accountType,double balance,
                      String customerName, String email, String phoneNumber,
                      String transactionId, String transactionType, double amount,
                      double depositAmount, String depositDate,
                      double withdrawalAmount, String withdrawalDate) throws DataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance,
              customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate);
        if (withdrawalAmount <= 0) throw new DataException("Withdrawal amount must be > 0");
        if (withdrawalDate == null || withdrawalDate.isEmpty()) throw new DataException("Withdrawal date required");
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
        // apply withdrawal (uses current balance after deposit)
        debit(withdrawalAmount);
    }

    public double getWithdrawalAmount() { return withdrawalAmount; }
}
