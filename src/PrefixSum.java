import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int[] a = new int[10];
        int[] prefix = new int[10];

        System.out.println("Enter number of elements of array:");
        n = sc.nextInt();

        // Reading the array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element:");
            a[i] = sc.nextInt();
        }

        // Prefix of first element is the element itself
        prefix[0] = a[0];

        // Prefix sum logic
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }

        // Printing the prefix sum array
        System.out.println("The prefix sum array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }

        sc.close();
    }
}