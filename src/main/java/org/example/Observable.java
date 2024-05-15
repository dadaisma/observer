package org.example;

import org.example.ObserverInterface;

public interface Observable {
    void addObserver(ObserverInterface o);
    void deleteObserver(ObserverInterface o);

    void notifyObservers();
}
