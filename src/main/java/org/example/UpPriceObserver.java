package org.example;



public class UpPriceObserver implements ObserverInterface {

    @Override
    public void update(Ethereum ethereum, double actualEthereumPrice){
        double change = Math.round((((actualEthereumPrice - ethereum.getPriceStart()) / ethereum.getPriceStart()) * 100) * 100.0) / 100.0;
        double variance = Math.round((actualEthereumPrice-ethereum.getPriceStart())*100)/100;
        if ( actualEthereumPrice > ethereum.getPriceStart() ){
            System.out.println("\nPrice went up, sell and take PROFIT!");
            System.out.println("It gained "+ variance+ "$ "+ " Equal to " + change+ "%");
        }
    }

}
