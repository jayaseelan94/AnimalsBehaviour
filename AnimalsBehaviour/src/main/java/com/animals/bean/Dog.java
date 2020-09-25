package com.animals.bean;

import com.animals.enums.SoundEnums;
import com.animals.helper.SingHelper;

public class Dog extends Mammal{
	 public Dog() {
	        super((new SingHelper(SoundEnums.DOG)));
	    }

	    public Dog(SingHelper singHelper) {
	        super(singHelper);
	    }
}
