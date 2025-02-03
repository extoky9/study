
import java.util.Random;

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
            cats[i] = new Cat("Кот " + (i+1));
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

class Animal {
    String name;
    private static int animalCount;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }
    public void swim(int distance){
        System.out.println(name + " проплыл " + distance + " м.");
    }

}

class Dog extends Animal {
    private static int dogCount;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;


    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        }
        else
            System.out.println(getName() + " не может пробежать " + distance + " м., максимальная дистанция " + maxRunDistance + " м.");
    }
    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(getName() + " проплыл " + distance + " м.");
        }
        else
            System.out.println(getName() + " не может проплыть " + distance + " м., максимальная дистанция " + maxSwimDistance + " м.");
    }


}

class Cat extends Animal {
    private static int catCount;
    private boolean isFull;
    private final int maxRunDistance = 200;
    private final int eatAmountMin = 15;
    private final int eatAmountMax = 20;


    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false; // Коты при создании голодны
    }

    public static int getCatCount() {
        return catCount;
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        }
        else
            System.out.println(getName() + " не может пробежать " + distance + " м., максимальная дистанция " + maxRunDistance + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать!");
    }

    public void eat(Bowl bowl) {
        if(bowl.getFoodAmount() <= 0) {
            System.out.println("В миске нет еды.");
            return;
        }
        Random random = new Random();
        int foodToEat = random.nextInt(eatAmountMax - eatAmountMin + 1) + eatAmountMin;

        if(bowl.getFoodAmount() >= foodToEat) {
            bowl.decreaseFood(foodToEat);
            isFull = true;
        }
        else {
            System.out.println(getName() + " не стал есть, не хватило еды в миске");
        }
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount){
        if (amount > foodAmount) {
            foodAmount = 0;
            return;
        }
        foodAmount -= amount;
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

}