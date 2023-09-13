package solution;

import interfaces.IFunc;

import interfaces.ISysFunc;
import moduls.Result;

import java.util.Scanner;

class Execute {
    Reader r = new Reader();
    Methods m = new Methods();

    void execute(IFunc func) {
        r.readDate();
        double ansN = 0;
        double ansSI = 0;
        if (m.checkConvergenceItr(func, r.getLeft(), r.getRight())) {
            ansSI = m.simpleIteration(func, r.getLeft(), r.getRight(), r.getEps());
            System.out.println("Результат метода простых итераций: " + ansSI);
        } else
            System.out.println("Результат метода простых итераций: решение не удовлетворяет заданному интервалу");
        if (m.checkConvergenceN(func, r.getLeft(), r.getRight())) {
            ansN = m.nutonMethod(func, r.getLeft(), r.getRight(), r.getEps());
            System.out.println("Результат метода Ньютона: " + ansN);
        } else
            System.out.println("Результат метода Ньютона: решение не удовлетворяет заданному интервалу");
        if (ansN != 0 && ansSI != 0) {
            System.out.println("Разница между двумя методами: " + Math.abs(ansN - ansSI));
        }

    }

    void execute(ISysFunc func) {
        r.readSysDate();
        Result result = m.iterMethod(func, r.getX(), r.getY(), r.getEps());
        result.print();
    }
}
