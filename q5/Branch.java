package Orl27281.q5;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch(int id, String createdDate, String updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) throws DataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);

        if (locationCode == null || locationCode.length() < 3)
            throw new DataException("Location code must be ≥ 3 chars");

        this.branchName = branchName;
        this.locationCode = locationCode;
    }

    public String getBranchName() { return branchName; }
}
