package solution;

import java.util.Scanner;

import functions.*;
import moduls.Menu;

public class Printer {
    public void go() {
        Menu menu = new Menu();
        Execute e = new Execute();
        Scanner in = new Scanner(System.in);
        menu.printMenu();

        String userInput = in.nextLine().trim();
        while (!userInput.equals("0")) {
            switch (userInput) {
                case "1":
                    FirstFunc f1 = new FirstFunc();
                    e.execute(f1);
                    menu.printMenu();
                    userInput = in.nextLine().trim();
                    break;
                case "2":
                    SecFunc f2 = new SecFunc();
                    e.execute(f2);
                    menu.printMenu();
                    userInput = in.nextLine().trim();
                    break;
                case "3":
                    ThirdFunc f3 = new ThirdFunc();
                    e.execute(f3);
                    menu.printMenu();
                    userInput = in.nextLine().trim();
                    break;
                case "4":
                    FourthFunc f4 = new FourthFunc();
                    e.execute(f4);
                    menu.printMenu();
                    userInput = in.nextLine().trim();
                    break;
                case "5":
                    menu.printSysMenu();
                    userInput = in.nextLine().trim();
                    switch (userInput) {
                        case "1":
                            FirstSysFunc fs1 = new FirstSysFunc();
                            e.execute(fs1);
                            break;
                        case "2":
                            SecSysFunc fs2 = new SecSysFunc();
                            e.execute(fs2);
                            break;
                    }
                    menu.printMenu();
                    userInput = in.nextLine().trim();

            }
        }

    }
}
