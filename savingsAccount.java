import java.util.Scanner;
abstract class BankAccount{
    private int accountnumber;
    private int balance;
    static int interest_rate;
    abstract void calculateinterest();
}
class currentAccount extends BankAccount{
    Scanner sc =new Scanner(System.in);
    public void calculateinterest(){
        System.out.println("Enter Account number");
        int accountnumber =sc.nextInt();
        System.out.println("Balance");
        int balance =sc.nextInt();
        int pri = 10000;
        interest_rate =28;
        int n=12;
        int interest_amount =pri *interest_rate*n;
        System.out.println("Current balance:"+balance);
        System.out.print(interest_amount);
    }
}
class savingsAccount extends currentAccount {
    Scanner sc =new Scanner(System.in);
    public void calculateinterest(){
        System.out.println("Enter Account number");
        int accountnumber =sc.nextInt();
        System.out.println("Balance");
        int balance =sc.nextInt();
        int pri = 10000;
        interest_rate =23;
        int n=10;
        int interest_amount =pri *interest_rate*n;
        System.out.println("Savings balance:"+balance);
        System.out.print(interest_amount);
    }
    public static void main(String args[]){
        savingsAccount obj =new savingsAccount();
        obj.calculateinterest();
    }

}
