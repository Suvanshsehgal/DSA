public class Main {
    static class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node rearrange(Node head, int n ){
        int length = length(head);
        if(n== length) return head.next;
        Node curr = head; 
        for(int i=0; i< length-1-n; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
    private static int length(Node head){
        Node curr = head; 
        int count = 0 ; 
        while(curr !=null){
            count++;
            curr = curr.next;
        }
        return count;
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
        head.next.next.next.next = new Node(5);
        int length = length(head);
        Node ans = rearrange(head,2);
        int length1 = length(head);
        System.out.println("Length of linked list: " + length);
        System.out.println("Length of new linked list: " + length1);
        printList(ans);
    }
}


