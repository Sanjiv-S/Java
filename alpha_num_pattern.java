public class alpha_num_pattern {
    
    public void first_pattern(){
    char arr[] ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N'};
    int n =5;
    int count=0;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(count==14){
                    break;
                }
                System.out.print(arr[count]);
                count++;
            }
            System.out.println();
        }
    }   
    public void second_pattern(){
        char arr[] ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int n=9;
        int count=0;
        int q=1;
        for(int i=0;i<=n;i++){
            if(i<5){
                for(int k=0;k<i;k++){
                    System.out.print(" ");
                }
                for(int j=n/2;j>=i;j--){
                    System.out.print(arr[count]+" ");
                    count++;
                }
                System.out.println();
            }
            else{
                
                for(int j=(n/2)-1;j>=q;j--){
                    System.out.print(" ");
                }
               
                for(int k=0;k<=q;k++){
                    if(count==26 || i==9 & q>1){
                        continue;
                    }
                    System.out.print(arr[count]+" ");
                    count++;
                }
                if(i==9 & q>1){
                    for(int p=1;p<=3;p++){
                        System.out.print(p+" ");
                    }
                }
                q++;
                if(i<8){
                    System.out.println();
                }
                
            }
            
        }
    }
    public static void main(String args[]){
        alpha_num_pattern obj =new alpha_num_pattern();
        obj.first_pattern();
        obj.second_pattern();

    }
}
