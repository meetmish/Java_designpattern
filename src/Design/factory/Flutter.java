package Design.factory;

import Design.factory.Components.UIFactoryFactory;
import Design.factory.Components.UiFactory;

public class Flutter {

    private SupportedPlatform supportedPlatform;

    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }
    public void setTheme(){
        System.out.println("Set theme is being set");
    }

    public void setRefreshRate(){
        System.out.println("Set Refresh rate");
    }

    public UiFactory createFactory(){
        return UIFactoryFactory.getUIfactory(supportedPlatform);
    }
}
