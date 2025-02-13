public record pattern() {
    public static void main (String args[]){
        int i;
        int j;
        int n2=4;
        int k ;
        int l;
        int q =0;
        for(i=1;i<=n2;i++){
            System.out.println(" ");
            for(j=n2-i;j>=1;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i+q;k++){
                if(k==1 || k ==i+q || i == n2){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
                
            }
            for(l=n2-i;l>=1;l--){
                System.out.print(" ");
            }                                                                                                                                                                                                                                       
            q++;
        }
    }
}
