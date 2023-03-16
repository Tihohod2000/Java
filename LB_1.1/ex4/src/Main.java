import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Введите номер буквы, которую нужно заменить: ");
        int k = scanner.nextInt();

        scanner.nextLine(); // чтение символа новой строки после числа

        System.out.print("Введите символ, на который нужно заменить букву: ");
        char replacement = scanner.nextLine().charAt(0);

        String[] words = text.split("\\s+"); // разбиваем текст на слова

        // Замена k-й буквы в каждом слове
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (k <= word.length()) {
                char[] chars = word.toCharArray();
                chars[k-1] = replacement;
                words[i] = new String(chars);
            }
        }

        // Вывод текста с замененными буквами
        System.out.println("Текст с замененными буквами:");
        for (String word : words) {
            System.out.print(word + " ");
        }

        scanner.close();
    }
}
