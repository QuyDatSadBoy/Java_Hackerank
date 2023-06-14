package Kethua_Dahinh.Interface;

import java.util.*;
import java.math.*;

interface GeometricObject {
    double getPerimeter();

    double getArea();
}

class Circle implements GeometricObject {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * 3.14 * radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public String toString() {
        String res1, res2, res3;
        res1 = String.format("%.2f", radius);
        res2 = String.format("%.2f", getPerimeter());
        res3 = String.format("%.2f", getArea());
        if ((int) (radius) == radius) res1 = String.valueOf((int) (radius));
        if ((int) (getPerimeter()) == getPerimeter()) res2 = String.valueOf((int) (getPerimeter()));
        if ((int) (getArea()) == getArea()) res3 = String.valueOf((int) (getArea()));
        return "---------------------\n" + "Radius : " + res1 + "\nPerimeter : " + res2 + "\nArea : " + res3 + "\n---------------------";
    }
}

interface Resizable {
    public void resize(long percent);
}

class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(long percent) {
        this.radius *= 1.0 * (percent * 1.0 / 100.0);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            ResizableCircle r = new ResizableCircle(sc.nextDouble());
            long n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                long x = sc.nextLong();
                r.resize(x);
            }
            System.out.println(r);
        }
    }
}
