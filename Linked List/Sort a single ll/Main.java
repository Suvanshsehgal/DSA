public class Main {
    static class Node{
        int data; 
        Node next; 
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node merge(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = middle(head);
        Node righth = mid.next; 
        mid.next = null; 

        Node left = merge(head);
        Node right = merge(righth);

        return mergesort(left,right);

    }

    private static Node middle(Node head){
        Node slow = head; 
        Node fast = head.next; 
        while(fast != null && fast.next!= null){
            slow = slow.next; 
            fast = fast.next.next;
        }
        return slow ; 
    }

    private static Node mergesort(Node left, Node right){
        Node dummy = new Node(-1);
        Node temp = dummy;

        while(left != null && right != null){
            if(left.data<=right.data){
                temp.next = left;
                left = left.next;
            }
            else{
                temp.next = right; 
                right = right .next; 
            }

            temp = temp.next;
        }
        if(left != null)temp.next = left; 
        else temp.next = right; 

        return dummy.next; 
    }
    public static void printList(Node head){
        Node temp = head; 
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next; 
        }
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);
        head = merge(head);
        printList(head);
        
    }
}
