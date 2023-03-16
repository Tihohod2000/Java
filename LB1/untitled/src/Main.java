import java.util.Arrays;
public class Main {




    public static void main(String[] args) {

        int[] x = new int[20];
        int[] y = new int[15];
        int[] z = new int[10];

        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 21) - 10;
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = (int) (Math.random() * 21) - 10;
        }
        for (int i = 0; i < z.length; i++) {
            z[i] = (int) (Math.random() * 21) - 10;
        }

        double xAvg = averagePositive(x);
        double yAvg = averagePositive(y);
        double zAvg = averagePositive(z);

        System.out.println("Среднее арифметическое положительных элементов массива X: " + xAvg);
        System.out.println("Среднее арифметическое положительных элементов массива Y: " + yAvg);
        System.out.println("Среднее арифметическое положительных элементов массива Z: " + zAvg);
    }


    public static double averagePositive(int[] arr) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
                sum += arr[i];
            }
        }
        if (count == 0) {
            return 0; // если нет положительных элементов, вернуть 0
        } else {
            return sum / count;
        }
    }
}