package edu.centertableinc.dps.ObserverPattern;

import android.util.Log;

/**
 * Created by Rutkay on 23.02.2018.
 */

public class Investor implements Observer {
    String mName;

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

            if (event instanceof PriceChangedEvent)
                Log.d("ObserverPattern", "New price " + ((PriceChangedEvent) event).getNewPrice());
        }
        else
        {
            Log.e("ObserverPattern", "Null event");
        }
    }
}
