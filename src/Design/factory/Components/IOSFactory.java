package Design.factory.Components;

import Design.factory.Components.Buttons.Buttons;
import Design.factory.Components.Buttons.IosButton;
import Design.factory.Components.Dropdown.Dropdown;
import Design.factory.Components.Dropdown.IosDropdown;
import Design.factory.Components.Menu.IosMenu;
import Design.factory.Components.Menu.Menu;

public class IOSFactory implements UiFactory{
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public Buttons createButton() {
        return new IosButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
