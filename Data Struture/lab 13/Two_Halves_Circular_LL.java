class CircularLinkedList {
    class Node{
        int data;
        Node link;
        Node(int data){
            this.data=data;
            this.link=null;
        }
    }
    Node first=null;

    // Constructor to initialize an empty circular linked list
   

    // Method to insert a node at the end of the circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            first.link = first; // Circular reference
        } else {
            Node current = first;
            while (current.link != first) {
                current = current.link;
            }
            current.link = newNode;
            newNode.link = first; // Maintain circular nature
        }
    }

    // Method to split the circular linked list into two halves
    public void splitList() {
        if (first == null) {
            System.out.println("List is empty.");
            return;
        }

        Node slowPtr = first;
        Node fastPtr = first;

        // Move fastPtr to the end and slowPtr will be at the middle of the list
        while (fastPtr.link != first && fastPtr.link.link != first) {
            fastPtr = fastPtr.link.link;
            slowPtr = slowPtr.link;
        }

        // If even number of nodes, move fastPtr one more step
        if (fastPtr.link.link == first) {
            fastPtr = fastPtr.link;
        }

        // Now slowPtr is at the middle of the list, split the list
        Node first1 = first;
        Node first2 = slowPtr.link;

        // Make second half circular
        fastPtr.link = first2;

        // Make first half circular
        slowPtr.link = first;

        // Print the two halves
        System.out.println("First half:");
        printList(first1);
        System.out.println("\nSecond half:");
        printList(first2);
    }

    // Helper method to print the circular linked list
    public void printList(Node start) {
        if (start == null) {
            return;
        }
        Node temp = start;
        do {
            System.out.print(temp.data + " ");
            temp = temp.link;
        } while (temp != start);
    }
}

public class Two_Halves_Circular_LL{
        public static void main(String[] args) {
            CircularLinkedList list = new CircularLinkedList();
    
            // Inserting nodes into the circular linked list
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);
            list.insert(5);
            list.insert(5);
    
            // Splitting the circular linked list into two halves
            list.splitList();
        }
    }
    
