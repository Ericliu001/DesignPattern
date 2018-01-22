package com.ericliu.developer.abstractFactory.component;

public class IJN6InchGun implements Weapon {

    @Override
    public void launch() {
        System.out.println("Japanese 6 inch gun fire! PUUU PUUU PUUU PUUU");
    }
}
