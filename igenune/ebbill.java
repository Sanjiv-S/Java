import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class ebbill {
    
    static void bill(Scanner sc){
        int cost=0;
        
        System.out.print("Enter the type of current:");
        String curr= sc.nextLine();
        System.out.print("Enter the Amount of unit current used:");
        int unit=sc.nextInt();
        int temp=unit;
        if(curr.equals("Commercial")){
            if(unit<100){
                cost=unit/10;
                cost=cost*10;
                temp=cost*temp;
            }
            else{
                cost=unit/100;
                cost=cost*10;
                temp=cost*temp;
            }
        }
        else if(curr.equals("Normal")){
            if(unit<=100){
                cost=0;
            }
            else{
                cost=unit/100;
                cost=cost*5;
                temp=temp*temp;
            }
        }
        System.out.println(temp);
    }

    static void strong_password(Scanner sc){
        System.out.println("Enter the Password:");
        String password = sc.nextLine();
        List<String> list=Arrays.asList(password.split("" ));
        char arr[]={'!','@','#','$','%','^','&','*','1','2','3','4','5','6','7','8','9'};
        boolean flag=false;
        for(int i=0;i<password.length();i++){
            if(Character.isUpperCase(password.charAt(i))){
                flag=true;
            }
        }
             if(password.length()<8){
                System.out.println("Enter a password greater than 8 characters");
                System.out.println();
                strong_password(sc);
            }
            else if(password.length()<8 && !list.contains(arr)){
                System.out.println("Enter a password greater than 8 characters");
                System.out.println("Enter a password with special characters or numbers");
                System.out.println();
                strong_password(sc);
            }
            else if((flag==false && password.length()<8) && !list.contains(arr) ){
                System.out.println("Enter a password greater than 8 characters");
                System.out.println("Enter a password with special characters or numbers");
                System.out.print("Enter a password with capital Letter");
                System.out.println();
                strong_password(sc);
            }
            else if(flag==false){
                System.out.print("Enter a password with capital Letter");
                System.out.println();
                strong_password(sc);
            }
            else if(!list.contains(arr)){
                System.out.println("Enter a password with special characters ");
                System.out.println();
                strong_password(sc);
            }
            else{
                System.out.println("Password Accepted");
                
            }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //bill(sc);
        strong_password(sc);
    }
}
