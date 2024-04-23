package com.design.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private List<EventHandler> eventHandlers;
    private Publisher(){
        eventHandlers=new ArrayList<>();
    }
    private static Publisher INSTANCE=new Publisher();
    public static Publisher getInstance(){
        return INSTANCE;
    }
    public void register(EventHandler eventHandler){
        eventHandlers.add(eventHandler);;
    }
    public void unregister(EventHandler eventHandler){
        eventHandlers.remove(eventHandler);;
    }
    public void placeOrder(){
        for(EventHandler e:eventHandlers){
            e.handle();
        }
    }
}
