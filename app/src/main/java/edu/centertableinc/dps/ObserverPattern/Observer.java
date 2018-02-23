package edu.centertableinc.dps.ObserverPattern;

/**
 * Created by Rutkay on 23.02.2018.
 */

public interface Observer {
    String getObserverName();
    void update(Event event);
}
