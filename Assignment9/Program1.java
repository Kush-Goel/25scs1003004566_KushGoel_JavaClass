class BankAcc
{
    int accountNumber;
    String accountHolderName;
    double balance;

    static double interestRate = 5.0;

    BankAcc(int no, String name, double bal)
    {
        accountNumber = no;
        accountHolderName = name;
        balance = bal;
    }

    void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println();
    }

    public static void main(String[] args)
    {
        BankAcc b1 = new BankAcc(101, "Rahul", 50000);
        BankAcc b2 = new BankAcc(102, "Aman", 60000);
        BankAcc b3 = new BankAcc(103, "Riya", 70000);

        System.out.println("Before Changing Interest Rate:");
        b1.display();
        b2.display();
        b3.display();

        BankAcc.interestRate = 7.5;

        System.out.println("After Changing Interest Rate:");
        b1.display();
        b2.display();
        b3.display();
    }
}

