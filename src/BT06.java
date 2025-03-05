public class BT06 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] markingArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            int count = 0;
            for (int j = 0; j < originalArray.length; j++) {
                if (originalArray[i] == originalArray[j]) {
                    count++;
                }
            }
            markingArray[i] = count;
        }

        int max = markingArray[0];
        for (int i = 1; i < markingArray.length; i++) {
            if (markingArray[i] > max) {
                max = markingArray[i];
            }
        }
        boolean[] printed = new boolean[originalArray.length];

        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] == max && !printed[i]) {
                System.out.print(originalArray[i] + " (xuất hiện " + max + " lần), ");
                for (int j = i; j < originalArray.length; j++) {
                    if (originalArray[j] == originalArray[i]) {
                        printed[j] = true;
                    }
                }
            }
        }
    }
}
