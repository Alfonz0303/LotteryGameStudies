package com.company.lotteryGame;

public class LottoStatistic {
    int[] hits;

    public LottoStatistic(int[] hits) {
        this.hits = hits;
    }

    public double chanceOfWinning(){
        double totalChanceOfWinnig = 0;
        for (int i = 0; i < hits.length; i++) {
            if (hits[i] > 0 ) {
                ++totalChanceOfWinnig;
            }
        }
        //52 weeks hit for 5 weeks atleast 1 number hit
        totalChanceOfWinnig /= hits.length; //5 / 52
        return totalChanceOfWinnig;
    }

    public double chanceOfThisKindOfHit (int kindOfHit) {
        double totalChanceOfWinnig = 0;
        for (int i = 0; i < hits.length; i++) {
            if (hits[i] == kindOfHit ) {
                ++totalChanceOfWinnig;
            }
        }

        totalChanceOfWinnig /= hits.length; //5 / 52
        return totalChanceOfWinnig;
    }

}
