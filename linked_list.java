public class linked_list {
    class Node {
        int data;
        Node next;
    
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList {
    Node head;

    // Method to insert a new node in sorted order
    public void insertInSortedOrder(int data) {
        Node newNode = new Node(data);

        // Case 1: The list is empty or the new node should be the new head
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Find the correct position for the new node
        Node current = head;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

    public void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert elements in sorted order
        linkedList.insertInSortedOrder(30);
        linkedList.insertInSortedOrder(10);
        linkedList.insertInSortedOrder(20);
        linkedList.insertInSortedOrder(25);

        // Print the linked list
        linkedList.printList();
    }
}

