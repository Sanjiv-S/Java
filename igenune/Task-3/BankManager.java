import java.util.Scanner;

public class BankManager {

    private static User[] users = new User[5];

    public static void createAccount(Scanner sc) {
        if (User.getUserCount() >= 5) {
            System.out.println("Maximum number of users reached.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Initial Deposit Amount: ");
        double deposit = sc.nextDouble();

        System.out.print("Enter Account Type (1-Regular / 2-Premium): ");
        int type = sc.nextInt();

        BankInterface newUser;
        if (type == 2) {
            newUser = new PremiumAccount(name, deposit);
        } else {
            newUser = new RegularAccount(name, deposit);
        }

        users[User.getUserCount() - 1] = (User) newUser;
        newUser.createAccount(name, deposit);
        System.out.println("Account created! Account Number: " + ((User) newUser).getAccountNumber());
    }

    public static User findUserByAccountNumber(int accNo) {
        for (User user : users) {
            if (user != null && user.getAccountNumber() == accNo) {
                return user;
            }
        }
        return null;
    }

    public static void deposit(Scanner sc) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        User user = findUserByAccountNumber(accNo);

        if (user == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        if (TransactionUtils.isValidAmount(amount)) {
            ((BankInterface) user).deposit(amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public static void withdraw(Scanner sc) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        User user = findUserByAccountNumber(accNo);

        if (user == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();

        try {
            ((BankInterface) user).withdraw(amount);
        } catch (Exception e) {
            System.out.println("Error during withdrawal: " + e.getMessage());
        }
    }

    public static void displayBalance(Scanner sc) {
        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        User user = findUserByAccountNumber(accNo);

        if (user != null) {
            System.out.println("Balance for " + user.getAccountHolderName() +
                    " (" + user.getAccountNumber() + "): ₹" + user.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
