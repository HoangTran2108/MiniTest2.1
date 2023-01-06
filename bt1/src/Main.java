import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập vào 1 số: ");
        number = scanner.nextInt();
        int i = 2;
        while(i < number) {
            int j = 2;
            while(j < i) {
                if(i % j == 0) {
                    break;
                } else {
                    j++;
                }
            }
            if(j == i) {
                System.out.println(i);
            }
            i++;
        }
    }
}