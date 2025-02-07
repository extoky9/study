class Main {

    public static void main(String[] args) {
        // Создание животных
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        // Проверка бега
        dogBobik.run(300);
        catMurzik.run(150);
        catBarsik.run(250);

        // Проверка плавания
        dogBobik.swim(5);
        dogBobik.swim(15);
        catMurzik.swim(5);

        // Статистика по животным
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());

        System.out.println("-------------------------");

        // Миска с едой
        Bowl bowl = new Bowl(20);

        // Массив котов
        Cat[] cats = new Cat[4];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот " + (i + 1));
        }
        // Пробуем кормить котов
        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

        System.out.println("-------------------------");

        bowl.addFood(30);

        // Пробуем еще раз кормить котов
        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }

    }
}
