import java.util.*;
public class Search_In_A_2D_Matrix {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();
        int target = sc.nextInt();
        int start = 0, end = r * c - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int row = mid / c;
            int col = mid % c;
            if (mat[row][col] == target) {
                System.out.println("Found");
                sc.close();
                return;   
            } 
            else if (mat[row][col] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        System.out.println("Not Found");
        sc.close();
    }
}