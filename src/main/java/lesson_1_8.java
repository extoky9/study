public class lesson_1_8 {
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {

            System.out.println(str);
        }
    }
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        int numberOfTimes = 3;
        printStringMultipleTimes(inputString, numberOfTimes);
    }
}
