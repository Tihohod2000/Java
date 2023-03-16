import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.println("Текст со заменой букв на их номера:");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) { // проверяем, является ли символ буквой
                int num = Character.toLowerCase(c) - 'а' + 1; // вычисляем номер буквы
                System.out.print(num + "  "); // выводим номер буквы с двумя пробелами
            } else {
                System.out.print(c + "  "); // если символ не является буквой, выводим его без изменений
            }
        }
    }
}
