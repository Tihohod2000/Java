import java.io.IOException;
import java.util.Scanner;

public class Main_6 {
    public static void main(String[] args) throws IOException {
        String text = "";
        System.out.println("Введите текст");
        Scanner sc1 = new Scanner(System.in);
        text = sc1.nextLine();

//Преобразуем текст в массив char'ов
        char[] charArray = text.toCharArray();
        char repit = ' ';
//Удаляем в тексте не нужные символы и выводим в консоль с 1 пробелом
        for (char x : charArray) {

            if (Character.isLetter(x) || x == ' ') {
                if (x == repit){
                    System.out.print(" " + x);
                    repit = ' ';
                }else {
                    System.out.print(x);
                    repit = x;
                }
            }
        }



    }
}