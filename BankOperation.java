public class BankOperation {

    public static void main(String[] args) {

        BankService bank = new BankService();
        BankTeller teller = new BankTeller(1, "Anshika");

  teller.login();
 teller.displayTellerInfo();
 teller.displayBranchStatus();
 

        // Customers
        Customer c1 = new Customer(
                101,
                "Anshika",
                "9876543210",
                "anshika@gmail.com"
        );

        Customer c2 = new Customer(
                102,
                "Anshi",
                "9876501234",
                "anshi@gmail.com"
        );

        // Accounts
        Account a1 = new Account(
                1001,
                c1,
                "Savings",
                10000
        );

        Account a2 = new Account(
                1002,
                c2,
                "Savings",
                5000
        );

        // Create accounts
        bank.createAccount(a1);
        bank.createAccount(a2);
        // search account
        bank.searchAccount(1001);
            
        System.out.println("\n-----------------------------");
        

        // Deposit
        bank.deposit(1001, 2000);
         // Search account


        System.out.println("\n-----------------------------");

        // Withdrawal
        bank.withdraw(1001, 1500);

        System.out.println("\n-----------------------------");

        // Check balance
        bank.checkBalance(1001);

        System.out.println("\n-----------------------------");

        // Transfer
        bank.transfer(1001, 1002, 3000);

        System.out.println("\n-----------------------------");

        // Check balances
        bank.checkBalance(1001);

        bank.checkBalance(1002);

        System.out.println("\n-----------------------------");

        // Transaction history
        bank.showTransactions(1001);
        teller.displayBranchStatus();

        // Teller logout
        teller.logout();
    }
}
