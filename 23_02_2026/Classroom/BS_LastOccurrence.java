public class BS_LastOccurrence {

    public static int findLastOccurrence(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid;        
                start = mid + 1;  
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,2,2,3,4,5};
        int target = 2;

        System.out.println("Last Occurrence Index: " + findLastOccurrence(nums, target));
    }
}