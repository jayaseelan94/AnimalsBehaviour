package com.animals.bean;

import com.animals.utils.Constants;

public class Clownfish extends Fish {
	@Override
    public String bodySize() {
        return Constants.S_SIZE;
    }
	
	void Clownfish() {};

    @Override
    public String bodyColor() {
        return Constants.ORNG_CLOR;
    }

    public void makeJoke() {
        System.out.println(Constants.I_MAKE_JOKES);
    }
}
