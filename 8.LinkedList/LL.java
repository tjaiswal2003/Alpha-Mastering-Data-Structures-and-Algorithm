
public class LL {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class MyLinkedList {

        public Node head;
        public Node tail;
        private int size = 0;

        // Method to print the linked list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Add first - O(1)
        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                size = 1;
                return;
            }
            newNode.next = head;
            head = newNode;
            size++;
        }

        // Add at given index - O(n)
        public void add(int idx, int data) {
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }

        // Add last - O(1)
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                size = 1;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            size++;
        }

        // Remove the node from first
        public int removeFirst() {
            if (size == 0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        // Remove the node from the last
        public int removeLast() {
            if (size == 0) {
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            Node prev = head;
            while (prev.next != tail) {
                prev = prev.next;
            }
            int val = tail.data;
            tail = prev;
            tail.next = null;
            size--;
            return val;
        }

        // Search for a key
        // Iterative - O(n)
        public int itrSearch(int key) {
            Node temp = head;
            int i = 0;
            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }
            // Key not found
            return -1;
        }

        // Recursive - O(n)
        public int recSearch(Node head, int key) {
            if (head == null) {
                return -1;
            }
            if (head.data == key) {
                return 0;
            }
            int idx = recSearch(head.next, key);
            if (idx == -1) {
                return -1;
            }
            return idx + 1;
        }

        // Reverse a LinkedList (Iterative) - O(n)
        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        // Check if LL is a palindrome - TC - O(n) SC - O(1)
        // Slow Fast approach (works on both even or odd)
        public Node findMid(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next; // +1
                fast = fast.next.next; // +2
            }
            return slow; // slow is my mid node
        }

        public boolean checkPalindrome() {
            if (head == null || head.next == null) {
                return true;
            }
            // Find mid
            Node mid = findMid(head);
            // Reverse 2nd half
            Node curr = mid;
            Node prev = null;
            while (curr != null) {
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev;
            Node left = head;
            // Check if equal
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
    }

    // Detect a loop/cycle in a LL
    public static boolean isCycle(MyLinkedList list) {
        Node slow = list.head;
        Node fast = list.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle exists
            }
        }
        return false; // Cycle does not exist
    }

    // Remove a loop/cycle in a LL
    public static void removeCycle(MyLinkedList list) {
        // Detect cycle
        Node slow = list.head;
        Node fast = list.head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {
            return;
        }
        // Finding meeting point
        slow = list.head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        // Remove cycle
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null;
    }

    public static void main(String[] args) {
        // Separate section for palindrome check
        MyLinkedList palindromeList = new MyLinkedList();
        palindromeList.addLast(1);
        palindromeList.addLast(2);
        palindromeList.addLast(2);
        palindromeList.addLast(1);

        // Print the linked list for palindrome check
        System.out.println("Palindrome Linked List:");
        palindromeList.printList();

        // Check if the linked list is a palindrome
        System.out.println("Is the linked list a palindrome?: " + palindromeList.checkPalindrome());

        // General list operations
        MyLinkedList list = new MyLinkedList();

        list.addLast(1);
        list.addLast(2);

        // Print the linked list
        System.out.println("Linked List:");
        list.printList();

        // Adding more elements
        list.addFirst(0);
        list.addLast(3);
        list.add(2, 5); // Adding 5 at index 2

        // Print the linked list after adding elements
        System.out.println("Updated Linked List:");
        list.printList();

        // Removing elements
        list.removeFirst();
        list.removeLast();

        // Print the linked list after removing elements
        System.out.println("Linked List after removals:");
        list.printList();

        // Search for a key
        int key = 2;
        int index = list.itrSearch(key);
        System.out.println("Key " + key + " found at index (Iterative): " + index);

        key = 5;
        index = list.recSearch(list.head, key);
        System.out.println("Key " + key + " found at index (Recursive): " + index);

        // Reverse the linked list
        list.reverse();
        System.out.println("Reversed Linked List:");
        list.printList();

        // Check if the updated linked list is a palindrome
        System.out.println("Is the updated linked list a palindrome?: " + list.checkPalindrome());

        // Create a cycle for testing
        Node cycleNode1 = new Node(6);
        Node cycleNode2 = new Node(7);
        Node cycleNode3 = new Node(8);
        list.head.next = cycleNode1;
        cycleNode1.next = cycleNode2;
        cycleNode2.next = cycleNode3;
        cycleNode3.next = cycleNode1; // Creates a cycle

        // Detect and remove the cycle
        System.out.println("Cycle detected?: " + isCycle(list));
        removeCycle(list);
        System.out.println("Cycle detected after removal?: " + isCycle(list));

        // Print the list after removing the cycle to ensure it's correct
        System.out.println("Linked List after cycle removal:");
        list.printList();
    }
}
