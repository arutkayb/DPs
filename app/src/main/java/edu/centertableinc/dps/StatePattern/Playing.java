package edu.centertableinc.dps.StatePattern;

import android.util.Log;

/**
 * Created by Rutkay on 26.02.2018.
 */

public class Playing extends State {
    GameStationContext context;

    public Playing(GameStationContext gameStationContext){
        context = gameStationContext;
    }

    @Override
    public String getName()
    {
        return "Playing";
    }

    @Override
    public boolean turnOn() {
        return super.turnOn();
    }

    @Override
    public boolean turnOff() {
        return super.turnOff();
    }

    @Override
    public boolean playGame() {
        Log.d("StatePattern", "Restarting the game");
        context.setState(context.getPlayingState());
        return true;
    }

    @Override
    public boolean exitGame() {
        Log.d("StatePattern", "Leaving the game");
        context.setState(context.getStandByState());
        return true;
    }
}
