package com.animals.helper;

import java.util.HashMap;
import java.util.Map;

import com.animals.bean.Animal;
import com.animals.interfaces.Flyable;
import com.animals.interfaces.Speakable;
import com.animals.interfaces.Swimmable;
import com.animals.interfaces.Walkable;

public class AnimalCount {
	Animal[] animals;
    int flyingAnimal = 0;
    int walkingAnimal = 0;
    int speakingAnimal = 0;
    int swimingAnimal = 0;
    
    Map<String,Integer> actionsCount = new HashMap<String,Integer>();


    public AnimalCount(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
        	System.out.println("anmials:"+animals[i]);
            if (animals[i] instanceof Flyable) {
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
            System.out.println("flyingAnimal:"+flyingAnimal);
        }
        
        actionsCount.put("flyingAnimal", flyingAnimal);
        actionsCount.put("walkingAnimal", walkingAnimal);
        actionsCount.put("speakingAnimal", speakingAnimal);
        actionsCount.put("swimingAnimal", swimingAnimal);
    }

    public int getFlyingAnimal() {
        return flyingAnimal;
    }

    public void setFlyingAnimal(int flyingAnimal) {
        this.flyingAnimal = flyingAnimal;
    }

    public int getWalkingAnimal() {
        return walkingAnimal;
    }

    public void setWalkingAnimal(int walkingAnimal) {
        this.walkingAnimal = walkingAnimal;
    }

    public int getSpeakingAnimal() {
        return speakingAnimal;
    }

    public void setSpeakingAnimal(int speakingAnimal) {
        this.speakingAnimal = speakingAnimal;
    }

    public int getSwimingAnimal() {
        return swimingAnimal;
    }

    public void setSwimingAnimal(int swimingAnimal) {
        this.swimingAnimal = swimingAnimal;
    }

	public Map<String, Integer> getActionsCount() {
		return actionsCount;
	}

	public void setActionsCount(Map<String, Integer> actionsCount) {
		this.actionsCount = actionsCount;
	}

}
