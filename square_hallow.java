public class square_hallow {
    public void square(){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public void right_triangle(){
        int n=6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        square_hallow obj = new square_hallow();
        obj.square();
        obj.right_triangle();
        
    }    
}
    
    
        
    

