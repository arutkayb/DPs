package edu.centertableinc.dps.ObserverPattern;

import java.util.List;

/**
 * Created by Rutkay on 23.02.2018.
 */

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(Event event);
}
