package LinkedList.singleLinkedList;

import java.util.Stack;

public class reverseLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node temp = reverse(head);
        traversal(temp);

    }

    public static void traversal(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "- > ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //brute force method
    //we can use stack
    public static Node reverse(Node head){
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp!= null){
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    //optimal solution
    public static Node reverse2(Node head){
        Node prev = null;
        Node temp = head;
        while (temp != null){
            Node front = temp;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
