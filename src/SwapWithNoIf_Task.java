public class SwapWithNoIf_Task {
    public static void solution(int a, int b) {
        System.out.println(a-((a-b)&((a-b)>>31)));
    }
}
