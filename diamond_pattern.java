public class diamond_pattern {


    public void hallow_diamond(){
        int n = 4; 

        
    for (int i = 1; i <= n; i++) {
       
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
       
        for (int k = 1; k <= (2 * i - 1); k++) {
            if(k==1 || k==(2*i-1)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
        for (int j = n; j > i; j--) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i - 1); k++) {
            if (k == 1 || k == (2 * i - 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }

    public void diamond(){
        int n = 4; 

        
        for (int i = 1; i <= n; i++) {
           
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
           
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        diamond_pattern d = new diamond_pattern();
        d.hallow_diamond();
        System.out.println("");
        d.diamond();
    /*    int n=7;
        int l;
        int i;
        int j;
        int k;
        for(i=1;i<=n-1;i++){
            System.out.println(" ");
            for(j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=n-i;k++){
                System.out.print("*");
            }
            for(l=1;l<=n+1;l++){
                System.out.print(" ");
            }                                                                                                                                                                                                                                       
            
        }    */
        /*int n =7;
        for(int i=1;i<=n;i++){
            for(int j=n;j<=n-1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<= (2*i-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }*/
        

    }
    
    
    }

