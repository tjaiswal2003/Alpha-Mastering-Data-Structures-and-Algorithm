public class MergeSort {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Insert at end
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    // Print list
    void printList(Node headref) {
        while (headref != null) {
            System.out.print(headref.data + " ");
            headref = headref.next;
        }
        System.out.println();
    }

    // Merge two sorted lists
    Node sortedMerge(Node a, Node b) {
        Node result;
        if (a == null) return b;
        if (b == null) return a;

        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    // Get middle node
    Node getMiddle(Node head) {
        if (head == null) return head;

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge sort function
    Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;

        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        return sortedMerge(left, right);
    }

    public static void main(String[] args) {
        MergeSort li = new MergeSort();

        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);

        System.out.println("Unsorted Linked List:");
        li.printList(li.head);

        li.head = li.mergeSort(li.head);

        System.out.println("Sorted Linked List:");
        li.printList(li.head);
    }
}
