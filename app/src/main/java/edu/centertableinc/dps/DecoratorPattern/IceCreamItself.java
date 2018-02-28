package edu.centertableinc.dps.DecoratorPattern;

import android.util.Log;

/**
 * Created by Rutkay on 28.02.2018.
 */

public class IceCreamItself implements IceCream  {
    String mDescription;
    int mCost;

    public IceCreamItself(String description, int cost)
    {
        mDescription = description;
        mCost = cost;
        Log.d("DecoratorPattern", "IceCreamItself description:" + mDescription + ", cost:" + String.valueOf(mCost));
    }

    @Override
    public int getCost() {
        Log.d("DecoratorPattern", "Total cost for "+ getDescription()+ ": " + String.valueOf(mCost));
        return mCost;
    }

    @Override
    public String getDescription() {
        return mDescription;
    }
}
