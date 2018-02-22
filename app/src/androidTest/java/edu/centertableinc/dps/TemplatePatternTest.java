package edu.centertableinc.dps;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import edu.centertableinc.dps.TemplatePattern.Barista;
import edu.centertableinc.dps.TemplatePattern.Coffee;
import edu.centertableinc.dps.TemplatePattern.HotContent;
import edu.centertableinc.dps.TemplatePattern.Tea;

@RunWith(AndroidJUnit4.class)
public class TemplatePatternTest {
    @Test
    public void prepareCoffee() throws Exception {
        HotContent coffee = new Coffee();
        Barista barista = new Barista(coffee);
        barista.prepareContent();
    }

    @Test
    public void prepareTea() throws Exception {
        HotContent tea = new Tea();
        Barista barista = new Barista(tea);
        barista.prepareContent();
    }
}
