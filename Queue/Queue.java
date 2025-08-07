public class Queue {
    private int queue[];
    private int front,rear,maxSize;
    public Queue(int size){
        maxSize=size;
        front=-1;
        rear=-1;
        queue=new int[maxSize];
    }
    public boolean isFull(){
        return rear==maxSize-1;
    }
    public boolean isEmpty(){
        return rear==-1 && front==-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(front==-1){
            front=0;
        }
        queue[++rear]=data;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is Empty");
            return -1;
        }
        int value=queue[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
        return value;
    }
    public boolean  size(){
        return rear==-1;
    }
    public int pole(){
        return dequeue();
    }
    public int elememnt(){
         if(isEmpty()){
            System.out.println("queue is Empty");
            return -1;
        }
        return queue[front];
    }
    public void Display(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
