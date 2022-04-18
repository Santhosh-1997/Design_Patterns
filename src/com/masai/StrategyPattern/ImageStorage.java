package com.masai.StrategyPattern;

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter){

        compressor.compress(fileName);

        filter.filter(fileName);
    }

}
