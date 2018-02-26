package edu.centertableinc.dps.ObserverPattern;

import android.util.Log;

/**
 * Created by Rutkay on 23.02.2018.
 */

public class Investor implements Observer {
    String mName;
    int mCurrentPrice;

    public Investor(String name)
    {
        mName = name;
    }

    public String getObserverName()
    {
        return mName;
    }

    public void update(Event event)
    {
        if(event != null) {
            Log.d("ObserverPattern", "Investor name: " + mName + ",  Investor.update, event description: " + event.getDescription());

            if (event instanceof PriceChangedEvent) {
                mCurrentPrice = ((PriceChangedEvent) event).getNewPrice();
                Log.d("ObserverPattern", "New price " + mCurrentPrice);
            }
        }
        else
        {
            Log.e("ObserverPattern", "Null event");
        }
    }

    public int getCurrentPrice()
    {
        return mCurrentPrice;
    }
}
