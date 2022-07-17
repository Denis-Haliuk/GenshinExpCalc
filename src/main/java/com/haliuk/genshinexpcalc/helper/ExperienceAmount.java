package com.haliuk.genshinexpcalc.helper;

public enum ExperienceAmount {

    TWENTY(120_175),
    FORTY(698_500),
    FIFTY(1_277_600),
    SIXTY(2_131_725),
    SEVENTY(3_327_650),
    EIGHTY(4_939_525),
    NINETY(8_362_550);

    private final int amount;

    ExperienceAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount(){
        return amount;
    }
}
