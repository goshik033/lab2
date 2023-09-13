package functions;

import interfaces.IFunc;

public class FirstFunc implements IFunc {
    public double fSI(double x) {
        return (2 - 3 * Math.pow(x, 3)) / 5;
    }

    public double f1SI(double x) {
        return (-9 * Math.pow(x, 2)) / 5;
    }

    public double fN(double x) {
        return -2 + 3 * Math.pow(x, 3) + 5 * x;
    }

    public double f1N(double x) {
        return 9 * Math.pow(x, 2) + 5;
    }

    public double f2N(double x) {
        return 18 * x;

    }
}
