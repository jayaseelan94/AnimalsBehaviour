package com.animals.bean;

import com.animals.enums.SoundEnums;
import com.animals.helper.SingHelper;

public class Cat extends Mammal {
	public Cat() {
        super(new SingHelper(SoundEnums.CAT));
    }

    public Cat(SingHelper singHelper) {
        super(singHelper);
    }
}
