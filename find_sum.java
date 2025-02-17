public class find_sum {
    public static void main(String args[]){
        int x=9;
        int n=4;
        int term=0;
        int sum=0;
        for(int i=1;i<=n;i++){
            term = term*10+x;
            sum+=term;
            }
        System.out.print(sum);  
        }
    }
