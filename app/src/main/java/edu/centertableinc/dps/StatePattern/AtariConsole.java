package edu.centertableinc.dps.StatePattern;

import android.util.Log;

/**
 * Created by Rutkay on 26.02.2018.
 */

public class AtariConsole implements GameStationContext {
    State turnedOff;
    State standBy;
    State playing;

    State currentState;

    public AtariConsole()
    {
        turnedOff = new TurnedOff(this);
        standBy = new StandBy(this);
        playing = new Playing(this);

        Log.d("StatePattern", "Atari is off");
        currentState = turnedOff;
    }

    @Override
    public boolean pressStart() {
        Log.d("StatePattern", "StartGame button is pressed");
        return getCurrentState().playGame();
    }

    @Override
    public boolean pressExit() {
        Log.d("StatePattern", "ExitGame button is pressed");
        return getCurrentState().exitGame();
    }

    @Override
    public boolean pressTurnOn() {
        Log.d("StatePattern", "Turn-on machine button is pressed");
        return getCurrentState().turnOn();
    }

    @Override
    public boolean pressTurnOff() {
        Log.d("StatePattern", "Turn-off machine button is pressed");
        return getCurrentState().turnOff();
    }

    @Override
    public State getCurrentState() {
        return currentState;
    }

    @Override
    public void setState(State state) {
        Log.d("StatePattern", "setState( " + state.getName() + ")");

        if(state == null) {
            Log.d("StatePattern", "new state cannot be null");
            return;
        }

        if(currentState != null)
            currentState.stateExit();

        currentState = state;
        currentState.stateEnter();
    }

    public State getTurnedOffState() {
        return turnedOff;
    }

    public State getStandByState() {
        return standBy;
    }

    public State getPlayingState() {
        return playing;
    }
}
