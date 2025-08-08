public class method_triangle {
    int n=5;
    public void right_triangle(){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public void left_triangle(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        method_triangle obj =new method_triangle();
        obj.right_triangle();
        System.out.println();
        obj.left_triangle();
    }
}
