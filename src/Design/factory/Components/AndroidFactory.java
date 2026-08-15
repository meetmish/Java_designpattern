package Design.factory.Components;

import Design.factory.Components.Buttons.AndroidButton;
import Design.factory.Components.Buttons.Buttons;
import Design.factory.Components.Dropdown.AndroidDropdown;
import Design.factory.Components.Dropdown.Dropdown;
import Design.factory.Components.Menu.AndroidMenu;
import Design.factory.Components.Menu.Menu;

public class AndroidFactory implements UiFactory{
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Buttons createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
