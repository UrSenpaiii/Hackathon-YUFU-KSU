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
    }
}