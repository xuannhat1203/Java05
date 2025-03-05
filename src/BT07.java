public class BT07 {
    public static void main(String[] args) {
        int[] arr = {5,8,11,14,7,6,9};
        for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if (arr[j] % 2 == 0 && arr[i] % 2 != 0) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
