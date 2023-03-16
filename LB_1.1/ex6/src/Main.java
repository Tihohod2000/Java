import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        String result = text.replaceAll("[a-zA-Zа-яА-Я]", "");

        System.out.println("Результат: " + result);
    }
}
