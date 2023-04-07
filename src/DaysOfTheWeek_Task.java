public class DaysOfTheWeek_Task {
    public static void solution(int day) {
        String dayOfTheWeek;
        if (day == 1) dayOfTheWeek = "Monday";
        else if (day == 2) dayOfTheWeek = "Tuesday";
        else if (day == 3) dayOfTheWeek = "Wednesday";
        else if (day == 4) dayOfTheWeek = "Thursday";
        else if (day == 5) dayOfTheWeek = "Friday";
        else if (day == 6) dayOfTheWeek = "Saturday";
        else if (day == 7) dayOfTheWeek = "Sunday";
        else dayOfTheWeek = "There's no such day in week, you're liar!";
        System.out.println(dayOfTheWeek);
    }
}

