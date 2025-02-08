interface Shape {
    double calculateArea();
    String getFillColor();
    String getBorderColor();

    default double calculatePerimeter() {
        return 0;  // Дефолтная реализация для случаев, когда периметр не определен по умолчанию
    }

    default String getCharacteristics() {
        return "[Периметр: " + String.format("%.2f", calculatePerimeter()) + ", Площадь: " + String.format("%.2f", calculateArea()) + ", Цвет фона: " + getFillColor() + ", Цвет границ: " + getBorderColor() + "]";
    }
}
