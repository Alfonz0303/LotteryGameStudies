package com.company.lotteryGame;

public abstract class BasicLotteryFiller {

    protected static boolean numberAlreadyCreated(int[] numbers, int toThisPoint){
        for (int j = 0; j < toThisPoint; j++) {
            if (numbers[j] ==numbers[toThisPoint]){
                System.out.println("This number has already been used, Pleas input a new number!");
                return true;
            }
        }
        return false;
    }

}
