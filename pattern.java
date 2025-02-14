public record pattern() {
    public void zero_pyramid(){
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
    public void num_pyramid(){
        int n=4;
        int count =1;
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k =1;k<=(2*i-1); k++){
                if(k==1 || k ==(2*i-1) || i == n){
                    System.out.print("*");
                }
                else{
                    while(k==(2*i-1)){
                        System.out.print(count);
                        count++;
                    }
                }
            }
            System.out.println("");
        }
    }
    public static void main (String args[]){
       pattern pat = new pattern();
       pat.zero_pyramid();
       System.out.println("");
       pat.num_pyramid();
    }
}
