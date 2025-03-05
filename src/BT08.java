public class BT08 {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 100, 200, 400};
        int n = 0;

        // Đếm số phần tử chỉ xuất hiện 1 lần
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                n++;
            }
        }
        int[] arr2 = new int[n];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                arr2[index] = arr[i];
                index++;
            }
        }
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
