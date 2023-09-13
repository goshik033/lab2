package moduls;

public class Menu {
    public static void printMenu() {
        System.out.print("\n");
        System.out.println("1 - 3x^3+5x-2");
        System.out.println("2 - x^2+3x+1");
        System.out.println("3 - 4x^3-13x-4");
        System.out.println("4 - e^x-5x");
        System.out.println("5 - Системы");
        System.out.println("0 - Выйти из приложения");
    }

    public static void printSysMenu() {
        System.out.print("\n");
        System.out.println("1 - |x^2+y^2=4\n" + "    |2x+3y=2");
        System.out.println("2 - |x^2+yx-5x+1=0\n" + "    |x+3lg(x)-y^2=0");
        System.out.println("0 - Назад");
    }
}
