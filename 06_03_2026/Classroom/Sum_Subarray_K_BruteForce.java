import java.util.*;
public class Sum_Subarray_K_BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = 3;
        System.out.println("Sum of subarrays of size " + k + " :");
        for(int i = 0; i <= n - k; i++){
            int sum = 0;
            for(int j = i; j < i + k; j++){
                sum += arr[j];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}