package com.masai.StrategyPattern;

public class BlackAndWhite implements Filter{


    @Override
    public void filter(String fileName) {
        System.out.println(fileName + " - B&W FIlter applied");
    }
}
