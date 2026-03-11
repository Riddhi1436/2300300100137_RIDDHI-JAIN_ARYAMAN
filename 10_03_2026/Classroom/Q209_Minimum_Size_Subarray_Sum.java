import java.util.*;
public class Q209_Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();   
        int n = sc.nextInt();        
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0; right < n; right++) {
            sum += nums[right];
            while(sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(minLen == Integer.MAX_VALUE)
            System.out.println(0);
        else
            System.out.println(minLen);
        sc.close();
    }
}