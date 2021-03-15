package com.company.lotteryGame;

public class LottoNumbers {
    private int[] numbers = null;

    public LottoNumbers(LotteryType generate){
        if (generate == LotteryType.AutomaticGeneration){
            numbers = LotteryNumberRandomGenerator.generateLotteryNumbers();
        } else if (generate == LotteryType.ManualGenerator) {
            numbers = FillLotteryTicketManually.fill();
        }
    }

    @Override
    public String toString() {
        String lotteryNumbers = "";
        for (int i = 0; i < numbers.length; i++) {
            lotteryNumbers += "Lottery Number " + i + ".th is " + numbers[i] + System.lineSeparator();
        }
        return lotteryNumbers;
    }

    public int getLength(){
        return numbers.length;
    }

    public int getNumber(int index) {
        return numbers[index];//primitive type, the original numbers will not override form the outside
    }

}


