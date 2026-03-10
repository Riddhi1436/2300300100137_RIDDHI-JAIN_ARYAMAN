public class Q239_Sliding_Window_Max {
    int maxSum(int[] arr, int k) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <= n - k; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    
}
