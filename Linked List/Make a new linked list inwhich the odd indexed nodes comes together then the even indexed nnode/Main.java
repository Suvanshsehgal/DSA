public class Main {
static class Node{
    int data; 
    Node next; 
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public static Node rearrange(Node head){
   Node odd = head; 
   Node even = head.next; 
   Node evenhead = even; 
   while(even!=null && even.next !=null){
    odd.next = even.next; 
    odd = odd.next; 
    even.next=odd.next; 
    even = even.next; 
   }
   odd.next = evenhead;
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
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        Node ans = rearrange(head);
        printList(ans);
        
}    

}