import java.util.Scanner;

public class BT05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int min = 99;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.println(max +" - "+ min);
    }
}
