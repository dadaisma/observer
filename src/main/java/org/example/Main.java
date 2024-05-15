package org.example;

public class Main {
    public static void main(String[] args) {


        Ethereum ethereum = new Ethereum();
        System.out.println("\nInitial start price of Ethereum is: "+ ethereum+" $");

        ManagerObservable observable = new ManagerObservable();

        System.out.println("\n ****** Oservable  says: BIG UPDATE! ******");

        observable.addObserver(new UpPriceObserver());
        observable.addObserver(new DownPriceObserver());

        //generating random price
        double randomChange = Math.round((Math.random() * 400 - 200) * 100) / 100.0;
       double actualEthereumPrice= ethereum.getPriceStart() + randomChange;
        System.out.println("Now Ethereum value has changed to: "+ actualEthereumPrice +" $");



        observable.notifyObservers(ethereum, actualEthereumPrice);



    }
}