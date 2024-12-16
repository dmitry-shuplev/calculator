
import java.util.Scanner;

public class MathOperation {
    int firstOperande = 1;
    int secondOperande = 1;
    char operator = '+';

    public static void main(String[] args) {
        System.out.println("Инициализация1");
        System.out.println("Инициализация2");

    }

    public void initializeThisOperatin(MathOperation MO) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        if (scanner.hasNextInt()) {
            MO.firstOperande = scanner.nextInt();
            scanner.nextLine();
        } else {
            MO.firstOperande = transformStringToInt(scanner.nextLine());
        }

        System.out.print("Введите второе число: ");
        if (scanner.hasNextInt()) {
            MO.secondOperande = scanner.nextInt();
            scanner.nextLine();
        } else {
            MO.secondOperande = transformStringToInt(scanner.nextLine());
        }

        System.out.print("Введите действие (+,-,/,*): ");
        char operator = scanner.nextLine().charAt(0);
        if (isOperatorCorrect(operator)) {
            MO.operator = operator;
        } else {
            System.out.println("Вы ввели недопустимую операцию!\nПо умолчанию выполнится операция сложения!");
            MO.operator = '+';
        }
    }

    public boolean isOperatorCorrect(char operator) {
        switch (operator) {
            case '+':
                return true;
            case '-':
                return true;
            case '*':
                return true;
            case '/':
                return true;
        }
        return false;
    }

    public Integer transformStringToInt(String someNumber) {
        someNumber = someNumber.toUpperCase();
        int arabNumber = 0;
        // arabNumber = Integer.parseInt(someNumber);
        int currentNumber = 0;
        int previousNumber = 0;
        for (int i = someNumber.length() - 1; i >= 0; i--) {
            char simbol = someNumber.charAt(i);
            switch (simbol) {
                case 'I':
                    previousNumber = currentNumber;
                    currentNumber = 1;
                    break;
                case 'V':
                    previousNumber = currentNumber;
                    currentNumber = 5;
                    break;
                case 'X':
                    previousNumber = currentNumber;
                    currentNumber = 10;
                    break;
                case 'C':
                    previousNumber = currentNumber;
                    currentNumber = 100;
                    break;
                case 'M':
                    previousNumber = currentNumber;
                    currentNumber = 1000;
                    break;
            }
            if (currentNumber >= previousNumber) {
                arabNumber = arabNumber + currentNumber;
            } else arabNumber = arabNumber - currentNumber;

            System.out.println();
        }
        return arabNumber;
    }
    // Закрывающая кавачка класса MathOpatin
}
