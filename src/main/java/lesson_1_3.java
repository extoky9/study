public class lesson_1_3 {
    public static void main(String[] args) {
        printColor(-5); //Красный
        printColor(50); //Желтый
        printColor(150); //Зеленый
    }
    public static void printColor(int value) {
        if (value < 0) {
            System.out.println("Красный");
        } else if (value >= 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зеленый");
        }
    }
}
