package edu.centertableinc.dps;

import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import edu.centertableinc.dps.StatePattern.AtariConsole;

/**
 * Created by Rutkay on 26.02.2018.
 */

@RunWith(AndroidJUnit4.class)
public class StatePatternTest {
    @Test
    public void comeAndPlaySomeGame() throws Exception {
        boolean status = false;
        AtariConsole atariConsole = new AtariConsole();

        status = atariConsole.pressStart();
        Assert.assertEquals(status, false);

        status = atariConsole.pressTurnOn();
        Assert.assertEquals(status, true);

        status = atariConsole.pressStart();
        Assert.assertEquals(status, true);

        status = atariConsole.pressTurnOff();
        Assert.assertEquals(status, false);

        status = atariConsole.pressExit();
        Assert.assertEquals(status, true);

        status = atariConsole.pressTurnOff();
        Assert.assertEquals(status, true);

    }
}