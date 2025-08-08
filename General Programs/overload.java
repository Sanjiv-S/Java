public class overload {
    
    static void calculate(int n){
        int value =n;
        int i;
        for(i=n-1;i>=1;i--){
            value =value *i;
        }
        System.out.print("Factorial value:"+value);
    }
    static void calculate(int num1,int num2,int m){
        for(int i=0;i<m;i++){
            System.out.print(num1);
            int num3 =num1+num2;
            num1=num2;
            num2=num3;
        }
    }
    public static void main(String args[]){
        int value =0;
        calculate(5);
        System.out.println();
        calculate(0,1,5);
    }
}
