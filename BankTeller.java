public class BankTeller {

    // Shared branch-level information
    public static double branchVaultBalance = 500000;
    public static int totalTransactionToday = 0;

    // Teller properties
    private int tellerId;
    private String tellerName;

    // No-argument constructor - useful for JavaBean
    public BankTeller() {
    }
     public void displayBranchStatus() {

    System.out.println("\n----- Branch Status -----");
    System.out.println("Branch Vault Balance : ₹" + branchVaultBalance);
    System.out.println("Total Transactions   : " + totalTransactionToday);
}

    // Parameterized constructor
    public BankTeller(int tellerId, String tellerName) {
        this.tellerId = tellerId;
        this.tellerName = tellerName;

        System.out.println("Teller logged in: " + tellerName);
    }

    // Getter and Setter for tellerId
    public int getTellerId() {
        return tellerId;
    }

    public void setTellerId(int tellerId) {
        this.tellerId = tellerId;
    }

    // Getter and Setter for tellerName
    public String getTellerName() {
        return tellerName;
    }

    public void setTellerName(String tellerName) {
        this.tellerName = tellerName;
    }

    // Teller information
    public void displayTellerInfo() {
        System.out.println("\n----- Teller Information -----");
        System.out.println("Teller ID   : " + tellerId);
        System.out.println("Teller Name : " + tellerName);
    }

    // Teller login message
    public void login() {
        System.out.println(
            "Teller " + tellerName + " is ready to process transactions."
        );
    }

    // Teller logout
    public void logout() {
        System.out.println(
            "Teller " + tellerName + " logged out successfully."
        );
    }
}
