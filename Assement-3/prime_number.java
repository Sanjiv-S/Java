public class prime_number {
    static void prime(int n){
        int count=0;
        for(int i=2;i<n/2;i++){
            if( n%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("Its not a Prime number");
        }
        else{
            System.out.println("Its a Prime number");
        }
    }
    static int reverse(int n){
        int count=0;
        int temp=n;
        int reversed=0;
        while (temp>0) {
            temp=temp/10;
            count++;
        }
        for(int i=count-1;i>=0;i--){
            int rem=n%10;
            reversed=reversed + rem*(int)Math.pow(10,i);
            n=n/10;
        }
        return reversed;
    }
    static void amstrong(int n){
        int count=0;
        int value=n;
        int temp=n;
        int rem=0;
        int sum=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        for(int i=0;i<count;i++){
            rem=n%10;
            sum=(int)Math.pow(rem,count) +sum;
            n=n/10;
        }
        if(sum==value){
            System.out.println("Its Amstrong");
        }
        else{
            System.out.println("Its not Amstrong");
        }
    }
    static void sum_of_digits(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=rem+sum;
            n=n/10;
        }
        System.out.println(sum);
    }
    static void gcd(int a,int b){
        if(b==0){
            System.out.print(a);
        }
        else{
            gcd(b ,a%b);

            
        }
    }
public static void main(String args[]){
    prime(765);
    System.out.println(reverse(345678));
    amstrong(371);
    sum_of_digits(428);
    gcd(48,18);
}
}