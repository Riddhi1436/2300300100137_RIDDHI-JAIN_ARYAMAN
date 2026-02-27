public class Floor_Of_No_In_Sorted_Array {
    public static int findFloor(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;   

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return arr[mid];   
            }
            if (arr[mid] < target) {
                ans = arr[mid];   
                low = mid + 1;  
            } else {
                high = mid - 1;   
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8, 10};
        int target = 5;

        System.out.println("Floor: " + findFloor(arr, target));
    }
}