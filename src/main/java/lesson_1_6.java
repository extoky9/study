 public class lesson_1_6{

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " является положительным (или нулём).");
        } else {
            System.out.println("Число " + number + " является отрицательным.");
        }
    }
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-3);
        checkNumber(0);
    }
}

