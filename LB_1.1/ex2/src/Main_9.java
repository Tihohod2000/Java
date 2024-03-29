import java.util.HashMap;
import java.util.Map;

public class Main_9 {

    public static void main(String[] args) {
        String text = "Эта книга адресована всем, кто изучает русский язык. " +
                "Но состоит она не из правил, упражнений и учебных текстов. " +
                "Для этого созданы другие замечательные учебники. " +
                "У этой книги совсем иная задача. " +
                "Она поможет вам научиться не только разговаривать, но и размышлять по-русски. " +
                "Книга, которую вы держите в руках, составлена из афоризмов и размышлений великих мыслителей, " +
                "писателей, поэтов, философов и общественных деятелей различных эпох. " +
                "Их мысли - о тех вопросах, которые не перестают волновать человечество. " +
                "Вы можете соглашаться или не соглашаться с тем, что прочитаете в этой книге. " +
                "Возможно, вам покажется, что какие-то мысли уже устарели. " +
                "Но вы должны обязательно подумать и обосновать, почему вы так считаете. " +
                "А еще вы узнаете и почувствуете, как прекрасно звучат слова любви, " +
                "сострадания, мудрости и доброты на русском языке.";

        // Разбиваем текст на слова и конвертируем все символны в символы нижнего регистра
        text = text.replaceAll("[^а-яА-Я ]", "").toLowerCase();

        // Заполняем массив словами
        String[] words = text.split("\\s+");

        // Добавляем слова в HashMap
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // Print word counts
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }

}
