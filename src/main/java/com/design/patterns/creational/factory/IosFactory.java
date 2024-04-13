package com.design.patterns.creational.factory;

import com.design.patterns.creational.factory.UiFactory;
import com.design.patterns.creational.factory.products.Button;
import com.design.patterns.creational.factory.products.IosButton;
import com.design.patterns.creational.factory.products.IosMenu;
import com.design.patterns.creational.factory.products.Menu;

public class IosFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
