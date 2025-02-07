import java.util.Random;

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
        } else
            System.out.println(getName() + " не может пробежать " + distance + " м., максимальная дистанция " + maxRunDistance + " м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать!");
    }

    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() <= 0) {
            System.out.println("В миске нет еды.");
            return;
        }
        Random random = new Random();
        int foodToEat = random.nextInt(eatAmountMax - eatAmountMin + 1) + eatAmountMin;

        if (bowl.getFoodAmount() >= foodToEat) {
            bowl.decreaseFood(foodToEat);
            isFull = true;
        } else {
            System.out.println(getName() + " не стал есть, не хватило еды в миске");
        }
    }
}
