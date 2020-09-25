package com.animals.bean;

import com.animals.interfaces.Speakable;
import com.animals.interfaces.Swimmable;
import com.animals.utils.Constants;
import com.animals.utils.SoundUtil;

public class Duck extends Bird implements Swimmable,Speakable{
	
    public void sing() {
    	  System.out.println(SoundUtil.Duck_Says);
    }
	
    public void swim() {
        System.out.println(Constants.I_AM_SWIMMING);
    }
    
    public void canSpeak() {
        System.out.println(SoundUtil.Duck_Says);
    }
    
}
