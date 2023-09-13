package moduls;

import java.util.ArrayList;

public class Result {
    ArrayList<Double> x = new ArrayList<>();
    ArrayList<Double> y = new ArrayList<>();

    ArrayList<Double> x1 = new ArrayList<>();

    public void print() {
        for (int i = 0; i < x.size(); i++) {
            System.out.println("Итерация: " + (i + 1));
            System.out.println("x = " + x.get(i) + " | y = " + y.get(i));
        }
    }

    public void addIter(double x, double y) {
        this.x.add(x);
        this.y.add(y);
    }

    public void addIter(double x1) {
        this.x1.add(x1);

    }
}