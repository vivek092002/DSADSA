package LinkedList.singleLinkedList;

public class insertAtHead {
    public static void main(String[] args) {
        Node node = new Node(0);
        node.next = new Node(1);
        node.next.next = new Node(2);

        //insert at the head
        int temp = 5;
        insertHead(node, temp);
        print(node);
    }

    public static void print(Node head){
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static Node insertHead(Node head, int data){
        Node temp = new Node(data, head);
        temp.next = head;
        return head;
    }
}
