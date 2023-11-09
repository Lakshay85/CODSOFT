class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited Amount is : $ " + amount + ". New balance is $ " + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew Amount $ " + amount + ". New balance is $ " + this.balance);
        } else {
            System.out.println("Insufficient Amount");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is $ " + this.balance);
    }
}