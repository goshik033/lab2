package functions;

import interfaces.ISysFunc;

public class SecSysFunc implements ISysFunc {

    public double fxSSI(double x, double y) {
        return Math.pow((x * (y + 5) - 1) / 2, 0.5);
    }

    public double fySSI(double x, double y) {
        return Math.pow((x + 3 * (Math.log(x))), 0.5);
    }

    public double fx1(double y) {
        return Math.pow((y + 5) - 1, 0.5);
    }

    public double fy1(double x) {
        return (2 - 2 * x) / 3;
    }

}
