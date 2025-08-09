import java.util.Scanner;

public class linkedlist {
    // Node head;
    // static class Node{
    //     int data;
    //     Node next;

    //     Node(int d){
    //         data =d;
    //         next = null;
    //     }
    // }
    // public static linkedlist insert(linkedlist list,int data){
    //     Node new_node= new Node(data);
    //     new_node.next=null;
    //     if(list.head==null){
    //         list.head=new_node;
    //     }
    //     else{
    //         Node last=list.head;
    //         while(last.next!=null){
    //             last=last.next;
    //         }
    //         last.next=new_node;
    //     }
    //     return list;
    // }
    public static void printList(linkedlist list){
            Node currnode =list.head;
            System.out.print("Linked List:");
            while(currnode != null){
                System.out.print(currnode.data+" ");
                currnode =currnode.next;
            }
            System.out.println();
    }
    // public static linkedlist deletebykey(linkedlist list, int key){
    //     Node currnode=list.head;
    //     Node prev=null;
    //     if(currnode != null && currnode.data==key){
    //         list.head=currnode.next;
    //         System.out.println(key+ " Found and deleted");
    //         return list;
    //     }
    //     while(currnode!=null && currnode.data!=key){
    //         prev=currnode;
    //         currnode=currnode.next;

    //     }
    //     if(currnode!=null){
    //         prev.next=currnode.next;
    //         System.out.println(key+" Found and deleted");
    //     }
    //     if(currnode ==null){
    //         System.out.println("Key not found");
    //     }
    //     return list;
    // }
    // public static void main(String[] args){
    //     linkedlist list=new linkedlist();
    //     list=insert(list, 1);
    //     list=insert(list, 2);
    //     list=insert(list, 3);
    //     list=insert(list, 4);
    //     printList(list);
    //     list=deletebykey(list,4);
    //     printList(list);
    // }
    Node head;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public void deleteAtEnd(){
        if(head==null){
            return;
        }
        Node current=head;
        Node prev=null;
        while(current.next!=null){
            prev=current;
            current=current.next;
        }
        prev.next=null;
    }

    public void insertAtStart(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public void insertByKey(int data,int data1){
        Node newNode=new Node(data);
        
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            if(current.data==data1){
                newNode.next=current.next;
                current.next=newNode;
                return;
            }
            else{
                current=current.next;
            }
        }   
    System.out.println("Key " + data1 + " not found.");
    }

    public void deletebykey(int data){
        Node current=head;
        Node prev=null;
        if(head.data==data){
            head=head.next;
            return;
        }
        while(current.next!=null ){
            if(current.data ==data){
                prev.next=current.next;
                return;
            }
            prev=current;
            current=current.next;
        }
        prev.next=null;
    }

    public void deleteByIndex(int index) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        Node prev = null;

        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.next;
            if (current == null) {
                System.out.println("Index out of bounds.");
                return;
            }
        }
        prev.next = current.next;
}

    public void insertAtMid(int data,int index){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
    }

    static void input(Scanner sc,linkedlist list,int size){
        System.out.println(".Enter the value of the LinkedList:");
        for(int i=0;i<size;i++){
            int data=sc.nextInt();
            list.insertAtEnd(data);
        }
    }

    public int sum(linkedlist list,int size){
        Node current=head;
        int sum=0;
        while(current.next!=null){
            sum+=current.data;
            current=current.next;
        }
        sum+=current.data;
        return sum;
    }

    public static void main(String[] args){
        linkedlist list=new linkedlist();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the List:");
        int size=sc.nextInt();
        input(sc,list,size);
        list.insertAtStart(5);
        printList(list);
        list.insertAtEnd(50);
        printList(list);
        list.deleteByIndex(2);
        printList(list);
        list.insertByKey(35, 30);
        printList(list);
        System.out.println("Sum of All the Elements in the List: "+list.sum(list,size));
    }
}
