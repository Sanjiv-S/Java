public class DoublyLinkedList {
    Node head;
    Node tail;
    private class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }

    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    public void insertAtStart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail = newNode;
            return;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }

    public void insertAtMid(int data,int index){
        Node newNode =new Node(data);
        index=index-1;
        if(head==null&&index==0){
            head=newNode;
            tail=newNode;
        }
        else if(index<0){
            System.out.println("Invalid Index");
        }
        Node currNode=head;
        for(int i=0;i<=index;i++){ 
            if(i==index){
                newNode.next=currNode.next;
                currNode.next.prev=newNode;
                currNode.next=newNode;
                newNode.prev=currNode;
            }
            else{
                currNode=currNode.next;
            }
        }
    }
    public void printList(DoublyLinkedList list){
            Node currnode =head;
            System.out.print("Linked List:");
            while(currnode != null){
                System.out.print(currnode.data+" ");
                currnode =currnode.next;
            }
            System.out.println();
    }
    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.insertAtStart(5);
        list.insertAtEnd(10);
        list.insertAtEnd(15);
        list.insertAtEnd(20);
        list.printList(list);
        list.insertAtMid(12, 2);
        list.printList(list);

    }
}
