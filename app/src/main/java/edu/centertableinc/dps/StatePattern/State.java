package edu.centertableinc.dps.StatePattern;

import android.util.Log;

/**
 * Created by Rutkay on 26.02.2018.
 */

public abstract class State {
    public abstract String getName();

    public final void stateEnter()
    {
        Log.d("StatePattern", "Entering to the state " + getName());
    }

    public final void stateExit()
    {
        Log.d("StatePattern", "Exiting from the state " + getName());
    }

    public boolean turnOn()
    {
        Log.d("StatePattern", "Cannot change state from " + getName() + ", to turnOn");
        return false;
    }

    public boolean turnOff()
    {
        Log.d("StatePattern", "Cannot change state from " + getName() + ", to turnOff");
        return false;
    }

    public boolean playGame()
    {
        Log.d("StatePattern", "Cannot change state from " + getName() + ", to playGame");
        return false;
    }

    public boolean exitGame()
    {
        Log.d("StatePattern", "Cannot change state from " + getName() + ", to exitGame");
        return false;
    }
}
