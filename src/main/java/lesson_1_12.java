public class lesson_1_12 {
        public static void main(String[] args) {
            int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.print("Исходный массив: ");
            printArray(array);
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] *= 2;
                }
            }
            System.out.print("Измененный массив: ");
            printArray(array);
        }
        private static void printArray(int[] array) {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

