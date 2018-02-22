package edu.centertableinc.dps.TemplatePattern;

/**
 * Created by Rutkay on 22.02.2018.
 */

public class Barista {
    HotContent content;

    public Barista( HotContent hotContent){
        content = hotContent;
    }

    public boolean prepareContent()
    {
        content.prepare();
        return true;
    }
}
