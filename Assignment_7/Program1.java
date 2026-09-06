class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance) {

        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.isEmpty()
                && accountNumber.length() >= 5) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid Account Number");
        }
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.isEmpty()
                && accountHolderName.length() >= 3) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid Account Holder Name");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    public void deposit(double amount) {

        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Depositing: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccountDetails() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Available Balance: " + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "ACC1001",
                "Rahul Sharma",
                5000.0
        );

        account.displayAccountDetails();

        account.deposit(2000);

        account.withdraw(3000);

        System.out.println("Updated Balance: " + account.getBalance());
    }
}
