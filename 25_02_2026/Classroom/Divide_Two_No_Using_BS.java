public class Divide_Two_No_Using_BS {
    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long low = 0;
        long high = a;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * b <= a) {
                ans = mid;        
                low = mid + 1;    
            } else {
                high = mid - 1;   
            }
        }

        return isNegative ? (int)(-ans) : (int)(ans);
    }

    public static void main(String[] args) {
        int dividend = 22;
        int divisor = 3;

        System.out.println("Quotient: " + divide(dividend, divisor));
    }
}