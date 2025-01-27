import java.util.Arrays;

public class lesson_1_14 {
        public static int[] createArrayWithInitialValue(int len, int initialValue) {
            if (len < 0) {
                throw new IllegalArgumentException("Длина массива не может быть отрицательной.");
            }
            int[] array = new int[len];
            Arrays.fill(array, initialValue);
            return array;
        }
        public static void main(String[] args) {
            int[] array1 = createArrayWithInitialValue(5, 10);
            System.out.print("Массив 1: ");
            printArray(array1);

            int[] array2 = createArrayWithInitialValue(0, 5);
            System.out.print("Массив 2: ");
            printArray(array2);

            int[] array3 = createArrayWithInitialValue(3, -1);
            System.out.print("Массив 3: ");
            printArray(array3);
            try {
                createArrayWithInitialValue(-2, 1);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
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

