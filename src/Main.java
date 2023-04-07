import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Triangles task: input triangle sides' length and see if this triangle exists");
        float triangleSideA = sc.nextFloat();
        float triangleSideB = sc.nextFloat();
        float triangleSideC = sc.nextFloat();
        Triangle_Task.start(triangleSideA, triangleSideB, triangleSideC);

        System.out.println("Separated Numbers task: input tцo two-digit numbers, but separate them in four digits and see its sum");
        int a2 = sc.nextInt(), a1 = sc.nextInt();
        int b2 = sc.nextInt(), b1 = sc.nextInt();
        SeparatedNumbers_Task.solution_1(a1, a2, b1, b2);
        SeparatedNumbers_Task.solution_2(a1, a2, b1, b2);
        SeparatedNumbers_Task.solution_3(a1, a2, b1, b2);

        System.out.println("Calculator: input 1st number. Then operator: + | - | * | /. And in the end 2nd number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        Calculator.input(a, b, operator);

        System.out.println("Swap with no If: input to numbers and I'll change them with each other without IF/ELSE");
        int num_a = sc.nextInt();
        int num_b = sc.nextInt();
        SwapWithNoIf_Task.solution(num_a, num_b);

        int weight = sc.nextInt();
        int height = sc.nextInt();
        BMI_Task.solution(weight, height);

        System.out.println("Day of the Week task: input number of the day in a week and I'll print it for you");
        int day = sc.nextInt();
        DaysOfTheWeek_Task.solution(day);
    }
}

