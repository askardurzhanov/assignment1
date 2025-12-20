package models;

import java.util.ArrayList;

public class Shape {

    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point p) {
        points.add(p);
    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next;

            if (i == points.size() - 1) {
                next = points.get(0);
            } else {
                next = points.get(i + 1);
            }
            perimeter += current.distance(next);
        }
        return perimeter;
    }

    public double getLongest() {
        double max = 0;

        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next;

            if (i == points.size() - 1) {
                next = points.get(0);
            } else {
                next = points.get(i + 1);
            }
            double dist = current.distance(next);
            if (dist > max) {
                max = dist;
            }
        }
        return max;
    }

    public double getAverageSide() {
        if (points.size() < 2) {
            return 0;
        }
        double sum = 0;

        for (int i = 0; i < points.size(); i++) {
            Point current = points.get(i);
            Point next;

            if (i == points.size() - 1) {
                next = points.get(0);
            } else {
                next = points.get(i + 1);
            }
            sum += current.distance(next);
        }
        return sum / points.size();
    }
}

