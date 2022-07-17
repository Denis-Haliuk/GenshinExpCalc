package com.haliuk.genshinexpcalc.service;

import com.haliuk.genshinexpcalc.helper.ExperienceAmount;


public class ExperienceCalculatorImpl implements ExperienceCalculator {

    private static final int purpleBook = 20000;
    private static final int blueBook = 5000;
    private static final int whiteBook = 1000;

    private int neededPurpleBooks = 0;
    private int neededBlueBooks = 0;
    private int neededWhiteBooks = 0;
    private int neededExp = 0;

    public int getNeededPurpleBooks() {
        return neededPurpleBooks;
    }

    public void setNeededPurpleBooks(int neededPurpleBooks) {
        this.neededPurpleBooks = neededPurpleBooks;
    }

    public int getNeededBlueBooks() {
        return neededBlueBooks;
    }

    public void setNeededBlueBooks(int neededBlueBooks) {
        this.neededBlueBooks = neededBlueBooks;
    }

    public int getNeededWhiteBooks() {
        return neededWhiteBooks;
    }

    public void setNeededWhiteBooks(int neededWhiteBooks) {
        this.neededWhiteBooks = neededWhiteBooks;
    }

    private int CalculateExp(int amountOfExistingExp, int lvl) {
        return switch (lvl) {
            case 20 ->  ExperienceAmount.TWENTY.getAmount() - amountOfExistingExp;
            case 40 ->  ExperienceAmount.FORTY.getAmount() - amountOfExistingExp;
            case 50 ->  ExperienceAmount.FIFTY.getAmount() - amountOfExistingExp;
            case 60 ->  ExperienceAmount.SIXTY.getAmount() - amountOfExistingExp;
            case 70 ->  ExperienceAmount.SEVENTY.getAmount() - amountOfExistingExp;
            case 80 ->  ExperienceAmount.EIGHTY.getAmount() - amountOfExistingExp;
            case 90 ->  ExperienceAmount.NINETY.getAmount() - amountOfExistingExp;
            default ->  0;
        };
    }

    public int CalculateNeededPurpleBooks(int amountOfExistingExp, int lvl) {

        int amountOfNeededExp = CalculateExp(amountOfExistingExp, lvl);
        int neededPurpleBooks = 0;
        while (amountOfExistingExp < amountOfNeededExp){
            amountOfNeededExp -= purpleBook;
            neededPurpleBooks++;
        }

        return neededPurpleBooks;
    }


    private int CalculateNeededBlueBooks(int amountOfExistingExp, int lvl) {

        return 0;
    }


    private int CalculateNeededWhiteBooks(int amountOfExistingExp, int lvl) {
        return 0;
    }

    @Override
    public int CalculateNeededBooks(int amountOfExistingExp, int lvl) {
        CalculateExp(amountOfExistingExp, lvl);
        this.neededPurpleBooks = CalculateNeededPurpleBooks(amountOfExistingExp, neededExp);


        return 0;
    }
}

