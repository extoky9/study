public class lesson_1_11 {
    public static void main(String[] args) {
        int[] array;
        array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i % 10 == 0) System.out.println();
        }
    }
}