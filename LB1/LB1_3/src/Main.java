import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // создаем отсортированный массив чисел
        int[] numbers = {1, 4, 6, 7, 9, 11, 12, 15, 18, 20};
        System.out.println("Отсортированный массив чисел: " + Arrays.toString(numbers));

        // запрашиваем у пользователя число для поиска
        System.out.print("Введите число для поиска: ");
        int target = scanner.nextInt();

        // выполняем бинарный поиск числа в массиве
        int index = binarySearch(numbers, target);

        // выводим результат поиска
        if (index == -1) {
            System.out.println("Число " + target + " не найдено в массиве.");
        } else {
            System.out.println("Число " + target + " найдено в массиве на позиции " + index);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
