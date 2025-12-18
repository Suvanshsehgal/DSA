public class Main {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node addtwolist(Node a , Node b ){
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        while(a != null || b!= null){
           int sum = carry; 
           if(a != null){
            sum += a.data; 
            a = a.next;
           }
           if(b != null){
            sum += b.data; 
            b = b.next;
           }
           carry = sum/10;
           sum = sum %10; 
           temp.next = new Node(sum);
           temp = temp.next;
        }
        return dummy.next;
    }
    public static void printlist(Node head){
        Node temp = head; 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next; 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(9);
        a.next.next.next = new Node(3);

        Node b = new Node(5);
        b.next = new Node(6);
        b.next.next = new Node(4);

        Node result = addtwolist(a, b);
        printlist(result); // Expected output: 7 0 8
    }
}
