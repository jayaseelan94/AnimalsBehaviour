package com.animals.helper;

import com.animals.enums.SoundEnums;

public class SingHelper {
	 private SoundEnums soundEnums;

	    public SingHelper(SoundEnums soundEnums) {
	        this.soundEnums = soundEnums;
	    }

	    public void makeSound() {
	        System.out.println(soundEnums.getSound());
	    }
}
