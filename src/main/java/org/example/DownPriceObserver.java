
package org.example;

public class DownPriceObserver implements ObserverInterface {

    @Override
    public void update(Ethereum ethereum, double actualEthereumPrice){
        double change = Math.round((((actualEthereumPrice - ethereum.getPriceStart()) / ethereum.getPriceStart()) * 100) * 100.0) / 100.0;
        double variance = Math.round((ethereum.getPriceStart() - actualEthereumPrice)*100)/100;
        if ( actualEthereumPrice < ethereum.getPriceStart() ) {
            System.out.println("\nPrice went down, BUY THE DIP!");
            System.out.println("It lost "+ variance+ "$ "+ " Equal to " + change+ "%");
        }
    }

}
