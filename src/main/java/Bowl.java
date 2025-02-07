class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void decreaseFood(int amount) {
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
