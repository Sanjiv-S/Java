public class factorial{
static int fact(int N){
int ans = N;
        for (int i = N - 1; i > 0; i--) {
            int sum = 0;
            for (int j = 0; j < i; j++)
                sum += ans;
            ans = sum;
        }
        return ans;
}
public static void main(String args[]){
System.out.print(fact(5));
}
}