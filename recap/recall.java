public class recall {
    static void evenorodd(int a){
        if(a%2==0){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
    static void prime(int a){
        int flag=0;
        for(int i=2;i<a/2;i++){
            if(a%i==0){
                flag+=1;
            }
        }
        if(flag>0){
                System.out.print("Not a Prime ");
            }
            else{
                System.out.print("Its a Prime");
            }
    }
    static void factorial(int a){
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial*=i;
        }
        System.out.print(factorial);
    }
    static void reverse(int a){
        int  reverse=0;
       while(a>0){
        reverse=reverse*10+a%10;
        a=a/10;
       }
       System.out.print(reverse);
    }
    static void palindrome(int a){
        int reverse=0;
        int temp=a;
        while(a>0){
            reverse=reverse*10+a%10;
            a=a/10;
        }
        if(reverse==temp){
            System.out.print("Its a Plaindrome");
        }
        else{
            System.out.print("Its not a Palindrome");
        }
    }
    static void amstrong(int a){
        int temp=a;
        int fin=a;
        int count=0;
        int value=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        while(a>0){
            value=value+ (int)Math.pow(a%10,count);
            a=a/10;
        }
        if(value==fin){
            System.out.print("Its a Amstrong Number");
        }
        else{
            System.out.print("Its not a Amstrong Number");
        }
    }
    static void sumofnumber(int a){
        int sum=0;
        while(a>0){
            sum=sum+a%10;
            a=a/10;
        }
        System.out.print(sum);
    }
    static int gcd(int a ,int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
        }
    
    static void lcm(int a, int b){
        int value=0;
        value=Math.abs((a/gcd(a, b))*b);
        System.out.print(value);
    }
    static void perfectnumber(int a){
        int sum=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if(sum==a){
            System.out.print("Its a Perfect Number");
        }
        else{
            System.out.print("Its  not a Perfect Number");
        }
    }
    static void fibonacci(int a){
        int b=0;
        int c=1;
        int temp=0;
        for(int i=0;i<a;i++){
            System.out.print(b);
            temp=b;
            b=c;
            c+=temp;
        }
    }
    static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
             for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=2*n-1;j>=2*i-1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int i=1;i<n;i++){
             for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=2*(n-1)-1;j>=2*i-1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    
    public static void main(String args[]){
        evenorodd(45678);
        System.out.println();
        prime(8);
        System.out.println();
        factorial(8);
        System.out.println();
        reverse(56789);
        System.out.println();
        palindrome(2872);
        System.out.println();
        amstrong(9474);
        System.out.println();
        sumofnumber(556);
        System.out.println();
        System.out.print(gcd(15, 25));
        System.out.println();
        lcm(15, 25);
        System.out.println();
        perfectnumber(6);
        System.out.println();
        fibonacci(9);
        System.out.println();
        triangle(5);
    }
}
