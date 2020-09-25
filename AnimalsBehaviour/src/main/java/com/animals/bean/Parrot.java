package com.animals.bean;

import com.animals.enums.SoundEnums;
import com.animals.helper.SingHelper;
import com.animals.interfaces.Speakable;

public class Parrot extends Bird implements Speakable {
	public Parrot() {
        super(new SingHelper(SoundEnums.DEFAULT));
    }

    public Parrot(SingHelper singHelper) {
        super(singHelper);
    }

    public void canSpeak() {
        System.out.println(SoundEnums.DEFAULT);
    }
    
    
}
