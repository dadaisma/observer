package org.example;



public class UpPriceObserver implements ObserverInterface {

    @Override
    public void update(){
        System.out.println("Price goes up");
    }
}
