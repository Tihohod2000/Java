import java.util.Scanner;
public class Main_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // чтение символа новой строки после числа

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i+1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Сортировка строк по длине
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (strings[i].length() > strings[j].length()) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        // Вывод отсортированных строк
        System.out.println("Отсортированные строки:");
        for (String s : strings) {
            System.out.println(s);
        }

        scanner.close();
    }
}