public class Main {
    public static void main(String[] args) {
        int[] a = {6, 7, 8, 9, 5, 4, 3, 2, 1, 0};
        System.out.println("Tổng của mảng là: " +sumArr(a));
        System.out.println("Giá trị lớn nhất trong mảng là: " + maxArr(a));
    }
    public static int sumArr (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public  static int maxArr(int[] arr) {
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        } return max;
    }
}