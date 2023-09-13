package functions;

import interfaces.IFunc;

public class FourthFunc implements IFunc {
    public double fSI(double x) {
        return (Math.pow(Math.E, x)) / 5;
    }

    public double f1SI(double x) {
        return (Math.pow(Math.E, x)) / 5;
    }

    public double fN(double x) {
        return (Math.pow(Math.E, x)) - 5 * x;
    }

    public double f1N(double x) {
        return (Math.pow(Math.E, x)) - 5;
    }

    public double f2N(double x) {
        return (Math.pow(Math.E, x));

    }
}
