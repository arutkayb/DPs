package edu.centertableinc.dps;

/**
 * Created by Rutkay on 28.02.2018.
 */
import android.support.test.runner.AndroidJUnit4;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import edu.centertableinc.dps.DecoratorPattern.*;

@RunWith(AndroidJUnit4.class)
public class DecoratorPatternTest {
    @Test
    public void serveSomeIceCream() throws Exception {
        int simpleIceCreamCost = 25;
        String simpleIceCreamName = "MyPreciousIceCream";
        IceCream iceCream = new IceCreamItself(simpleIceCreamName,simpleIceCreamCost);

        Assert.assertEquals(iceCream.getCost(),simpleIceCreamCost);
        Assert.assertEquals(iceCream.getDescription(),simpleIceCreamName);

        int chocoCost = 20;
        IceCreamExtra chocoIceCream = new ChocolateSauce(iceCream,chocoCost);
        Assert.assertEquals(chocoIceCream.getCost(), chocoCost + iceCream.getCost());
        chocoIceCream.getDescription();

        int caramelaCost = 12;
        IceCreamExtra caramelaChocoIceCream = new CaramelaSauce(chocoIceCream,caramelaCost);
        Assert.assertEquals(caramelaChocoIceCream.getCost(), caramelaCost + chocoCost + simpleIceCreamCost);
        caramelaChocoIceCream.getDescription();
    }
}
