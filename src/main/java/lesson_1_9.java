public class lesson_1_9 {
    public static boolean date(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 != 0)
            return true;
        else
            return year % 400 == 0;
    }
    public static void main (String[] args)
    {
        int year = 2024;
        if (date(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - нe високосный год");
        }
    }
}