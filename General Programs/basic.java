import java.util.Scanner;

public class basic {
    Scanner sc =new Scanner(System.in);
    int n=5;
    String name[]=new String[n];
    int Id[]=new int[n];
    public void input(){
        System.out.print("Enter the Name:");
        for(int i=0;i<n;i++){
            name[i] = sc.nextLine();
        }
        System.out.print("Enter the ID:");
        for(int j=0;j<n;j++){
             Id[j]  = sc.nextInt();
        }
        System.out.println();
        System.out.println("Name:");
        for(String i:name){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("ID:");
        for(int  j:Id){
            System.out.print(j+" ");
        }
    }
     
    public static void main(String args[]){
        basic obj = new basic();
        obj.input();
    }
}
