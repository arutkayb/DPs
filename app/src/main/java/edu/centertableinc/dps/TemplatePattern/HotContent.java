package edu.centertableinc.dps.TemplatePattern;

import android.util.Log;

/**
 * Created by Rutkay on 22.02.2018.
 */

public abstract class HotContent {
    public HotContent(){

        }

    /*
    prepare is our template method. We don't want to its logic to be changed.
    Any HotContent must be prepared same way
    */
    public final void prepare(){
        Log.d("TemplatePattern","HotContent, prepare()");
        
        warmWaterUp();
        addContent();
        addAdditionalIngradients();
        writeCustomerNameOnCup();
    }

    /* All HotContents need hot water */
    public final void warmWaterUp()
    {
        Log.d("TemplatePattern","HotContent, warmWaterUp()");
    }

    /* Names must be written on the cup*/
    public final void writeCustomerNameOnCup()
    {
        Log.d("TemplatePattern","HotContent, writeCustomerNameOnCup()");
    }

    //content can be changed according to type of HotContent
    public abstract void addContent();

    //gredients can be changed according to type of HotContent
    public abstract void addAdditionalIngradients();
}
