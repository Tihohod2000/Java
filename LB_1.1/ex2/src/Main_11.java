import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество точек на плоскости: ");
        int n = scanner.nextInt();
        int[][] points = new int[n][2];//двумерный массив для X и Y

        //Завполнение массива
        for (int i = 0; i < n; i++) {
            System.out.println("Введите координаты точки " + (i+1) + ": ");
            System.out.print("X==> ");
            points[i][0] = scanner.nextInt();
            System.out.print("Y==> ");
            points[i][1] = scanner.nextInt();
//            scanner.nextLine();
        }


        int[] triangle = findLargestTriangle(points);//массив точек треугольника с самым большим периметром

        int perimeter = getPerimeter(points[triangle[0]], points[triangle[1]], points[triangle[2]]);//получение периметра треугольника
        System.out.println("Наибольший периметр: " + perimeter);
        System.out.println("Точки: (" + points[triangle[0]][0] + "," + points[triangle[0]][1] + "), (" + points[triangle[1]][0] + "," + points[triangle[1]][1] + "), (" + points[triangle[2]][0] + "," + points[triangle[2]][1] + ")");
    }

    public static int[] findLargestTriangle(int[][] points) {
        int[] triangle = new int[3];
        int maxPerimeter = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                for (int k = j+1; k < points.length; k++) {
                    int perimeter = getPerimeter(points[i], points[j], points[k]);
                    if (perimeter > maxPerimeter) {
                        maxPerimeter = perimeter;
                        triangle[0] = i;
                        triangle[1] = j;
                        triangle[2] = k;
                    }
                }
            }
        }
        return triangle;//вывод точек вершин треугольника с самым большим периметрем
    }

    public static int getPerimeter(int[] a, int[] b, int[] c) {
        int aLen = getDistance(a, b);
        int bLen = getDistance(b, c);
        int cLen = getDistance(c, a);
        return aLen + bLen + cLen;
    }

    public static int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return (int)Math.sqrt(dx*dx + dy*dy);
    }
}
