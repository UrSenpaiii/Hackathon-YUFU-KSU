import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float triangleSideA = sc.nextFloat();
        float triangleSideB = sc.nextFloat();
        float triangleSideC = sc.nextFloat();
        Triangle_Task.start(triangleSideA, triangleSideB, triangleSideC);

        int a2 = sc.nextInt(), a1 = sc.nextInt();
        int b2 = sc.nextInt(), b1 = sc.nextInt();
        SeparatedNumbers_Task.solution_1(a1, a2, b1, b2);
        SeparatedNumbers_Task.solution_2(a1, a2, b1, b2);
        SeparatedNumbers_Task.solution_3(a1, a2, b1, b2);

        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        Calculator.input(a, b, operator);

        int num_a = sc.nextInt();
        int num_b = sc.nextInt();
        SwapWithNoIf_Task.solution(num_a, num_b);

        int weight = sc.nextInt();
        int height = sc.nextInt();
        BMI_Task.solution(weight, height);
    }
}