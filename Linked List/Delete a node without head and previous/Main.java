public class Main {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Solution {
        public void deleteNode(Node node){
        if(node ==null || node.next == null){
            return;
        }
        node.data = node.next.data;
        node.next = node.next.next;
    }
    }
    

    public static void printlist(Node head){
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

        System.out.println("Original List:");
        printlist(head);

        Solution sol = new Solution();
        sol.deleteNode(head.next.next); 
        System.out.println("List after deleting node with value 3:");
        printlist(head);

    }
}
