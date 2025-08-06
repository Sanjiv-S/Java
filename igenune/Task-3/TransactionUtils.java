public class TransactionUtils {
    public static void printLine() {
        System.out.println("Transaction completed. -----");
    }

    public static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}
