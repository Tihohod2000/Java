import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {14, 30, 103};
        int[] sort_arr = new int[arr.length];
        int[] sort_arr2 = new int[arr.length];
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        digitSum(arr, sort_arr, sort_arr2);
        System.out.println("Отсортированный массив: " + Arrays.toString(sort_arr2));
    }

    // функция для вычисления суммы цифр числа
    public static int digitSum(int[] arr, int[] sort_arr, int[] sort_arr2) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int n = arr[i];
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            sort_arr[i] = sum;
        }
        System.out.println("unsorted: " + Arrays.toString(sort_arr));

        sort_arr = Arrays.stream(sort_arr).sorted().toArray();
        System.out.println("sorted: " + Arrays.toString(sort_arr));

        int k = 0;
        while (k < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                int n = arr[i];
                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }
                if (k < arr.length && sort_arr[k] == sum) {
                    sort_arr2[k] = arr[i];
                    k++;
                }
            }
        }
        return 0;
    }
}

