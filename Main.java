package com.company;


import com.company.lotteryGame.LotteryGame;
import com.company.lotteryGame.LotteryType;
import com.company.lotteryGame.LottoNumbers;
import com.company.lotteryGame.LottoStatistic;

public class Main {

    public static void main(String[] args) {

        LottoNumbers lottoTicket = new LottoNumbers(LotteryType.AutomaticGeneration);
        System.out.println("My Lottery Numbers: ");
        System.out.println(lottoTicket);
        
        LotteryGame lg = new LotteryGame();
        int[] hits = lg.play(lottoTicket, 52);
        LottoStatistic ls = new LottoStatistic(hits);
        System.out.println();

        System.out.println("Chance of winning for all weeks : " + ls.chanceOfWinning()  * 100 + " % ");

        for (int i = 1; i < 6; i++) {
            System.out.println("Chance of winning with " + i +" : " + ls.chanceOfThisKindOfHit(i) * 100 + " % ");
        }
    
    }
}
