public class Main {
    static class Node{
        int data; 
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    public static Node deleteNode(Node head, int key){

    Node curr = head;

    // Step 1: find the node
    while (curr != null && curr.data != key) {
        curr = curr.next;
    }

    // Key not found
    if(curr == null) return head;

    // Step 2: delete head node
    if(curr.prev == null){
        head = curr.next;
        if(head != null){
            head.prev = null;
        }
        return head;
    }

    // Step 3: delete last node
    if(curr.next == null){
        curr.prev.next = null;
        return head;
    }

    // Step 4: delete middle node
    curr.prev.next = curr.next;
    curr.next.prev = curr.prev;

    return head;
}
public static void printList(Node head){
    Node curr = head;
    while(curr != null){
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
    System.out.println();
}

public static void main(String[] args) {
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

    System.out.println("Original Doubly Linked List:");
    printList(head);
    head = deleteNode(head,3);
    System.out.println("Doubly Linked List after deletion:");          
    printList(head);
}
}
