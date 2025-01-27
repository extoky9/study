public class lesson_1_5 {
public static boolean chisla (int num1, int num2) {
    int sum = num1 + num2;
    return sum >= 10 && sum <= 20;
}
public static void main (String[] args){
    int number1 = 10;
    int number2 = 20;
    boolean result = chisla(number1, number2);
    System.out.println(result);
}
}