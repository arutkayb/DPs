package edu.centertableinc.dps.DecoratorPattern;

import android.util.Log;

/**
 * Created by Rutkay on 28.02.2018.
 */

public class CaramelaSauce extends IceCreamExtra {
    IceCream mIceCream;
    final String mName = "Caramela Sauce";
    int mCost;

    public CaramelaSauce(IceCream iceCream, int cost)
    {
        mIceCream = iceCream;
        mCost = cost;
        Log.d("DecoratorPattern", "IceCreamExtra name:" + mName + ", cost:" + String.valueOf(mCost));
    }

    @Override
    public String getExtraName() {
        return mName;
    }

    @Override
    public IceCream getIceCream()
    {
        return mIceCream;
    }

    @Override
    public int getExtraCost()
    {
        return mCost;
    }

    @Override
    public int getCost() {
        int totalCost = getIceCream().getCost() + getExtraCost();
        Log.d("DecoratorPattern", "Total cost for "+ getDescription() + ": " + String.valueOf(totalCost));
        return totalCost;
    }

    @Override
    public String getDescription() {
        return getIceCream().getDescription() + " plus " + getExtraName();
    }
}
