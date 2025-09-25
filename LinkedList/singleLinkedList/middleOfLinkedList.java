package LinkedList.singleLinkedList;

//https://leetcode.com/problems/middle-of-the-linked-list/

public class middleOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node temp = middleOfLL2(head);
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

    //brute force using simple traversal
    //Time Complexity: O(N+N/2)
    public static Node middleOfLL(Node head){
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        int mid = (count / 2) + 1;
        temp = head;
        while (temp != null){
            mid = mid - 1;
            if (mid == 0){
                break;
            }
            temp = temp.next;
        }
        return temp;
    }

    //optimal solution using tortoise and hare
    //Time Complexity: O(N/2
    //Space Complexity : O(1)
    public static Node middleOfLL2(Node head){
        Node slow = head;
        Node fast = head;
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
