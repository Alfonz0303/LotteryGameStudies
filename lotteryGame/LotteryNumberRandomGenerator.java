package com.company.lotteryGame;

import java.util.Random;

public class LotteryNumberRandomGenerator extends BasicLotteryFiller{

    public static int[] generateLotteryNumbers() { //azért statikus mert nem akarom példányosítani
        Random rand = new Random();
        int[] tempNumbers = new int[5];
        for (int i = 0; i <= 4; i++) {
            int newNumber = rand.nextInt(90) + 1;//0-89 között gerneál számot + 1 így 1-90 között
            //mivan ha plyan szmot hőzam ki ami már volt
            tempNumbers[i] = newNumber;
            if(numberAlreadyCreated(tempNumbers, i)){
                --i;
            }
        }
        return tempNumbers;
    }

}
