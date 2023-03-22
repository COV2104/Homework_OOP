package Calculator;

import java.util.Scanner;

public class ComplexNumberMenu {
    private static Logger logger;
    private static final Scanner scanner = new Scanner(System.in);

    public static void menuComplexCalculator() {
        logger = Logger.getInstance();
        while (true) {
            System.out.println("Работа с комплексными числами:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            System.out.println("5. Модуль комплексного числа");
            System.out.println("6. Аргумент комплексного числа");
            System.out.println("7. Выход в основное меню");
            System.out.print("Выберите операцию (1-7):> ");
            int choice = scanner.nextInt();
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
                    modulus();
                    break;
                case 6:
                    argument();
                    break;
                case 7:
                    Menu.menu();
                    break;
                default:
                    System.out.println("Неправильный выбор операции.");
            }
            System.out.println();
        }
    }

    private static void add() {
        System.out.print("Введите первое число (a+bi): ");
        String a = scanner.next();
        System.out.print("Введите второе число (a+bi): ");
        String b = scanner.next();
        ComplexNumber cn1 = stringToComplexNumber(a);
        ComplexNumber cn2 = stringToComplexNumber(b);
        ComplexNumber result = cn1.sumComplexNumber(cn2);
        logger.log(String.format(a + " + " + b + " = " + result.toString()));
        System.out.println(result.toString());
    }

    private static void subtract() {
        System.out.print("Введите первое число (a+bi): ");
        String a = scanner.next();
        System.out.print("Введите второе число (a+bi): ");
        String b = scanner.next();
        ComplexNumber cn1 = stringToComplexNumber(a);
        ComplexNumber cn2 = stringToComplexNumber(b);
        ComplexNumber result = cn1.differenceComplexNumber(cn2);
        logger.log(String.format(a + " - " + b + " = " + result.toString()));
        System.out.println(result.toString());
    }

    private static void multiply() {
        System.out.print("Введите первое число (a+bi): ");
        String a = scanner.next();
        System.out.print("Введите второе число (a+bi): ");
        String b = scanner.next();
        ComplexNumber cn1 = stringToComplexNumber(a);
        ComplexNumber cn2 = stringToComplexNumber(b);
        ComplexNumber result = cn1.multiplycatiComplexNumber(cn2);
        logger.log(String.format(a + " * " + b + " = " + result.toString()));
        System.out.println(result.toString());
    }

    private static void divide() {
        System.out.print("Введите первое число (a+bi): ");
        String a = scanner.next();
        System.out.print("Введите второе число (a+bi): ");
        String b = scanner.next();
        ComplexNumber cn1 = stringToComplexNumber(a);
        ComplexNumber cn2 = stringToComplexNumber(b);
        ComplexNumber result = cn1.divisionComplexNumber(cn2);
        logger.log(String.format(a + " / " + b + " = " + result.toString()));
        System.out.println(result.toString());
    }

    private static void modulus() {
        System.out.print("Введите число (a+bi): ");
        String a = scanner.next();
        ComplexNumber cn = stringToComplexNumber(a);
        double result = cn.modulusComplexNumber();
        logger.log(String.format("Модуль " + a + " = " + result));
        System.out.println(result);
    }

    private static void argument() {
        System.out.print("Введите число (a+bi): ");
        String a = scanner.next();
        ComplexNumber cn = stringToComplexNumber(a);
        double result = cn.argumentComplexNumber();
        logger.log(String.format("Аргумент " + a + " = " + result));
        System.out.println(result);
    }

    private static ComplexNumber stringToComplexNumber(String s) {
        String[] parts = s.split("\\+|i");
        double real = Double.parseDouble(parts[0]);
        double imag = Double.parseDouble(parts[1]);
        return new ComplexNumber(real, imag);
    }

}
