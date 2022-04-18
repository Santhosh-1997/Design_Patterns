package com.masai.StrategyPattern;

public class PngCompressor implements Compressor{


    @Override
    public void compress(String fileName) {
        System.out.println(fileName + " is compressed using PNG");
    }
}
