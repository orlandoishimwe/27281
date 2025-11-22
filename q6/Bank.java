package Orl27281.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;

    public Bank(int id, String createdDate, String updatedDate,
                String bankName, String branchCode, String address) throws DataException {
        super(id, createdDate, updatedDate);
        if (branchCode == null || branchCode.length() < 3) throw new DataException("Branch code must be ≥ 3 chars");
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }

    public String getBankName() { return bankName; }
    public String getBranchCode() { return branchCode; }
}
