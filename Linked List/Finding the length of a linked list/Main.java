public class Main {
 static class Node{
    int data; 
    Node next; 
    Node(int data){
        this.data=data;
        this.next=null;
    }
 }   
 
 public static int length(Node head){
    Node curr = head;
    int count = 0 ; 
    while(curr != null){
        count++;
        curr = curr.next;
    } 
    return count;
 }
 public static void main(String[] args) {
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

    int len = length(head);
    System.out.println("Length of the linked list: " + len);
 }
}
