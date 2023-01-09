import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập 1 số : ");
        int numbers = scanner.nextInt();

        System.out.println("Số nguyên tố nhỏ hơn " + numbers + " là: ");
        int n = 2;
        while (n < numbers) {
            if (checkPrime(n)) {
                System.out.println(n);
            }
            n++;
        }

    }

    public static boolean checkPrime(int i) {
        if (i < 2) {
            return false;
        }
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}