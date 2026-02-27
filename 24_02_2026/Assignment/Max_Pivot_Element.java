public class Max_Pivot_Element {

    public static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1: mid is pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: mid-1 is pivot
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Case 3: Left side is sorted → pivot in right
            if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Not rotated
    }

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,0,1,2};
        int pivotIndex = findPivot(nums);

        if (pivotIndex != -1) {
            System.out.println("Pivot Index: " + pivotIndex);
            System.out.println("Pivot Element: " + nums[pivotIndex]);
        } else {
            System.out.println("Array is not rotated");
        }
    }
}