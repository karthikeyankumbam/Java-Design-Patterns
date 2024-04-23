package com.design.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        InventoryPlaceOrderEventHandler inventoryPlaceOrderEventHandler=new InventoryPlaceOrderEventHandler();
        SellerPlaceOrderEventHandler sellerPlaceOrderEventHandler=new SellerPlaceOrderEventHandler();
        Publisher.getInstance().placeOrder();
        sellerPlaceOrderEventHandler.unregister();
        Publisher.getInstance().placeOrder();
    }
}
