package src.chapter01_fundamentals.exercices;
import java.util.Scanner;

public class ATMSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Simulator!");

        // Prompt user for PIN
        System.out.print("Please enter your PIN: ");
        String pin = scanner.nextLine();

        // Validate PIN (for simplicity, let's assume the correct PIN is "1234")
        if (!pin.equals("1234")) {
            System.out.println("Invalid PIN. Access denied.");
            scanner.close();
            return;
        }

        // Display menu options
        System.out.println("\nATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        double balance = 1000.00; // Initial balance

        while (true) {
            System.out.print("\nSelect an option (1-4): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("$%.2f deposited successfully.%n", depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("$%.2f withdrawn successfully.%n", withdrawAmount);
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient funds.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM Simulator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
