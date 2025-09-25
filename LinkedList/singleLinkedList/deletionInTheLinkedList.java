package LinkedList.singleLinkedList;

public class deletionInTheLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(8);
        head.next.next = new Node(9);
        head.next.next.next = new Node(3);

        int x = 3;
        Node temp = deletingTheKthElement(head,x);
        traversal(temp);
    }

    //traversal of LL
    public static void traversal(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "- > ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //delete the first node
    public static Node deletingFirstNode(Node head){
        if (head == null){
            return head;
        }
        head = head.next;
        return head;
    }

    //deleting the last node
    public static Node deletingLastNode(Node head){
        if (head == null || head.next==null){
            return null;
        }

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //deleting the kth element
    public static Node deletingTheKthElement(Node head, int x){
        if (head == null){
            return null;
        }
        if (x == 1){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        int count = 0;
        while (temp != null){
            count++;
            if (count == x){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    //deleting the number given
    public static Node deletingTheElement(Node head, int val){
        if (head == null || head.next == null){
            return null;
        }
        if (head.data == val){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null){
            temp = temp.next;
            if (temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
