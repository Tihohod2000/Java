import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // чтение символа новой строки после числа

        String shortest = null;
        int shortestLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i+1) + ": ");
            String line = scanner.nextLine();

            if (line.length() < shortestLength) {
                shortest = line;
                shortestLength = line.length();
            }
        }

        System.out.println("Самая короткая строка: " + shortest);
        System.out.println("Длина строки: " + shortestLength);

        scanner.close();
    }
}
