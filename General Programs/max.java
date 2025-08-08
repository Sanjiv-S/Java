import java.util.Scanner;
public class max {
    static int findmax(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
    }
    static void shape(String input,int value, int length,int breath){
        int area=0;
        int perimeter=0;
        switch (input) {
            case "triangle" :
                if(value ==1){
                    System.out.print(area=(length*breath));
                }
                else{
                     System.out.print(perimeter=(length*breath)/2);
                }
                break;
            
            case "rectangle" :
                if(value ==1){
                     System.out.print(area=(length*breath));
                }
                else{
                     System.out.print(perimeter=2*(length+breath));
                }
                break;

            case "square" :
                if(value ==1){
                     System.out.print(area=(length*length));
                }
                else{
                     System.out.print(perimeter=4*length);
                }
                break;

            default:
                System.out.print("Enter valid string");
                break;
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,9,6,4,2,22,3,455,6,7,8,8,88,9,6969,6,76,5,55,};
        System.out.print(findmax(arr));
        System.out.println("");
        Scanner sc=new Scanner(System.in);
        // System.out.print("which shape do you want to find:");
        // String input=sc.nextLine();
        // System.out.println("What do you want to find Area(1) or perimeter(2):");
        // int value=sc.nextInt();
        // System.out.print("Enter values of length and breath:");
        // System.out.println("length:");
        // int length=sc.nextInt();
        // System.out.println("breath:");
        // int breath=sc.nextInt();
        //shape(input,value,length,breath);

        System.out.println("Enter rows:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=(n-i);j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i+1;k++){
                System.out.print(" "+(i+1));
            }
            System.out.println();
        }
        int a=99;
        int b=89;
        int c=100;
        a=a+b+c-(c=b)-(b=a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
