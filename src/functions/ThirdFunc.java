
package functions;

import interfaces.IFunc;

public class ThirdFunc implements IFunc {
    public double fSI(double x) {
        return (-4 + 4 * Math.pow(x, 3)) / 13;
    }

    public double f1SI(double x) {
        return (12 * Math.pow(x, 2)) / 13;
    }

    public double fN(double x) {
        return (-4 + 4 * Math.pow(x, 3) - 13);
    }

    public double f1N(double x) {
        return (12 * Math.pow(x, 2) - 13);
    }

    public double f2N(double x) {
        return 24 * x;

    }

}
