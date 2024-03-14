import java.util.*;

public class lowerTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];

        // Reading elements into the array
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the lower triangle
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> list_in = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                list_in.add(arr[i][j]);
            }
            System.out.println(list_in);
        }
    }
}
