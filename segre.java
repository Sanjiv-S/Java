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

    // Method to insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to segregate odd and even numbers
    public void segregateOddEven() {
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;

        Node current = head;
        while (current != null) {
            if (current.data % 2 == 0) { // Even
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = evenHead;
                } else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            } else { // Odd
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = oddHead;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }
            current = current.next;
        }

        // If there are no even nodes
        if (evenHead == null) {
            head = oddHead;
        } else {
            // Combine even and odd lists
            evenTail.next = oddHead;
            head = evenHead;
        }

        // Make sure the last node points to null
        if (oddTail != null) {
            oddTail.next = null;
        }
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

public class segre{
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert elements into the linked list
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(7);
        linkedList.insert(8);

        System.out.println("Original Linked List:");
        linkedList.printList();

        // Segregate odd and even numbers
        linkedList.segregateOddEven();

        System.out.println("Linked List after segregating odd and even numbers:");
        linkedList.printList();
    }
}