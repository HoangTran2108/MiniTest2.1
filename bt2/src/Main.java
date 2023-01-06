public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 5, 4, 3, 2, 1, 0};
        int sum = 0;
        int max = arr[0];
        for (int x : arr) {
            sum += x;
            if( max < x) {
                max = x;
            }
        }
        System.out.println("Tổng của mảng là: " + sum);
        System.out.println("Số lớn nhất là: " + max);
    }
}