package com.animals.bean;

import com.animals.enums.Gender;
import com.animals.enums.LanguageEnums;
import com.animals.enums.SoundEnums;
import com.animals.helper.LanguageHelper;
import com.animals.helper.SingHelper;
import com.animals.interfaces.Speakable;

public class Chicken extends Bird implements Speakable  {
	
	LanguageHelper languageHelper;
    SingHelper singHelper;
    LanguageEnums languageEnums;
    
	//Relation between Rooster and chicken is Same Bread, but different Genders.
    public void canSpeak() {
		if(this.getSex() == Gender.FEMALE)
			System.out.println(SoundEnums.CHICKEN);
		else
			System.out.println(SoundEnums.ROOSTER);
    }
    
    public Chicken() {
        super(new SingHelper(SoundEnums.CHICKEN));
    }

    public Chicken(SingHelper singHelper) {
        super(singHelper);
    }
    
    public Chicken(LanguageEnums languageEnums) {
        this.singHelper = new SingHelper(SoundEnums.ROOSTER);
        this.languageEnums = languageEnums;
    }
    
    @Override
    public void makeSound(String sound) {
		super.makeSound(sound);
    }
    
    @Override
    public void makeSound() {
        String translate = LanguageHelper.translate(SoundEnums.ROOSTER.getSound(), languageEnums);
        System.out.println(translate);
    }
    
    
}
