package LinkedList.singleLinkedList;
import java.util.*;

public class loopInLL {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println(loop(head));
    }

    //brute force solution
    public static boolean loop(Node head){
        Node temp = head;
        Map<Node, Integer> map = new HashMap<>();
        while (temp != null){
            if (map.containsValue(temp)){
                return true;
            }
            map.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }

    //optimal solution
    public static boolean loop2(Node head){
        Node slow = head;
        Node fast = head;

        while (slow != null){

            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
