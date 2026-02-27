public class BS_Sqrt {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }
            else if (square < x) {
                ans = mid;       
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return ans; 
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println("Square Root: " + mySqrt(x));
    }
}