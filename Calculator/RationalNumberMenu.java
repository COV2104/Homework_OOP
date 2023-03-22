package Calculator;

import java.util.Scanner;

public class RationalNumberMenu {
    private static Logger logger;
    private static Scanner scanner = new Scanner(System.in);

    public static void menuRationalCalculator() {
        logger = Logger.getInstance();
        while (true) {
            System.out.println("Работа с рациональными числами:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Выход в основное меню");
            System.out.print("Выберите операцию (1-5):> ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    Menu.menu();
                    break;
                default:
                    System.out.println("Неправильный выбор операции.");
            }
            System.out.println();
        }
    }

    private static void add() {
        System.out.println("Введите первое число: ");
        Double r1 = scanner.nextDouble();
        System.out.println("Введите первое число: ");
        Double r2 = scanner.nextDouble();
        Double result = r1 + r2;
        logger.log(String.format(r1 + " + " + r2 + " = " + result));
        System.out.println(result);
    }

    private static void subtract() {
        System.out.println("Введите первое число: ");
        Double r1 = scanner.nextDouble();
        System.out.println("Введите первое число: ");
        Double r2 = scanner.nextDouble();
        Double result = r1 - r2;
        logger.log(String.format(r1 + " - " + r2 + " = " + result));
        System.out.println(result);
    }

    private static void multiply() {
        System.out.println("Введите первое число: ");
        Double r1 = scanner.nextDouble();
        System.out.println("Введите первое число: ");
        Double r2 = scanner.nextDouble();
        Double result = r1 * r2;
        logger.log(String.format(r1 + " * " + r2 + " = " + result));
        System.out.println(result);
    }

    private static void divide() {
        System.out.println("Введите первое число: ");
        Double r1 = scanner.nextDouble();
        System.out.println("Введите первое число: ");
        Double r2 = scanner.nextDouble();
        Double result = r1 / r2;
        logger.log(String.format(r1 + " / " + r2 + " = " + result));
        System.out.println(result);
    }

}