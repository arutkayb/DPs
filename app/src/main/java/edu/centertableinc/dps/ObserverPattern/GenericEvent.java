package edu.centertableinc.dps.ObserverPattern;

/**
 * Created by Rutkay on 23.02.2018.
 */

public class GenericEvent implements Event {
    String mDescription;

    public GenericEvent()
    {
        mDescription = "GenericEvent";
    }

    @Override
    public String getDescription()
    {
        return mDescription;
    }
}
