package edu.centertableinc.dps.StatePattern;

import android.util.Log;

/**
 * Created by Rutkay on 26.02.2018.
 */

public class StandBy extends State {
    GameStationContext context;

    public StandBy(GameStationContext gameStationContext)
    {
        context = gameStationContext;
    }

    @Override
    public String getName()
    {
        return "StandBy";
    }

    @Override
    public boolean turnOn() {
        return super.turnOn();
    }

    @Override
    public boolean turnOff() {
        Log.d("StatePattern", "Machine is shutting down...");
        context.setState(context.getTurnedOffState());
        return true;
    }

    @Override
    public boolean playGame() {
        Log.d("StatePattern", "Game is starting...");
        context.setState(context.getPlayingState());
        return true;
    }

    @Override
    public boolean exitGame() {
        return super.exitGame();
    }
}
