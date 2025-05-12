public class QuickSort {
    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);//Left part
        quickSort(arr, pIdx + 1, ei);//Right part
    }

    //Function to partition the array
    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i+1] and arr[ei] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;
        return i + 1;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 5, 2, 7, 3, 0, 5, 4};
        System.out.println("Unsorted array: ");
        printArr(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        printArr(arr);
    }
}
