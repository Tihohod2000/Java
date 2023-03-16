import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели (1 - понедельник, 2 - вторник, и т.д.): ");
        int dayNumber = scanner.nextInt();

        String dayName = getWeekdayName(dayNumber);

        System.out.println("День недели: " + dayName);
    }

    public static String getWeekdayName(int dayNumber) {
        String dayName;
        String[] week = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        if (dayNumber <= 7 && dayNumber > 0) {
            dayName = week[dayNumber - 1];
            return dayName;
        } else {
            dayName = "Некорректный ввод";
            return dayName;
        }
    }
}
