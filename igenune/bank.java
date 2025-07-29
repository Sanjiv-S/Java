import java.util.Scanner;
public class bank {
    static void display(Scanner sc,int Balance,int default_pin,int total_withdraw,int count,int pin){
                System.out.println("Choose among the options:");
                System.out.println("1.Balance");
                System.out.println("2.Withdraw");
                System.out.println("3.deposit");
                System.out.println("4.Pin-Change");
                System.out.println("5.Exit");
                int choice=sc.nextInt();
                if(choice==1){
                    System.out.print(Balance);
                    display(sc, Balance, default_pin, total_withdraw, count, pin);
                }
                else if(choice==2){
                    System.out.print("Enter the Amount to withdraw:");
                    int withdraw=sc.nextInt();
                    if(Balance>withdraw && withdraw<50000){
                        Balance-=withdraw;
                        total_withdraw+=withdraw;
                        display(sc, Balance, default_pin, total_withdraw, count, pin);
                    }
                    else if(total_withdraw>50000){
                        System.out.println("With draw Limit Reached" );
                    }
                    else{
                        System.out.println("Insufficient Fund");
                    }
                }
                else if(choice==3){
                    System.out.println("Enter the Amount to deposit:");
                    int deposit=sc.nextInt();
                    if(deposit>0){
                    Balance+=deposit;
                    System.out.println("Deposition Complete");
                    display(sc, Balance, default_pin, total_withdraw, count, pin);
                    }
                    else{
                        System.out.print("Enter a vaild Amount !");
                    }
                }
                else if(choice==4){
                    System.out.println("Enter the previous PIN:");
                    int previous_pin=sc.nextInt();
                    if(pin==previous_pin){
                        System.out.println("Enter the New PIN:");
                        int new_pin=sc.nextInt();
                        default_pin=new_pin;
                        display(sc, Balance, default_pin, total_withdraw, count, new_pin);
                    }
                    else{
                        System.out.println("Enter the correct Password !");
                    }
                }
                else if(choice==5){
                    System.out.print("Thank You !");
                }
        
           
    }
    static void entry(Scanner sc,int Balance,int default_pin,int total_withdraw,int count){
        int pin=sc.nextInt();
        if(pin ==default_pin){
            display(sc, Balance, default_pin, total_withdraw,count,pin);
        }
            else{
                if (count<2) {
                    System.out.println("Enter a Valid PIN:");
                    count++;
                    entry(sc, Balance, default_pin, total_withdraw, count);
                    
                }
                else{
                    System.out.println("Cannot Enter into account -Contact the nearby bank for details");
                }
                
            }
    }
    
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int Balance=500;
        int default_pin=12345;
        int total_withdraw=0;
        int count=0;
        System.out.println("Card Inserted Yes / No:");
        String card=sc.nextLine();
        if(card.equals("yes")){
            System.out.println("Enter the PIN Number:");
            
            entry(sc, Balance, default_pin, total_withdraw, count);
        }
}
}