public class Search_In_Nearly_Sorted_Array {

    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            if (mid - 1 >= low && arr[mid - 1] == target)
                return mid - 1;
            if (mid + 1 <= high && arr[mid + 1] == target)
                return mid + 1;
            if (arr[mid] > target)
                high = mid - 2;   
            else
                low = mid + 2;    
        }

        return -1;  
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 40};
        int target = 20;

        System.out.println("Index: " + search(arr, target));
    }
}