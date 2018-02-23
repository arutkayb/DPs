package edu.centertableinc.dps.ObserverPattern;

/**
 * Created by Rutkay on 23.02.2018.
 */

public class PriceChangedEvent implements Event {
    String mDescription;
    int mNewPrice;

    public PriceChangedEvent(int newPrice)
    {
        mDescription = "PriceChangedEvent";
        mNewPrice = newPrice;
    }

    @Override
    public String getDescription()
    {
        return mDescription;
    }

    public int getNewPrice()
    {
        return mNewPrice;
    }
}
