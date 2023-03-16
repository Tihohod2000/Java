import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        int count_line = 0;
        int count = 0;
        scanner.nextLine(); // чтение символа новой строки после числа

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i+1) + ": ");
            strings[i] = scanner.nextLine();
            count_line += strings[i].length();//Сумма длинн
        }
        count = count_line/n;//Средняя длинна

        // Вывод отсортированных строк
        System.out.println("Отсортированные строки:");
        for (String s : strings) {
            if (s.length()<count){
                System.out.println(s);
            }
        }
        scanner.close();
    }
}