package com.masai.StrategyPattern;

public class HighContrast implements Filter{


    @Override
    public void filter(String fileName) {
        System.out.println(fileName + " - HighContrast Filter is applied");
    }
}
