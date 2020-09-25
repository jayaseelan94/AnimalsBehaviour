package com.animals.bean;

import com.animals.interfaces.Flyable;
import com.animals.interfaces.Speakable;
import com.animals.interfaces.Swimmable;
import com.animals.interfaces.Walkable;

public class AnimalCount {
	Animal[] animals;
    public int flyingAnimal = 0;
    public int walkingAnimal = 0;
    public int speakingAnimal = 0;
    public int swimingAnimal = 0;


    public AnimalCount(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
        	System.out.println("Animal Name:"+animals[i]);
            if (animals[i] instanceof Flyable) {
            	System.out.println("fly:"+animals[i]);
                flyingAnimal += 1;
            }
            if (animals[i] instanceof Walkable) {
                walkingAnimal += 1;
            }
            if (animals[i] instanceof Speakable) {
                speakingAnimal += 1;
            }
            if (animals[i] instanceof Swimmable) {
                swimingAnimal += 1;
            }
        }
        
        System.out.println("flyingAnimal:"+flyingAnimal);
        System.out.println("walkingAnimal:"+walkingAnimal);
        System.out.println("speakingAnimal:"+speakingAnimal);
        System.out.println("swimingAnimal:"+swimingAnimal);
    }
}
