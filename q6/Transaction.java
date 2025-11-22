package Orl27281.q6;

public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(int id, String createdDate, String updatedDate,
                       String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount) throws DataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber);
        if (transactionId == null || transactionId.isEmpty()) throw new DataException("Transaction ID required");
        if (amount <= 0) throw new DataException("Transaction amount must be > 0");
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getTransactionId() { return transactionId; }
    public String getTransactionType() { return transactionType; }
    public double getAmount() { return amount; }
}
