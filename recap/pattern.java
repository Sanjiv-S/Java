public class pattern{
    public static void main (String args[]){
        int j=4;
        int temp=1;
        for(int i=temp;i<j;i++){
            System.out.print(" ");
        }
        for(int k=2*temp-1;k>0;k--){
            System.out.print("*");
        }
        System.out.println();
        temp++;
    } 
}