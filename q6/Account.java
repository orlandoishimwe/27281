package Orl27281.q6;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(int id, String createdDate, String updatedDate,
                   String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance) throws DataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        if (accountNumber == null || accountNumber.isEmpty()) throw new DataException("Account number required");
        if (balance < 0) throw new DataException("Balance must be ≥ 0");
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }

    public void credit(double amount) throws DataException {
        if (amount <= 0) throw new DataException("Credit amount must be > 0");
        this.balance += amount;
    }

    public void debit(double amount) throws DataException {
        if (amount <= 0) throw new DataException("Debit amount must be > 0");
        if (amount > this.balance) throw new DataException("Insufficient balance");
        this.balance -= amount;
    }
}
