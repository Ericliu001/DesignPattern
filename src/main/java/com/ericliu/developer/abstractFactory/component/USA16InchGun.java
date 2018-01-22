package com.ericliu.developer.abstractFactory.component;

public class USA16InchGun implements Weapon {

    @Override
    public void launch() {
        System.out.println("Uncle Sam 16 inch gun fire! BANG BANG BANG BANG");
    }
}
