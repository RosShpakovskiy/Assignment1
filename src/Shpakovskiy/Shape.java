package Shpakovskiy;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> points = new ArrayList<>();

    public void addPoint(Point point) {
        points.add(point);
    }

    public double perimeter() {
        double per = 0;

        for (int i = 0; i < points.size(); i++) {
            Point thisPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            per += thisPoint.distanceTo(nextPoint);
        }

        return per;
    }

    public double averageSide() {
        return perimeter() / points.size();
    }

    public double longestSide() {
        int max = 0;
        Point nextmax = points.get(max + 1);

        for (int i = 0; i < points.size(); i++) {
            Point next = points.get((i + 1) % points.size());

            if (points.get(max).distanceTo(nextmax) < points.get(i).distanceTo(next)) {
                max = i;
            }
            nextmax = points.get((max + 1) % points.size());
        }

        return points.get(max).distanceTo(nextmax);
    }
}
