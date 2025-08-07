import java.util.Scanner;
public class Main {
    static void stack(){
        Stack s=new Stack(3);
        Stack s1=new Stack(6);
        Stack output=new Stack(9);
        s.push(2);
        s.push(4);
        s.push(6);
        System.out.println("Stack 1");
        s.display();
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(7);
        s1.push(9);
        System.out.println("Stack 2");
        s1.display();
        while(!s.isEmpty() && !s1.isEmpty()){
            int v1=s.pop();
            int v2=s1.pop();
            output.push(Math.max(v1, v2));
            if(v1<v2){
                s.push(v1);
            }
            else{
                s1.push(v2);
            }
        }
        while (!s.isEmpty()) {
        output.push(s.pop());
    }

        while (!s1.isEmpty()) {
        output.push(s1.pop());
    }
        output.display();
    }
    static void alternateStack(){
        Stack s=new Stack(5);
        Stack s1=new Stack(5);
        Stack output=new Stack(10);
        Stack bottomtop=new Stack(10);
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);
        System.out.println("Stack 1");
        s.display();
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(7);
        s1.push(2);
        System.out.println("Stack 2");
        s1.display();
          while(!s.isEmpty() && !s1.isEmpty()){
            int v1=s1.pop();
            int v2=s.pop();
            int v3=v1+v2;
                if(v3%2==0){
                    output.push(v2);
                    output.push(v1);
                    
                }
                else{
                    output.push(v1);
                    output.push(v2);
                    
                }
            }
            output.display();
            while(!output.isEmpty()){
            int v=output.pop();
            bottomtop.push(v);
        }
        bottomtop.display();
        }
    static void sort(Scanner sc){
        System.out.println("Enter the Size of the Stack:");
        int size=sc.nextInt();
        Stack s=new Stack(size);
        Stack s1=new Stack(size);
        Stack output=new Stack(size*2);

    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Stack s=new Stack(size);
        Stack s1=new Stack(size);
        Stack output=new Stack(size*2);
        Stack bottomtop=new Stack(size*2);
        System.out.println("Enter the value for the Stack:");
        for(int i=0;i<size;i++){
            int v1=sc.nextInt();
            s.push(v1);
        }
        System.out.println("Stack 1");
        s.display();
        System.out.println("Enter the value for the Stack:");
        for(int i=0;i<size;i++){
            int v1=sc.nextInt();
            s1.push(v1);
        }
        System.out.println("Stack 2");
        s1.display();
        while(!s.isEmpty() && !s1.isEmpty()){
            for(int i=1;i<=10;i++){
                if(i%2==0){
                    int v1=s1.pop();
                    output.push(v1);
                }
                else{
                    int v2=s.pop();
                    output.push(v2);
                }
            }
        }
        output.display();
        while(!output.isEmpty()){
            int v=output.pop();
            bottomtop.push(v);
        }
        bottomtop.display();
        System.out.println();
    //     stack();
    //     System.out.println();
    //     alternateStack();
    }
}
