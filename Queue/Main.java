import java.util.Scanner;
public class Main {
    static boolean isPrime(int v3){
        if (v3 <= 1) {
            return false; 
        }
        for(int j=2;j<=Math.sqrt(v3);j++){
                if(v3%j==0){
                    return false;
                }
    }
    return true;
}

    static void enqueuePrime(Scanner sc,int size){
        Queue in1 =new Queue(size);
        Queue in2 =new Queue(size);
        Queue output=new Queue(size);
        System.out.println("Enter the Values to enqueue");
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            in1.enqueue(data);
        }
        System.out.println("Enter the Values to enqueue");
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            in2.enqueue(data);
        }
        for(int i=0;i<size;i++){
            int v1=in1.pole();
            int v2=in2.pole();
            int v3=v1+v2;
            if(isPrime(v3)){
                output.enqueue(v3);
            }
        }
        output.Display();
    }

    static void enqueueSum(Scanner sc,int size,int size1){
        Queue in1 =new Queue(size);
        Queue in2 =new Queue(size1);
        Queue output=new Queue(Math.max(size,size1));
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            in1.enqueue(data);
        }
        System.out.println("Enter the Values to enqueue");
        for(int i=0;i<size1;i++){
            int data=sc.nextInt();
            in2.enqueue(data);
        }
        while(!in1.isEmpty() && !in2.isEmpty()){
            int v1=in1.pole();
            int v2=in2.pole();
            int v3=v1+v2;
            int v4=v1-v2;
            if(v1%2==0){
            output.enqueue(v3); 
            }
            else{
            output.enqueue(v4);
            }
        }
        while(!in1.isEmpty()){
            int v1=in1.pole();
            output.enqueue(v1);
        }
        while(!in2.isEmpty()){
            int v1=in2.pole();
            output.enqueue(v1);
        }
        output.Display();
    }

    static void twoSum(Scanner sc,int size,int size1,int k){
        Queue in1 =new Queue(size);
        Queue in2 =new Queue(size1);
        Queue output=new Queue(Math.max(size,size1));
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            in1.enqueue(data);
        }
        System.out.println("Enter the Values to enqueue");
        for(int i=0;i<size1;i++){
            int data=sc.nextInt();
            in2.enqueue(data);
        }
         while(!in1.isEmpty() && !in2.isEmpty()){
            int v1=in1.pole();
            int v2=in2.pole();
            if((v1+v2)==k){
            output.enqueue(v1); 
            output.enqueue(v2);
            }
        }
        output.Display();
    }

    static void reverseK(Scanner sc,int k,int size){
        Queue in1 =new Queue(size);
        Queue in2=new Queue(size);
        Stack st =new Stack(size);
        int arr[]=new int[k];
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            in1.enqueue(data);
        }
        for(int i=k-1;i>=0;i--){
            st.push(in1.pole());
            }
        for(int i=0;i<k;i++){
            in2.enqueue(st.pop());
            }
        while(!in1.isEmpty()){
            in2.enqueue(in1.pole());
        }
        in2.Display();
    }

    static void reverseString(Scanner sc) {
        sc.nextLine(); 
        System.out.println("Enter the String:");
        String input = sc.nextLine();

        char[] chars = input.toCharArray(); 
        Stack st = new Stack(chars.length); 

        for (char c : chars) {
            st.pushString(String.valueOf(c));
        }
        System.out.print("Reversed String: ");
        while (!st.isEmptyString()) {
            System.out.print(st.popString());
        }
        System.out.println();
}
    static void nonRepeating(Scanner sc,int size){
        Stack st=new Stack(size);
        Queue qu=new Queue(size);
        String input=sc.nextLine();
        char[] chars=input.toCharArray();
        888
        st.pushString(input);
    }

    static void interLeave(Scanner sc,int size){
        Queue in1 =new Queue(size);
        Queue in2=new Queue(size);
        Queue output=new Queue(size);
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            in1.enqueue(data);
        }
        for(int i=0;i<size/2;i++){
            in2.enqueue(in1.pole());
        }
        for(int i=1;i<=size;i++){
            if(i%2==0){
                output.enqueue(in1.pole());
                
            }
            else{
                output.enqueue(in2.pole());
            }
        }
        output.Display();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of the Queue-1:");
        int size=sc.nextInt();
        System.out.print("Enter the Size of the Queue-2:");
        int size1=sc.nextInt();
        System.out.print("Enter the Value of K:");
        int k=sc.nextInt();
        // enqueuePrime(sc,size);
        // enqueueSum(sc, size, size1);
        // twoSum(sc, size, size1, 11);
        // reverseK(sc, k, size);
        // interLeave(sc,size);
        reverseString(sc);
    }
}
