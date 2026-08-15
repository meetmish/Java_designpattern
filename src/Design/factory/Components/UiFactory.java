package Design.factory.Components;

import Design.factory.Components.Buttons.Buttons;
import Design.factory.Components.Dropdown.Dropdown;
import Design.factory.Components.Menu.Menu;

public interface UiFactory {
    Menu createMenu();
    Buttons createButton();
    Dropdown createDropdown();
}
