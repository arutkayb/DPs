package edu.centertableinc.dps.TemplatePattern;

import android.util.Log;

/**
 * Created by Rutkay on 22.02.2018.
 */

public class Tea extends HotContent {
    public Tea()
    {
    }

    //content can be changed according to type of HotContent
    public void addContent()
    {
        Log.d("TemplatePattern","Tea, addContent(), TEA");
    }

    //gredients can be changed according to type of HotContent
    public void addAdditionalIngradients()
    {
        Log.d("TemplatePattern","Tea, addAdditionalGradients(), LEMON");

    }
}