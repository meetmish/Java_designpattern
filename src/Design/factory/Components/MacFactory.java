package Design.factory.Components;

import Design.factory.Components.Buttons.Buttons;
import Design.factory.Components.Buttons.MacButton;
import Design.factory.Components.Dropdown.Dropdown;
import Design.factory.Components.Dropdown.MacDropdown;
import Design.factory.Components.Menu.MacMenu;
import Design.factory.Components.Menu.Menu;

public class MacFactory implements UiFactory {

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Buttons createButton() {
        return new MacButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new MacDropdown();
    }
}
