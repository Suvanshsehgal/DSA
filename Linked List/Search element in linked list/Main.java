public class Main {
static class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }    
}
public static boolean search(Node head , int key){
    Node curr = head; 
    while(curr !=null){
        if(curr.data == key){
            return true;
        }
        curr = curr.next;   
    }
    return false;
}
public static void main(String[] args) {
    Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        int key = 3;
    boolean found = search(head, key);
    if(found){
        System.out.println("Element " + key + " found in the linked list.");
    } else {
        System.out.println("Element " + key + " not found in the linked list.");
    }
}
}
