import java.util.*;
public class GFG_Max_Sum_Subarray_of_size_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0, maxSum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
            if(i >= k)
                sum -= arr[i-k];
            if(i >= k-1)
                maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}