package geometry;

import java.util.Scanner;

public class Main_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество вершин многоугольника: ");
        int n = scanner.nextInt();
        int[][] vertices = new int[n][2];//двумерный массив для X и Y координат вершин

        //Заполнение массива координат вершин
        for (int i = 0; i < n; i++) {
            System.out.println("Введите координаты вершины " + (i + 1) + ": ");
            System.out.print("X==> ");
            vertices[i][0] = scanner.nextInt();
            System.out.print("Y==> ");
            vertices[i][1] = scanner.nextInt();
        }

        //Вычисление площади многоугольника`
        double area = 0.0;
        for (int i = 0; i < n - 2; i++) {
            area += triangleArea(vertices[0][0], vertices[0][1], vertices[i+1][0], vertices[i+1][1], vertices[i+2][0], vertices[i+2][1]);
        }

        System.out.println("Площадь многоугольника: " + area);
    }

    //Функция вычисления площади треугольника по формуле Герона
    public static double triangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        double b = Math.sqrt(Math.pow(x3-x2, 2) + Math.pow(y3-y2, 2));
        double c = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2));
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
