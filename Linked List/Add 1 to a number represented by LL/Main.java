public class Main {
    static class Node{
        int data ; 
        Node next ; 
        Node(int data){
            this.data = data; 
            this.next = null; 
        }
    }
    public static Node addone(Node head){
        Node nh = reverse(head);
        Node curr = nh ;
        while(curr != null){
            curr.data += 1;
            if(curr.data < 10){
                break;  
        } 
        else{
            curr.data = 0; 
            if(curr.next == null){
                curr.next = new Node(1);
                break; 
            }
            curr = curr.next; 
        }
    }
        return reverse(nh);
    }
    private static Node reverse(Node head){
        if(head == null || head.next == null){
            return head; 
        }
        Node nh = reverse(head.next);
        Node front = head.next; 
        front.next = head; 
        head.next = null;
        return nh;
    }
    public static void printlist(Node head){
        Node curr = head; 
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next; 
        }
        }
        public static void main(String[] args) {
        Node head = new Node(9);    
        head.next = new Node(9);
        head.next.next = new Node(9);       
        head = addone(head);
        printlist(head);
    }
}
