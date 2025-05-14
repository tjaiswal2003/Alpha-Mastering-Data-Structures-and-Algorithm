import java.util.*;
public class Basics2{
    public static void main(String args[]) {
        // Initialize mainList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        // Print mainList
        System.out.println("mainList:");
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        // Initialize tableList
        ArrayList<ArrayList<Integer>> tableList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            ArrayList<Integer> table1 = new ArrayList<>();
            table1.add(i * 1);
            table1.add(i * 2);
            table1.add(i * 3);
            tableList.add(table1);
        }

        // Print tableList
        System.out.println("tableList:");
        for (int i = 0; i < tableList.size(); i++) {
            ArrayList<Integer> currentList = tableList.get(i);
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
