import java.util.*;
public class RegularAccount extends User implements BankInterface{
    public static final double MIN_BALANCE = 1000;
    public RegularAccount(String name,double initialDeposit) {
        super(name,initialDeposit);
    }
    
    public void createAccount(String name,double initialDeposit){
       System.out.println("Account created for " + name + " with initial Deposit:"+initialDeposit);
    }

    public void deposit(double amount){
        if(amount>0){
            setBalance(getBalance()+amount);
            System.out.println("Deposit Successfull New Balance:"+getBalance());
        }
        else{
            System.out.println("Invalid input");
        }
    }
    public void withdraw(double amount){
        try{
            if(MIN_BALANCE> getBalance()-amount){
                throw new Exception ("Insufficient Balance");
            }
            else{
                 setBalance(getBalance()-amount);
            System.out.println("Amount withdrawn Successfully new Balance:"+getBalance());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void displayDetails(){
              System.out.println("Account Holder: " + getAccountHolderName() +
                           "\nAccount Number: " + getAccountNumber() +
                           "\nBalance: ₹" + getBalance());
    }
}
