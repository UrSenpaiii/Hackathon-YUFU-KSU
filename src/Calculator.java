public class Calculator {
    public static void input(int a, int b, char operator) {
        int sum;
        if (operator == '+') sum = a + b;
        else if (operator == '-') sum = a - b;
        else if (operator == '*') sum = a * b;
        else if (operator == '/' && b != 0) sum = a / b;
        else if (b == 0) {
            System.out.println("U can't divide by zero! -1 ERROR!");
            sum = -1;
        } else {
            System.out.println("There is no such operator! -2 ERROR!");
            sum = -2;
        }
        System.out.println(sum);
    }
}
