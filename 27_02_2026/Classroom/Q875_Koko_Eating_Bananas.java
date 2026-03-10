import java.util.Scanner;
public class Q875_Koko_Eating_Bananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int p : piles) {
            if (p > max) {
                max = p;
            }
        }
        for (int k = 1; k <= max; k++) {
            long hours = 0;
            for (int p : piles) {
                hours += (p + k - 1) / k;   
            }
            if (hours <= h) {
                return k;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();
        int[] piles = new int[n];
        System.out.println("Enter bananas in each pile:");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }
        System.out.print("Enter number of hours (h): ");
        int h = sc.nextInt();
        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);
        sc.close();
    }
}