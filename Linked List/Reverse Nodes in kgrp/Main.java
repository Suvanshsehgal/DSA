public class Main {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
}
    public static Node reversek(Node head, int k){
        if(head == null || k <= 1){
            return head;
        }
        Node dummy = new Node(0);
        Node temp = dummy ; 
        Node curr = head;                            
        while(curr != null ){
            Node checknode = curr; 
            for(int i = 0 ; i< k ; i++){
                if(checknode == null){
                    return dummy.next;
                }
                checknode = checknode.next; 
            }
            temp.next = reverse(curr, k);
            curr.next = checknode;
           for(int i = 0 ; i<k ; i++){
            temp = temp.next;
           }
           curr = checknode;
        }
        return dummy.next;
    }
    private static Node reverse(Node head , int k){
        if(k ==1 || head == null){
            return head;
        }
        Node nh = reverse(head.next, --k);
        Node front = head.next; 
        front.next = head; 
        head.next = null; 

        return nh; 
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

        Node result = reversek(a, k);
        printlist(result);
    }
}
