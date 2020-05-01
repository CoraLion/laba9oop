package main;

import java.util.ArrayList;
import java.util.Collections;

public class Calculate {


    public ArrayList<Point> getXY(double a, double b, double step) {
        int step1 = distanceTo(a, b, step);
        ArrayList<Point> list = new ArrayList<>();
        double x = a;
        for (int i = 0; i <= step1; i++) {
            list.add(new Point(x, calculate(x)));
            x += step;
        }
        return list;
    }


    public int distanceTo(double a, double b, double step) {
        return (int) ((b - a) / step);
    }

    public double calculate(double x) {
        double a = -0.5;
        double b = 2;
        double eps = 1e-6;
        if (x <= 0.7 + eps) {
            return 1;
        }
        if (x > 1.4 + eps) {
            return Math.pow(Math.E, a * x) * Math.cos(b * x);
        } else return a * x * x * Math.exp(x);
    }


    public Point foundmax(ArrayList<Point> listpoint){
        double max = 0;
        int n = 0;
        for (Point point : listpoint) {
            if (max < point.getY()) {
                max = point.getY();
                n++;
            }
        }
        return new Point(listpoint.get(n).getX(), max);
    }

    public Point foundmin(ArrayList<Point> listpoint){
        double min = 0;
        int n = 0;
        for (Point point : listpoint) {
            if (min > point.getY()) {
                min = point.getY();
                n++;
            }
        }
        return new Point(listpoint.get(n).getX(), min);
    }
    public double sum(ArrayList<Point> listpoint) {
        double sum = 0;
        for (Point point : listpoint) {
            sum += point.getY();
        }
        return sum;
    }
}
