public class Q153_Min_Pivot_Element {

    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than high,
            // minimum is in right half
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } 
            // Otherwise minimum is in left half (including mid)
            else {
                high = mid;
            }
        }

        // low == high -> index of minimum element
        return nums[low];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum Pivot Element: " + findMin(arr));
    }
}