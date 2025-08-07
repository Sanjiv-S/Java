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
    public static void main(String[] args){
        linkedlist list=new linkedlist();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        printList(list);
        list.deleteAtEnd();
        printList(list);
    }
}
