class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Insert a new node at the end of the linked list
    public void append(int data) {
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

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        // Appending elements to the linked list
        myList.append(1);
        myList.append(2);
        myList.append(3);

        // Displaying the linked list
        myList.display();
    }
}
