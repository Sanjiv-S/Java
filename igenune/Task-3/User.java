public abstract class User {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private static int userCount=0;
    
    User(String name,double initialDeposit){
        this.accountHolderName=name;
        this.accountNumber=1000+ ++userCount;
        this.balance=initialDeposit;
        
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    abstract void displayDetails();
}
