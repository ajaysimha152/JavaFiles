class BankAccount {
    private int accountNumber;
    private int balance;

    // Default Constructor
    public BankAccount() {
        this.accountNumber = (int) (Math.random() * 1000000);
        this.balance = 10000;
    }

    // Parameterized Constructor
    public BankAccount(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance > 0 ? initialBalance : 0; // Ensuring valid balance
    }

    // Getter methods
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    // Deposit method
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + ". New Balance: " + this.balance);
        } else {
            System.out.println("Please enter an amount greater than 0.");
        }
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Remaining Balance: " + this.balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // ToString method for better representation
    @Override
    public String toString() {
        return "BankAccount{Account Number=" + accountNumber + ", Balance=" + balance + "}";
    }
}

// Main class to test functionality
public class Constructor {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(152081,0); 
        System.out.println(account); // Display initial account details

        account.deposit(5000);  // Valid deposit
        account.withdraw(3000); // Valid withdrawal
        account.withdraw(15000); // Insufficient balance scenario

        System.out.println("Final Account Details: " + account);
    }
}
