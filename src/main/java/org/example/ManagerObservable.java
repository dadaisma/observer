package org.example;

import java.util.HashSet;
import java.util.Set;

public class ManagerObservable implements Observable {
    Set<ObserverInterface> observerSet = new HashSet<>();
    @Override
    public  void addObserver(ObserverInterface o){
        observerSet.add(o);
    }
    @Override
    public void deleteObserver(ObserverInterface o){
        observerSet.remove(o);
    }

    @Override
    public void notifyObservers(Ethereum ethereum, double actualEthereumPrice){
    for (ObserverInterface observer : observerSet) {
        observer.update(ethereum, actualEthereumPrice);
    }
    }

}
