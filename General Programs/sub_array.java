public class sub_array {
    
    public static void main(String args[]){
        int A[]={1,1,1,0,1,1,0,1,1,0,1,1};
        int B[]={1,1,1,0};
        int value=1;
        int n=A.length;
        int m=B.length;
        int req =n-m;
        int count=0;
        Boolean x=false;
        while(value<=req){
            x =true;
            for(int i=count,j = 0;j < m; i++, j++){
                if(A[i]!=B[j]){
                    x=false;
                    break;
                }
            }
            if(x){
                break;
            }
            count++;
            value++;
        }
        if(x==true){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}
