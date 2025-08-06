import java.util.Scanner;

public class BankAppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("----- Welcome to Bank of spain-----");

        while (true) {
            System.out.println("\n1. Create Account\n2. Deposit\n3. Withdraw\n4. Check Balance\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        BankManager.createAccount(sc);
                        break;
                    case 2:
                        BankManager.deposit(sc);
                        break;
                    case 3:
                        BankManager.withdraw(sc);
                        break;
                    case 4:
                        BankManager.displayBalance(sc);
                        break;
                    case 5:
                        System.out.println("Thank you for banking with us!");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                TransactionUtils.printLine();
            }
        }
    }
}
