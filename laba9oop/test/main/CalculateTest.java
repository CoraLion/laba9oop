package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    Calculate calculate;

    @BeforeEach
    void setUp() {
        calculate = new Calculate();
    }

    @Test
    void getXY() {
        double a = 0;
        double b = 3;
        double step = 0.004;
        ArrayList<Point> list = calculate.getXY(a, b, step);
        Point p = new Point(0.7,1);
        double y = p.getY();
        double x = p.getX();
        Point p1 = list.get(175);
        double y1 = p1.getY();
        double x1 = p1.getX();
        assertEquals(y, y1, 0.001);
        assertEquals(x, x1, 0.001);

    }
}