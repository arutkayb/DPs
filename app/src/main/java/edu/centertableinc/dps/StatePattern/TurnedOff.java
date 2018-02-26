package edu.centertableinc.dps.StatePattern;

import android.util.Log;

/**
 * Created by Rutkay on 26.02.2018.
 */

public class TurnedOff extends State {
    GameStationContext context;

    public TurnedOff(GameStationContext gameStationContext){
        context = gameStationContext;
    }

    @Override
    public String getName()
    {
        return "TurnedOff";
    }

    @Override
    public boolean turnOn() {
        Log.d("StatePattern", "Machine is starting up");
        context.setState(context.getStandByState());
        return true;
    }

    @Override
    public boolean turnOff() {
        return super.turnOff();
    }

    @Override
    public boolean playGame() {
        return super.playGame();
    }

    @Override
    public boolean exitGame() {
        return super.exitGame();
    }
}
