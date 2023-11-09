import java.util.Scanner;
class Atm_Machine{

    private BankAccount account;

    public Atm_Machine(BankAccount account) {
        this.account = account;
    }

    // Display the options that Account holder saw
    public void displayOptions() {
        System.out.println("---------------Welcome to the ATM. Choose an option---------------:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("0. Exit");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        try{
        do {
            displayOptions();
            System.out.print("Enter option number : ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw : $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit : $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
            

        } while (choice != 0);
        System.out.println("Thank you for using the ATM.");
        }
            catch(Exception e)
            {
                System.out.println("Invalid Input");
            }
    }



    public static void main(String[] args) {
        // Create a bank account
        BankAccount userAccount = new BankAccount(1000);

        // Initialize the ATM with the user's account
        Atm_Machine atmMachine = new Atm_Machine(userAccount);

        // Start the ATM interface
        atmMachine.start();
    }
}