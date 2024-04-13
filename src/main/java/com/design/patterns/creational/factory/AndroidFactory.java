package com.design.patterns.creational.factory;

import com.design.patterns.creational.factory.UiFactory;
import com.design.patterns.creational.factory.products.AndroidButton;
import com.design.patterns.creational.factory.products.AndroidMenu;
import com.design.patterns.creational.factory.products.Button;
import com.design.patterns.creational.factory.products.Menu;

public class AndroidFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
