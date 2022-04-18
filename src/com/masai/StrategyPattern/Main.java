package com.masai.StrategyPattern;

public class Main {

    public static void main(String[] args) {

        ImageStorage imageStorage = new ImageStorage();

        imageStorage.store("abc",new JpegCompressor(), new BlackAndWhite());

    }

}
