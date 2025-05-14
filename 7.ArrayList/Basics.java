import java.util.ArrayList;
import java.util.Collections;

public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // Add element - O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        int element = list.get(2); // Get element - O(1)
        System.out.println(element);

        list.remove(2); // Remove elements - O(n)
        System.out.println(list);

        list.set(2, 10); // Set elements at index - O(1)
        System.out.println(list);

        System.out.println(list.contains(1)); // Contains elements - O(n)
        System.out.println(list.size()); // Size of ArrayList

        // Print the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Print reverse of ArrayList - O(n)
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Maximum in ArrayList
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max element = " + max);

        // Swap elements at index 1 and 3
        swap(list, 1, 3);
        System.out.println("After swapping elements at index 1 and 3: " + list);
        Collections.sort(list);// ascending order
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());// descending order
        System.out.println(list);
    }

    // Method to swap two elements in the ArrayList
    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
