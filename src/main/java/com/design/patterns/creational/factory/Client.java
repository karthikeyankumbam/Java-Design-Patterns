package com.design.patterns.creational.factory;

import static com.design.patterns.creational.factory.PLATFORMS.IOS;

public class Client {
    public static void main(String[] args) {
        UiFactory uiFactory=Flutter.getUiFactory(IOS);
        uiFactory.createMenu().render();
        uiFactory.createButton().click();
    }
}
