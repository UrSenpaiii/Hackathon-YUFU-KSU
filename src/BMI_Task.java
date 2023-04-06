public class BMI_Task {
    public static void solution(int weight, int height) {
        String recommendations = "You are perfect :)";
        int bmi = weight / (height*height);
        int kgs = height - 100;

        if (kgs > weight) recommendations = "You should go on a diet to loose " + kgs + "kilograms.";
        if (kgs < weight) recommendations = "You should eat more to gain " + kgs + "kilograms.";

        System.out.printf("Your BMI is " + bmi + ". " + recommendations);
    }
}
