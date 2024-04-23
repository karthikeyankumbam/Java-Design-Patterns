package com.design.patterns.structural.decorator;

import com.design.patterns.structural.decorator.extraitems.ChocoChip;
import com.design.patterns.structural.decorator.extraitems.MangoScoop;
import com.design.patterns.structural.decorator.extraitems.StrawBerrySyrup;
import org.springframework.util.ObjectUtils;

public class Main {
    public static void main(String[] args) {
        Ingredient icecream=new ChocoChip(
                new StrawBerrySyrup(
                        new MangoScoop(
                                new ChocoCone()
                        )
                )
        );
        System.out.println(icecream.getCost());
        System.out.println(icecream.getDescription());
        Long x=100l;
        Long y=100l;
        System.out.println(x==y);
        String a=new String("s");
        String b=new String("s");
        System.out.println(ObjectUtils.nullSafeEquals(a,b));
    }
}
