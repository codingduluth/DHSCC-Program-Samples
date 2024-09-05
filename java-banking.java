// Java Bank Account Simulation

class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Creating a new bank account object
        BankAccount account = new BankAccount("John Doe", 500.00);

        // Perform some transactions
        account.displayBalance();
        account.deposit(150.00);
        account.displayBalance();
        account.withdraw(100.00);
        account.displayBalance();
        account.withdraw(600.00); // Attempt to withdraw more than balance
        account.displayBalance();
    }
}