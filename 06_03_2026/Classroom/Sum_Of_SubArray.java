public class Sum_Of_SubArray {
    public static void main (String[] args) {
        int[] arr = {1, 7, 6, 6, 5};
        int n = arr.length;
        int k = 3;
        System.out.println("Sum of subarrays of size " + k + " :");
        for(int i = 0; i <= n - k; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += arr[j];
                int maxSum = sum;
            }
            System.out.println(maxSum);
        }

    }
}
