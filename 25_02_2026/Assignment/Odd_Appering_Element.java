public class Odd_Appering_Element {

    public static int findOdd(int[] arr) {
        int result = 0;

        for (int num : arr) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 5, 5, 3, 2};
        System.out.println("Odd Appearing Element: " + findOdd(arr));
    }
}
