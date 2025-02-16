import java.util.Scanner;

public class name_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next().toUpperCase();
        scanner.close();

        for (int i = 0; i < 7; i++) { // Assuming 7 rows per letter
            for (char ch : name.toCharArray()) {
                printPattern(ch, i);
                System.out.print("  "); // Space between letters
            }
            System.out.println();
        }
    }

    public static void printPattern(char ch, int row) {
        switch (ch) {
            case 'A':
                String[] A = {"  *  ", " * * ", "*****", "*   *", "*   *", "*   *", "*   *"};
                System.out.print(A[row]);
                break;
            case 'B':
                String[] B = {"**** ", "*   *", "**** ", "*   *", "*   *", "*   *", "**** "};
                System.out.print(B[row]);
                break;
            case 'C':
                String[] C = {" ****", "*    ", "*    ", "*    ", "*    ", "*    ", " ****"};
                System.out.print(C[row]);
                break;
            default:
                System.out.print("     "); // Space for unsupported letters
        }
    }
}
