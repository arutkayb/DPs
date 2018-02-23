package edu.centertableinc.dps.ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Rutkay on 23.02.2018.
 */

public class BiteCoin implements Subject {
    List<Observer> observers;
    int mPrice;

    public BiteCoin()
    {
        observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        mPrice = 0;
    }

    @Override
    public void detach(Observer observer) {
        int i = observers.indexOf(observer);

        if(i>0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers(Event event) {
        Iterator it = observers.iterator();
        while(it.hasNext()) {
            ((Observer)it.next()).update(event);
        }
    }

    public void setNewPrice(int newPrice)
    {
        if(newPrice != mPrice)
        {
            mPrice = newPrice;
            notifyObservers(new PriceChangedEvent(newPrice));
        }
    }

    public void makeSomeAction()
    {
        notifyObservers(new GenericEvent());
    }
}
