package Shpakovskiy;

import java.util.Scanner;
import java.io.File;

public class MyApplication {
    public static void main(String[] args) throws Exception {

        File src = new File("C:\\Users\\user\\IdeaProjects\\MyApplication\\src\\Shpakovskiy\\source");
        Scanner read = new Scanner(src);

        Shape shape = new Shape();

        for (int i = 0; i < 10; i++) {
            int x = read.nextInt();
            int y = read.nextInt();

            Point point = new Point(x, y);
            shape.addPoint(point);

            if (i > 0) {
                double distance = shape.points.get(i - 1).distanceTo(shape.points.get(i));
                System.out.println("Distance between point " + shape.points.get(i - 1) + " and point " + shape.points.get(i) + " = " + distance);
            }
        }

        double distance = shape.points.get(9).distanceTo(shape.points.get(0));
        System.out.println("Distance between point " + shape.points.get(9) + " and point " + shape.points.get(0) + " = " + distance);

        System.out.println();
        System.out.println("P = " + shape.perimeter());
        System.out.println("Average side = " + shape.averageSide());
        System.out.println("Longest side = " + shape.longestSide());
    }
}