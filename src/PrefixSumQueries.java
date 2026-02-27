import java.util.Scanner;

public class PrefixSumQueries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, l, r, sum, q;

        System.out.println("Enter the number of elements:");
        n = sc.nextInt();

        int[] arr = new int[n];
        int[] prefix = new int[n];

        // Reading array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element:");
            arr[i] = sc.nextInt();
        }

        // Building prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Printing prefix sum array
        System.out.println("The prefix sum array is:");
        for (int i = 0; i < n; i++) {
            System.out.println(prefix[i] + " ");
        }

        // Queries
        System.out.println("Enter the number of queries:");
        q = sc.nextInt();

        while (q > 0) {

            System.out.println("Enter the leftmost index of range:");
            l = sc.nextInt();

            System.out.println("Enter the rightmost index of range:");
            r = sc.nextInt();

            if (l > 0) {
                sum = prefix[r] - prefix[l - 1];
            } else {
                sum = prefix[r];
            }

            System.out.println("The sum of elements from l to r: " + sum);

            q--;
        }

        sc.close();
    }
}