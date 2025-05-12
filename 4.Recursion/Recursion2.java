import java.util.Scanner;
public class Recursion2{
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstOccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1 ;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr,key,i+1);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the array to check the array is sorted or not  : ");
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key");
        int key = sc.nextInt();
        // if(isSorted(arr,size)){
        //     System.out.println("The array is sorted");
        // }else{
        //     System.out.println("The array is not sorted");
        // }
        int FirstOccurance = firstOccurance(arr,key,size=0);
        System.out.println(FirstOccurance+1);
    }
}