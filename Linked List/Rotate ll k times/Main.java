public class Main {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node rotate(Node head, int k){
        int length = length(head); 
        int rot = k % length ; 
       
        if(rot == 0 || head == null){
            return head; 
        }
        while(rot!=0){
            Node curr = head;
            while(curr.next.next != null){
                curr = curr.next; 
            }
            curr.next.next = head; 
            head = curr.next;
            curr.next = null; 
            rot--;
        }
        return head; 
    }
    public static int length(Node head){
        int check =  0 ; 
        Node curr = head; 
        while(curr != null){
            check ++;
            curr = curr.next; 
        }
        return check; 
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
        Node a = new Node(1);
        a.next = new Node(2);
        a.next.next = new Node(3);
        a.next.next.next = new Node(4);
        a.next.next.next.next = new Node(5);
        a.next.next.next.next.next = new Node(6);
        a.next.next.next.next.next.next = new Node(7);

        int k = 3; 
        Node result = rotate(a, k);
        printlist(result); // Expected output: 5 6 7 1 2 3 4
    }
}
