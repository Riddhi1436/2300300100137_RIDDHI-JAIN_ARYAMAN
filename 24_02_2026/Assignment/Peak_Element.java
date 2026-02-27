public class Peak_Element {

    public static int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;        // Peak in left
            } else {
                start = mid + 1;  // Peak in right
            }
        }

        return start; // or end (both same)
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        int peakIndex = findPeakElement(nums);

        System.out.println("Peak Index: " + peakIndex);
        System.out.println("Peak Element: " + nums[peakIndex]);
    }
}