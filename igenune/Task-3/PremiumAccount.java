public class PremiumAccount extends RegularAccount{
    public PremiumAccount(String name,double initialDeposit){
        super(name,initialDeposit);
    }
    public void withdraw(double amount){
        if (amount > getBalance()) {
            System.out.println("Insufficient balance!");
        } 
        else {
            if(MIN_BALANCE>getBalance()-amount){
                setBalance(getBalance()-amount);
                System.out.println("Warning you are Current Balance is Less than Minimum Balance");
            }
            System.out.println("Withdrawal successful. New Balance: ₹" + getBalance());
        }
        
    }
    public void getBonus(){
        System.out.println("Nothing Here");
    }
}
