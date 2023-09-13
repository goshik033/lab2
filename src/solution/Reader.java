package solution;

import java.util.Scanner;

class Reader {
    private double left;
    private double right;
    private double eps;
    private double x;
    private double y;

    private Double inputDate() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                String str = in.nextLine();
                double num = Double.parseDouble(str);
                return num;
            } catch (NumberFormatException wrongForm) {
                System.out.println("Неверный формат, попробуйте еще раз");

            }
        }
    }

    void readDate() {
        System.out.println("Введите Левую границу");
        left = inputDate();
        System.out.println("Введите Правую границу");
        right = inputDate();
        System.out.println("Введите точность:");
        eps = inputDate();
    }

    void readSysDate() {
        System.out.println("Введите приближение x:");
        x = inputDate();
        System.out.println("Введите приближение y:");
        y = inputDate();
        System.out.println("Введите точность:");
        eps = inputDate();
    }

    double getX() {
        return x;
    }

    double getY() {
        return y;
    }

    double getLeft() {
        return left;
    }

    double getRight() {
        return right;
    }

    double getEps() {
        return eps;
    }

}
