package com.company.lotteryGame;

import java.util.Scanner;

public class FillLotteryTicketManually extends BasicLotteryFiller{

    private static boolean invalidLotteryNumber(int number) {
        if (number >= 1 && number <= 90) {
            return false;
        }
        return true;
    }


    public static int[] fill(){
        Scanner sc = new Scanner(System.in);
        int[] tempNumbers = new int[5];
        for (int i = 0; i <= 4; i++) {
            System.out.println("Please input a lottery number from 1 to 90!");
            tempNumbers[i] = sc.nextInt();
            if(invalidLotteryNumber(tempNumbers[i]) ||  numberAlreadyCreated(tempNumbers,  i)){
                System.out.println("Number is not a good one, please input another one!");
                --i;
            }
        }
        return tempNumbers;
    }


}
