package solution;

import interfaces.ISysFunc;
import moduls.Result;
import interfaces.IFunc;

class Methods {
    double simpleIteration(IFunc func, double left, double right, double eps) {
        double x1;
        double r;
        double x0 = chooseApproximationItr(func, left, right);
        do {
            x1 = func.fSI(x0);
            r = Math.abs(x1 - x0);
            x0 = x1;
        } while (r > eps);
        return x1;
    }

    double nutonMethod(IFunc func, double left, double right, double eps) {
        double x0;
        double x1;
        double r;
        double k = func.fN(left) * func.f2N(left);
        if (k > 0) {
            x0 = left;
        } else {
            x0 = right;
        }
        do {
            x1 = x0 - func.fN(x0) / func.f1N(x0);
            r = Math.abs(x1 - x0);
            x0 = x1;

        } while (r > eps);
        return x1;

    }

    boolean checkConvergenceItr(IFunc func, double left, double right) {
        if (Math.abs(func.f1SI(left)) < 1 || Math.abs(func.f1SI(right)) < 1)
            return true;
        else
            return false;
    }

    boolean checkConvergenceN(IFunc func, double left, double right) {
        if ((func.fN(left) * func.f2N(left) > 0 || func.fN(right) * func.f2N(right) > 0) && (func.fN(left) * func.fN(right)) < 0) {
            return true;
        } else
            return false;
    }

    protected double chooseApproximationItr(IFunc func, double left, double right) {
        double x0;
        if (func.f1SI(left) < 1) {
            x0 = left;
        } else
            x0 = right;
        return x0;
    }

    Result iterMethod(ISysFunc func, double x, double y, double eps) {
        double x0 = x;
        double y0 = y;
        double rx;
        double ry;
        Result result = new Result();
        do {
            x = func.fxSSI(x0, y0);
            y = func.fySSI(x0, y0);
            rx = (x - x0);
            ry = (y - y0);
            x0 = x;
            y0 = y;
            result.addIter(x, y);
        } while (Math.abs(rx) > eps && Math.abs(ry) > eps);
        return result;
    }
}
