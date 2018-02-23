package edu.centertableinc.dps;

/**
 * Created by Rutkay on 23.02.2018.
 */

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import edu.centertableinc.dps.ObserverPattern.BiteCoin;
import edu.centertableinc.dps.ObserverPattern.Investor;

@RunWith(AndroidJUnit4.class)
public class ObserverPatternTest {
    @Test
    public void takeCoinPriceChangeAction() throws Exception {
        BiteCoin biteCoin = new BiteCoin();
        Investor investor1 = new Investor("Rutkay");
        Investor investor2 = new Investor("Sezgi");
        Investor investor3 = new Investor("Berfin");

        biteCoin.attach(investor1);
        biteCoin.attach(investor2);
        biteCoin.attach(investor3);

        biteCoin.setNewPrice(5);

        biteCoin.detach(investor2);

        biteCoin.setNewPrice(3);

        biteCoin.makeSomeAction();
    }
}
