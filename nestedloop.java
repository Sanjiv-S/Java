public class nestedloop {
    public static void main(String args[]){
        int n = 5;
        int i;
        int j;
        for(i=1;i<=n;i++){
            System.out.println(" ");
            for(j=1;j<=i;j++){
                System.out.print('1');
            }
        }
        for(i=1;i<=n;i++){
            System.out.println(" ");
            for(j=1;j<=i;j++){
                System.out.print(i);
            }
        }
        for(i=1;i<=n;i++){
            System.out.println(" ");
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
        }
        int k =1;
        int n1 =4;
        for(i=1;i<=n1;i++){
            System.out.println(" ");
            for(j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }

        }
        
        for(i=1;i<=n;i++){
            System.out.println(" ");
            for(j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("1");
            }
            System.out.println();
        }
        
    }
}

