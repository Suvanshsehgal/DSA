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
public static Node insert(Node head, int val){
    Node newNode = new Node(val); 
    if(head == null){
        return newNode;
    }
    Node curr = head; 
    while(curr.next != null){
        curr = curr.next;
    }
    curr.next = newNode;
    newNode.prev = curr;
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
    head = insert(head,1000);
    System.out.println("Doubly Linked List after insertion:");          
    printList(head);
}    
}
