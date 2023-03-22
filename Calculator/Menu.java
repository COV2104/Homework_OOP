package Calculator;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void menu() {

        while (true) {
            System.out.println("Калькулятор для работы с рациональными и комплексными числами");
            System.out.println("1. Работа с рациональными числами");
            System.out.println("2. Работа с комплексными числами");
            System.out.println("3. Просмотреть лог-файл");
            System.out.println("4. Выход");
            System.out.print(":> ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    RationalNumberMenu.menuRationalCalculator();
                    break;
                case 2:
                    ComplexNumberMenu.menuComplexCalculator();
                    break;
                case 3:
                    ShowLog.showLog();
                    break;
                case 4:
                    System.out.println("Работа завершена");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправильный выбор операции.");
            }
            System.out.println();
        }
    }

}
