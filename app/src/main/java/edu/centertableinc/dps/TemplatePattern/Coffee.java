package edu.centertableinc.dps.TemplatePattern;

import android.util.Log;

/**
 * Created by Rutkay on 22.02.2018.
 */

public class Coffee extends HotContent {
    public Coffee()
    {
    }

    //content can be changed according to type of HotContent
    public void addContent()
    {
        Log.d("TemplatePattern","Coffee, addContent(), COFFEE");
    }

    //gredients can be changed according to type of HotContent
    public void addAdditionalIngradients()
    {
        Log.d("TemplatePattern","Coffee, addAdditionalGradients(), MILK");

    }
}
