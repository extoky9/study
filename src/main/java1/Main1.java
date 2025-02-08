
public class Main1 {
    public static void main(String[] args) {

        Circle circle = new Circle(5, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(4, 6, "Зеленый", "Синий");
        Triangle triangle = new Triangle(3, 4, 5, "Желтый", "Оранжевый");

        System.out.println("Круг: " + circle.getCharacteristics());
        System.out.println("Прямоугольник: " + rectangle.getCharacteristics());
        System.out.println("Треугольник: " + triangle.getCharacteristics());

    }
}


