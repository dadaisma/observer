package org.example;

public class Main {
    public static void main(String[] args) {

        EjemploObservable observable = new EjemploObservable();
        System.out.println("\nThe Watcher says: ");

        observable.addObserver(new UpPriceObserver());
        observable.addObserver(new org.example.DownPriceObserver());
        observable.notifyObservers();

      //  System.out.println("\nThe Watcher says: ");

   //     observable.notifyObservers();
    }
}