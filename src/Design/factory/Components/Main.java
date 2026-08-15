package Design.factory.Components;

import Design.factory.Components.Buttons.Buttons;
import Design.factory.Components.Dropdown.Dropdown;
import Design.factory.Components.Menu.Menu;
import Design.factory.Flutter;
import Design.factory.SupportedPlatform;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UiFactory factory  =  flutter.createFactory();
        Menu menu = factory.createMenu();
        Buttons button = factory.createButton();
        Dropdown dropdown = factory.createDropdown();
    }
}
