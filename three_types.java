public class three_types {
    static int pronic(int n){
        int value=0;
        for(int i=1;i<=n/2;i++){
            if(i*(i+1)==n){
                value++;
            }
        }
        return value;
    }
    static int abundant(int n,int sum){
        int value=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum>n){
            value=1;
        }
        return value;
    }
    static int Niven(int n,int sum){
        while(n>0){
            int rem =n%10;
            n =n/10;
            sum=sum+rem;
        }
        return sum;
    }
    public static void main(String args[]){
        int number=42;
        if(number%Niven(number,0)==0 && abundant(number, 0)==1 && pronic(number)==1){
            System.out.println(number+" is a Niven, abundant and pronic number");
        }
        else if(number%Niven(number,0)==0 && abundant(number, 0)!=1 && pronic(number)!=1){
            System.out.println(number+" is a Niven number and not an abundant and pronic");
        }
        else if(number%Niven(number,0)!=0 && abundant(number, 0)!=1 && pronic(number)!=1){
            System.out.println(number+" is not an Niven, abundant and pronic");
        }
        else if(number%Niven(number,0)!=0 && abundant(number, 0)==1 && pronic(number)!=1){
            System.out.println(number+" is an abundant number but not a Niven and pronic number");
        }
        else if(number%Niven(number,0)!=0 && abundant(number, 0)!=1 && pronic(number)==1){
            System.out.println(number+" is a pronic but not an abundant and niven");
        }
        else if(number%Niven(number,0)==0 && abundant(number, 0)==1 && pronic(number)!=1){
            System.out.println(number+" is a Niven and abundant but not pronic");
        }
        else if(number%Niven(number,0)==0 && abundant(number, 0)!=1 && pronic(number)==1){
            System.out.println(number+" is a Niven and pronic but not abundant");
        }
        else if(number%Niven(number,0)!=0 && abundant(number, 0)==1 && pronic(number)==1){
            System.out.println(number+" is a abundant and pronic but not Niven");
        }
    }
}
