package edu.centertableinc.dps.StatePattern;

/**
 * Created by Rutkay on 26.02.2018.
 */

public interface GameStationContext {
    boolean pressStart();
    boolean pressExit();
    boolean pressTurnOn();
    boolean pressTurnOff();
    State getTurnedOffState();
    State getStandByState();
    State getPlayingState();

    State getCurrentState();
    void setState(State state);

}
