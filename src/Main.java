import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        1.Khai báo và  khởi tạo mảng số nguyên 1 chiều gồm 100 phần tử
        2. Xây dựng ứng dụng java console in menu và thực hiện chức năn theo menu
        1. nhap giá trị các ptu mang
        2.In gtri cac ptu mảng
        3. tính tổng các phân tử mảng
        4. in ra các phần tử chia hết cho 3 và tính tổng
        5. in ra các ptu la số nguyên tô và tính tổng
        6. thoát
        */

        // khai báo va khơi tao mang 1 chều số nguyên gồm 100 phan tử
        int[] numbers = new int[100];
        // in menu va thuc hien cac chuc nang theo menu
        Scanner scanner = new Scanner(System.in);
        int currentIndex = 0;
        do {
            System.out.println("****************:Menu***************");
            System.out.println("1. nhap giá trị các ptu mang ");
            System.out.println("2. In gtri cac ptu mảng ");
            System.out.println("3. tính tong các phân tử mảng ");
            System.out.println("4. in ra các phần tử chia hết cho 3 và tính t��ng ");
            System.out.println("5. in ra các ptu la số nguyên tô và tính t��ng ");
            System.out.println("6. thoát ");
            System.out.print("Moi bạn chọn chức năng: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // nhap gtri cac ptu mang
                    System.out.println("Nhap so luong phan tu cua mang: ");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.printf("numbers[%d]=", currentIndex);
                        numbers[currentIndex] = scanner.nextInt();
                        currentIndex++;
                    }
                    break;
                case 2:
                    // in gtri cac ptu mang
                    System.out.println("Gia tri cac phan tu cua mang la:");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.printf("%d", numbers[i]);
                    }
                    break;
                case 3:
                    // tinh tong cac phan tu mang
                    int sum = 0;
                    for (int i = 0; i < currentIndex; i++) {
                        sum += numbers[i];
                    }
                    System.out.println("Tong cac phan tu cua mang la: " + sum);
                    break;

                case 4:
                    int sum2 = 0;
                    for (int i = 0; i < numbers.length; i++) {
                        if (numbers[i] % 3 == 0) {
                            System.out.println(numbers[i]);
                            sum2 += numbers[i];
                        }
                    }
                    System.out.println(sum2);
                    break;
                case 5:
                    int sum3 = 0;
                    System.out.println("Cac so nguyen to trong mang la:");
                    for (int i = 0; i < currentIndex; i++) {
                        int num = numbers[i];
                        if (num < 2) continue;
                        boolean isPrime = true;
                        for (int j = 2; j <= Math.sqrt(num); j++) {
                            if (num % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.print(num + " ");
                            sum3 += num;
                        }
                    }
                    System.out.println("\nTong cac so nguyen to: " + sum3);
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        } while (true);
    }
}