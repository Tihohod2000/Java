import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimalNumber;
        do {
            System.out.print("Введите десятичное число (для выхода введите 0): ");
            decimalNumber = scanner.nextInt();
            if (decimalNumber != 0) {
                String binaryNumber = decimalToBinary(decimalNumber);
                System.out.println("Двоичное представление числа " + decimalNumber + " : " + binaryNumber);
            }
        } while (decimalNumber != 0);
    }

    public static String decimalToBinary(int decimalNumber) {
        String binaryNumber = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;
            decimalNumber /= 2;
        }
        return binaryNumber;
    }
}
