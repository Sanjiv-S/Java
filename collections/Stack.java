public class Stack {
    private int [] stack;
    private int top;
    private int MAX_SIZE;
    public Stack(int n){
        stack=new int[n];
        top=-1;
        MAX_SIZE=stack.length;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    int size(){
        return top+1;
    }
    void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        stack[++top]=data;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top--];
    }
    boolean isFull(){
        return top==MAX_SIZE-1;  
          }
    boolean isEmpty(){
        return top==-1;
    }
    
}
