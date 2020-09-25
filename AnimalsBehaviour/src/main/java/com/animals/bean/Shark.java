package com.animals.bean;

import com.animals.utils.Constants;

public class Shark extends Fish{
	@Override
    public String bodySize() {
        return Constants.L_SIZE;
    }

    @Override
    public String bodyColor() {
        return Constants.GRY_CLOR;
    }

    public void canEat() {
        System.out.println(Constants.I_EAT_FISH);
    }
}
