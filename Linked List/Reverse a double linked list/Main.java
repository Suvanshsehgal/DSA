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

    public static Node reverse(Node head){
        Node curr = head; 
        while(curr.next != null){
            curr = curr.next;
        }
        head = curr;
        while(curr != null){
            Node temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.next;    
        }
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
        head = reverse(head);
        System.out.println("Reversed Doubly Linked List:");          
        printList(head);
    }
}
