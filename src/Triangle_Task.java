import java.util.Scanner;

public class Triangle_Task {
    public static void start(float a, float b, float c) {
                if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle exists");
            if (a == b && a == c) System.out.println("Equilateral triangle"); // равносторонний
            else if (a == b || b == c || a == c) System.out.println("Isosceles triangle"); // равнобедренный
            else System.out.println("Scalene triangle");
        } else System.out.println("Triangle doesn't exist");
    }
}

