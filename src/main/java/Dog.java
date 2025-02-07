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
        } else
            System.out.println(getName() + " не может пробежать " + distance + " м., максимальная дистанция " + maxRunDistance + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(getName() + " проплыл " + distance + " м.");
        } else
            System.out.println(getName() + " не может проплыть " + distance + " м., максимальная дистанция " + maxSwimDistance + " м.");
    }


}
