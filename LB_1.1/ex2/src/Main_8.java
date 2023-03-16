import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");
        List<String> palindromes = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPalindromePair(words[i], words[j])) {
                    palindromes.add(words[i] + " - " + words[j]);
                }
            }
        }

        if (palindromes.isEmpty()) {
            System.out.println("В тексте нет пар палиндромов.");
        } else {
            System.out.println("Найдены следующие пары палиндромы:");
            for (String pair : palindromes) {
                System.out.println(pair);
            }
        }
    }

    public static boolean isPalindromePair(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(s2.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
