
package org.example;

public class DownPriceObserver implements ObserverInterface {

    @Override
    public void update(){
        System.out.println("Price goes down");
    }
}
