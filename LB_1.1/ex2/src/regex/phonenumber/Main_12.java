package regex.phonenumber;

import java.util.Scanner;

public class Main_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество точек на плоскости: ");
        int n = scanner.nextInt();
        int[][] points = new int[n][2];//двумерный массив для X и Y

        //Заполнение массива
        for (int i = 0; i < n; i++) {
            System.out.println("Введите координаты точки " + (i + 1) + ": ");
            System.out.print("X==> ");
            points[i][0] = scanner.nextInt();
            System.out.print("Y==> ");
            points[i][1] = scanner.nextInt();
        }

        double minDistance = Double.MAX_VALUE; // минимальное расстояние
        int index = 0; // индекс точки с минимальной суммой расстояний

        for (int i = 0; i < n; i++) {
            double distanceSum = 0; // сумма расстояний от текущей точки до остальных

            for (int j = 0; j < n; j++) {
                if (i != j) { // если точки разные
                    // считаем расстояние между точками
                    double d = Math.sqrt(Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));

                    distanceSum += d; // Суммируем расстояние
                }
            }

            if (distanceSum < minDistance) { // если сумма расстояний меньше текущего минимального
                minDistance = distanceSum; // сохраняем новое минимальное расстояние
                index = i; // сохраняем индекс точки
            }
        }

        System.out.println("Точка с минимальной суммой расстояний до остальных: №" + (index + 1) + " (" + points[index][0] + ", " + points[index][1] + ")");
    }
}