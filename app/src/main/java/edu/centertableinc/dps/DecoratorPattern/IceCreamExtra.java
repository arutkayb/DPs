package edu.centertableinc.dps.DecoratorPattern;

/**
 * Created by Rutkay on 28.02.2018.
 */

public abstract class IceCreamExtra implements IceCream {
    public abstract  int getCost();

    public abstract String getDescription();

    abstract String getExtraName();
    abstract int getExtraCost();
    abstract IceCream getIceCream();
}
