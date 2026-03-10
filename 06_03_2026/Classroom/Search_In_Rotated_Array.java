import java.util.*;
public class Search_In_Rotated_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,6,7,0,1,2};
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
                return;
            }
            if (arr[s] <= arr[mid]) {
                if (target >= arr[s] && target < arr[mid]) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            } 
            else {
                if (target > arr[mid] && target <= arr[e]) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }
        System.out.println("Element not found");
    }
}