package com.design.patterns.creational.factory;

import static com.design.patterns.creational.factory.PLATFORMS.IOS;

public class Flutter {
    public static UiFactory getUiFactory(PLATFORMS platform){
        if(IOS.equals(platform)){
            return new IosFactory();
        }else{
            return new AndroidFactory();
        }
    }
}
