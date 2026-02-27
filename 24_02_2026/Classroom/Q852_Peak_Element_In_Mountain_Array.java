public class Q852_Peak_Element_In_Mountain_Array {

    public static int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is less than next element,
            // peak lies on right side
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } 
            // Otherwise peak lies on left side including mid
            else {
                high = mid;
            }
        }

        // low == high is the peak index
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 3, 1};
        System.out.println("Peak Index: " + peakIndexInMountainArray(arr));
    }
}