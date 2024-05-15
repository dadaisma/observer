package org.example;
import org.example.EjemploObservable;
import org.example.ObserverInterface;
public class Main {
    public static void main(String[] args) {

        EjemploObservable observable = new EjemploObservable();
        observable.addObserver(new EjemploObserver());
        observable.notifyObservers();
        System.out.println("Hello world!");
    }
}