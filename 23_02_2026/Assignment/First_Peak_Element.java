public class First_Peak_Element {

    public static int findFirstPeak(int[] arr) {

        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        if (arr[0] >= arr[1]) {
            return 0;
        }
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }

        return -1; 
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int index = findFirstPeak(arr);

        if (index != -1) {
            System.out.println("First Peak Element: " + arr[index]);
            System.out.println("Index: " + index);
        } else {
            System.out.println("No Peak Element Found");
        }
    }
}