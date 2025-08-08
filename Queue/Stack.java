public class Stack {
    private int[] stack;
    private String[] stack1;
    private int top;       
    private int top1;      
    private int MAX_SIZE;

    public Stack(int n) {
        stack = new int[n];
        stack1 = new String[n];
        top = -1;
        top1 = -1;
        MAX_SIZE = stack.length;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Integer Stack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    int size() {
        return top + 1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Integer Stack is Full");
            return;
        }
        stack[++top] = data;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Integer Stack is Empty");
            return -1;
        }
        return stack[top--];
    }

    boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void displayStrings() {
        if (isEmptyString()) {
            System.out.println("String Stack is Empty");
            return;
        }
        for (int i = top1; i >= 0; i--) {
            System.out.print(stack1[i] + " ");
        }
        System.out.println();
    }

    int sizeString() {
        return top1 + 1;
    }

    void pushString(String data) {
        if (isFullString()) {
            System.out.println("String Stack is Full");
            return;
        }
        stack1[++top1] = data;
    }

    String popString() {
        if (isEmptyString()) {
            System.out.println("String Stack is Empty");
            return null;
        }
        return stack1[top1--];
    }

    boolean isFullString() {
        return top1 == MAX_SIZE - 1;
    }

    boolean isEmptyString() {
        return top1 == -1;
    }
}
