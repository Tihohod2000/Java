import java.util.Scanner;

public class Main_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.println("Введите длину слов:");
        int length = scanner.nextInt();
        scanner.close();

        String[] words = text.split("\\s+");
        String result = "";

        for (String word : words) {
            if (word.length() != length || !isConsonant(word.charAt(0))) {
                result += word + " ";
            }
        }

        System.out.println(result.trim());
    }

    public static boolean isConsonant(char c) {
        return "йцфывчксмпнртгшлбдщзжЙЦФЫВЧКСМПНРТГШЛБДЩЗЖ".indexOf(c) != -1;
    }
}
