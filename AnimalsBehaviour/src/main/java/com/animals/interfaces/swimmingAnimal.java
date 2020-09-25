package com.animals.interfaces;

import com.animals.utils.Constants;

public interface swimmingAnimal extends Swimmable {
    default void swim() {
        System.out.println(Constants.I_AM_SWIMMING);
    }
}
