public class pattern_new {
    public static void main(String args[]){
        int n=5;
        int count =5;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2 !=0){
                    if(j==1 || j==3){
                        System.out.print("0");
                        
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j==1 || j==3){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(count);
                        count-=2;
                    }
                }
            }
            System.out.println();
        }
    }
   
}
