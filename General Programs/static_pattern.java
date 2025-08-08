public class static_pattern {
    static int n=5;
        static void pattern(){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if(j%2 == 0){
                        System.out.print("#");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            
        }
    
    public static void main(String args[]){
        pattern();
    }
}

