package org.example;

public class Ethereum {
   private double priceStart;

    public Ethereum(){
        this.priceStart = 2000;
    }

    public double getPriceStart(){
        return priceStart;
    }

    @Override
    public  String toString() {
        return " "+ priceStart;
    }

}
