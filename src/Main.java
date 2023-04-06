import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float triangleSideA = sc.nextFloat();
        float triangleSideB = sc.nextFloat();
        float triangleSideC = sc.nextFloat();

        Triangle_Task.start(triangleSideA, triangleSideB, triangleSideC);
    }
}