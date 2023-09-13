
package functions;

import interfaces.IFunc;

public class SecFunc implements IFunc {
    public double fSI(double x) {
        return (-1 - Math.pow(x, 2)) / 3;
    }

    public double f1SI(double x) {
        return ((-2) * x) / 3;
    }

    public double fN(double x) {
        return (1 + Math.pow(x, 2) + 3);
    }

    public double f1N(double x) {
        return (2 * x + 3);
    }

    public double f2N(double x) {
        return 0;

    }

}
