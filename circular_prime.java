public class circular_prime {
    static int calc_prime(int new_value){
        int count=0;
        for(int i=2;i<new_value/2;i++){
            if(new_value%i==0){
                count =count +1;
            }
        }
        return count;
    }
    static void prime(){
        int n=1193;
        int flag=0;
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    flag++;
                }
            }
            if(flag==0){
                int m=0;
                while(m<3){
                int rem=n%10;
                int quo=n/10;
                int new_value=rem*1000+quo;
                if(calc_prime(new_value)==0){
                    System.out.println(new_value+" its prime");
                }
                else{
                    System.out.println(new_value+" its not prime");
                    break;
                }
                n=new_value;
                m++;
            }
            }
            else{
                System.out.println(n+"is not prime");
            }
        }
    public static void main(String args[]){
        prime();
    }
}
