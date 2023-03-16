import java.util.Scanner;

public class Main_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество точек на плоскости: ");
        int n = scanner.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите координаты точки " + (i+1) + ": ");
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }
        int[] triangle = findLargestTriangle(points);
        System.out.println("Наибольший периметр: " + triangle[2]);
        System.out.println("Точки: (" + points[triangle[0]][0] + "," + points[triangle[0]][1] + "), (" + points[triangle[1]][0] + "," + points[triangle[1]][1] + "), (" + points[triangle[2]][0] + "," + points[triangle[2]][1] + ")");
    }

    public static int[] findLargestTriangle(int[][] points) {
        int[] triangle = new int[3];
        int maxPerimeter = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                for (int k = j+1; k < points.length; k++) {
                    int a = getDistance(points[i], points[j]);
                    int b = getDistance(points[i], points[k]);
                    int c = getDistance(points[j], points[k]);
                    int perimeter = a + b + c;
                    if (perimeter > maxPerimeter) {
                        maxPerimeter = perimeter;
                        triangle[0] = i;
                        triangle[1] = j;
                        triangle[2] = k;
                    }
                }
            }
        }
        return triangle;
    }

    public static int getDistance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return (int)Math.sqrt(dx*dx + dy*dy);
    }
}