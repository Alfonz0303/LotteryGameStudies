package com.company.lotteryGame;

public class LotteryGame {

    public LotteryGame(){}

    public int[] play(LottoNumbers myLotteryTicket, int numberOfWeeks) {
        int hits[] = new int[numberOfWeeks];
        for (int i = 0; i < numberOfWeeks; i++) {
            LottoNumbers weeklyWinningNumbers = new LottoNumbers(LotteryType.AutomaticGeneration);
            hits[i] = checkLotteryHits(myLotteryTicket, weeklyWinningNumbers);
        }
        return hits;
    }


    public static int checkLotteryHits (LottoNumbers playedNumbers, LottoNumbers generatedNumbers){
        int hit = 0;
        for (int i = 0; i < playedNumbers.getLength(); i++) {
            int actNumber = playedNumbers.getNumber(i);
            for (int j = 0; j < generatedNumbers.getLength(); j++) {
                int winningNumber = generatedNumbers.getNumber(j);
                if (actNumber == winningNumber) {
                    ++hit;
                }
            }
        }
        return hit;
    }

}
