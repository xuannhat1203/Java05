import java.util.Scanner;

public class BT05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean check = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0 && arr[i] > 0) {
                check = true;
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }

        if (check) {
            System.out.println(max + " - " + min);
        } else {
            System.out.println("Không có phần tử lẻ trong mảng");
        }

        sc.close();
    }
}
