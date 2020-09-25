package com.animals.bean;


import com.animals.enums.SoundEnums;
import com.animals.helper.SingHelper;
import com.animals.interfaces.Speakable;
import com.animals.interfaces.Swimmable;
import com.animals.utils.Constants;

public class Duck extends Bird implements Swimmable,Speakable{
	
    public void swim() {
        System.out.println(Constants.I_AM_SWIMMING);
    }
    
    public Duck() {
        super(new SingHelper(SoundEnums.DUCK));
    }
    
    public void canSpeak() {
        System.out.println(SoundEnums.DUCK);
    }
    
    
}
