package com.ericliu.developer.abstractFactory.component;

public class USASuperTurbine implements Engine {

    @Override
    public void outputPower() {
        System.out.println("Go USA! 35 knot");
    }
}
