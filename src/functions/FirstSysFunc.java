package functions;

import interfaces.ISysFunc;

public class FirstSysFunc implements ISysFunc {
    public double fxSSI(double x, double y) {
        return Math.pow(4 - Math.pow(y, 2), 0.5);
    }

    public double fySSI(double x, double y) {
        return (2 - 2 * x) / 3;
    }

    public double fx1(double y) {
        return -y / Math.pow(4 - Math.pow(y, 2), 0.5);
    }

    public double fy1(double x) {
        return 2;
    }
}

