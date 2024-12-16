
public class Calculator {

    public static void main(String[] args) {
        calculatorTest();    }
    public static double calculate(MathOperation MO){
        char operator = MO.operator;
        int firstOperand = MO.firstOperande;
        int secondOprand = MO.secondOperande;
        switch (operator){
            case '+' : return firstOperand + secondOprand;
            case '-' : return firstOperand - secondOprand;
            case '*' : return firstOperand * secondOprand;
            case '/' : if (secondOprand == 0) {
                System.out.println("Ошибка. Деление на 0, некорректный результат");return 0;
                }
                else return (double) firstOperand / secondOprand;
        }
        System.out.println("ERROR. Что то пошло не так.");
        return 0;
    }


    public static void calculatorTest(){
        MathOperation MO = new MathOperation();
        MO.initializeThisOperatin(MO);
        System.out.println(MO.firstOperande + " " + MO.operator + " " + MO.secondOperande + " = " + calculate(MO));
    }
//закрытие класса Calculator
}








