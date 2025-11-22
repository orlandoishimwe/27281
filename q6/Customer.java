package Orl27281.q6;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(int id, String createdDate, String updatedDate,
                    String bankName, String branchCode, String address,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber) throws DataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance);
        if (email == null || !email.contains("@")) throw new DataException("Invalid email");
        if (phoneNumber == null || phoneNumber.length() != 10) throw new DataException("Phone must be 10 digits");
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() { return customerName; }
}
