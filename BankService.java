import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
   private Map<Integer, Account> accounts = new HashMap();
   private List<Transaction> transactions = new ArrayList();
   private int transactionId = 1;

   public BankService() {
   }

   public void createAccount(Account var1) {
      this.accounts.put(var1.getAccountNumber(), var1);
      System.out.println("Account created successfully!");
      System.out.println("Account Number: " + var1.getAccountNumber());
   }

   public void deposit(int var1, double var2) {
      Account var4 = (Account)this.accounts.get(var1);
      if (var4 == null) {
         System.out.println("Account not found!");
      } else if (var2 <= (double)0.0F) {
         System.out.println("Invalid amount!");
      } else {
         var4.setBalance(var4.getBalance() + var2);
         BankTeller.branchVaultBalance += var2;
         ++BankTeller.totalTransactionToday;
         Transaction var5 = new Transaction(this.transactionId++, var1, "DEPOSIT", var2);
         this.transactions.add(var5);
         System.out.println("Deposit successful!");
         System.out.println("Deposited: ₹" + var2);
         System.out.println("New Balance: ₹" + var4.getBalance());
      }
   }

   public void withdraw(int var1, double var2) {
      Account var4 = (Account)this.accounts.get(var1);
      if (var4 == null) {
         System.out.println("Account not found!");
      } else if (var2 <= (double)0.0F) {
         System.out.println("Invalid amount!");
      } else if (var4.getBalance() - var2 < (double)500.0F) {
         System.out.println("Minimum balance of ₹500 required!");
      } else {
         var4.setBalance(var4.getBalance() - var2);
         BankTeller.branchVaultBalance -= var2;
         ++BankTeller.totalTransactionToday;
         Transaction var5 = new Transaction(this.transactionId++, var1, "WITHDRAWAL", var2);
         this.transactions.add(var5);
         System.out.println("Withdrawal successful!");
         System.out.println("Withdrawn: ₹" + var2);
         System.out.println("Remaining Balance: ₹" + var4.getBalance());
      }
   }

   public void checkBalance(int var1) {
      Account var2 = (Account)this.accounts.get(var1);
      if (var2 == null) {
         System.out.println("Account not found!");
      } else {
         System.out.println("Account Holder: " + var2.getCustomer().getName());
         System.out.println("Account Balance: ₹" + var2.getBalance());
      }
   }

   public void transfer(int var1, int var2, double var3) {
      Account var5 = (Account)this.accounts.get(var1);
      Account var6 = (Account)this.accounts.get(var2);
      if (var5 != null && var6 != null) {
         if (var3 <= (double)0.0F) {
            System.out.println("Invalid amount!");
         } else if (var5.getBalance() - var3 < (double)500.0F) {
            System.out.println("Insufficient balance!");
         } else {
            var5.setBalance(var5.getBalance() - var3);
            var6.setBalance(var6.getBalance() + var3);
            ++BankTeller.totalTransactionToday;
            this.transactions.add(new Transaction(this.transactionId++, var1, "TRANSFER", var3));
            System.out.println("Transfer successful!");
            System.out.println("Transferred ₹" + var3);
         }
      } else {
         System.out.println("Invalid account!");
      }
   }

   public void searchAccount(int var1) {
      Account var2 = (Account)this.accounts.get(var1);
      if (var2 == null) {
         System.out.println("Account not found!");
      } else {
         System.out.println("\n----- Account Details -----");
         System.out.println("Account Number : " + var2.getAccountNumber());
         System.out.println("Account Holder : " + var2.getCustomer().getName());
         System.out.println("Account Type   : " + var2.getAccountType());
         System.out.println("Balance        : ₹" + var2.getBalance());
      }
   }

   public void showTransactions(int var1) {
      System.out.println("\n----- Transaction History -----");

      for(Transaction var3 : this.transactions) {
         if (var3.getAccountNumber() == var1) {
            PrintStream var10000 = System.out;
            int var10001 = var3.getTransactionId();
            var10000.println("ID: " + var10001 + " | Type: " + var3.getType() + " | Amount: ₹" + var3.getAmount() + " | Date: " + String.valueOf(var3.getDate()));
         }
      }

   }
}
