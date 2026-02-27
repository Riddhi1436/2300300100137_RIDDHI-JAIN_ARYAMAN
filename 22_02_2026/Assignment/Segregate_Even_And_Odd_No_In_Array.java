public class Segregate_Even_And_Odd_No_In_Array {
    public static void segregate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};

        segregate(arr);

        System.out.println("Array after segregation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}