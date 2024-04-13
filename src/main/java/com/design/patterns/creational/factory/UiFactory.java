package com.design.patterns.creational.factory;

import com.design.patterns.creational.factory.products.Button;
import com.design.patterns.creational.factory.products.Menu;

public interface UiFactory {
    Button createButton();
    Menu createMenu();
}
