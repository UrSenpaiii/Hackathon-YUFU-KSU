public class SeparatedNumbers_Task {
    public static void solution_1(int a1, int a2, int b1, int b2) {
        int c2 = a2 - b2 - ((a1 + b1) / 10);
        int c1 = (((a1 + b1) / 10) * 10 + c2 + a1 - b1) % 10;

        System.out.println(c2 + " " + c1);
    }
    public static void solution_2(int a1, int a2, int b1, int b2) {
        int c2 = a2 - b2;
        int c1 = a1 - b1;
        if (c2 < 0) {
            c2 *= -1;
            c1 *= -1;
        }
        if (c1 < 0) {
            c1 += 10;
            c2 -= 1;
        }

        System.out.println(c2 + " " + c1);
    }

    public static void solution_3(int a1, int a2, int b1, int b2) {
        System.out.println("First: " + (a2 - b2 - (a1 < b1 ? 1 : 0)));
        System.out.println("Second: " + (a1 - b1 + (a1 < b1 ? 10 : 0)));
    }
}
