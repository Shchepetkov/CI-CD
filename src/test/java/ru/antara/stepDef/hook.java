package ru.antara.stepDef;

import io.cucumber.java.Before;

public class hook {
    @Before
    public void before() {
        System.out.println("This is BEFORE!\n");
    }
}
