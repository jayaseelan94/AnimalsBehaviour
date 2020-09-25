package com.animals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import com.animals.bean.Animal;
import com.animals.bean.Bird;
import com.animals.bean.Butterfly;
import com.animals.bean.Cat;
import com.animals.bean.Chicken;
import com.animals.bean.Clownfish;
import com.animals.bean.Dog;
import com.animals.bean.Dolphin;
import com.animals.bean.Duck;
import com.animals.bean.Fish;
import com.animals.bean.Parrot;
import com.animals.bean.Shark;
import com.animals.controller.AnimalController;

public class AnimalControllerTest {
    @Test
	static
    void getFlyingAnimalCount() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        Map<String,Integer> flyingAnimalCount = new AnimalController().getFlyingAnimalCount(animals);
        assertEquals(flyingAnimalCount.get("flyingAnimal"),1);
        assertEquals(flyingAnimalCount.get("speakingAnimal"), 5);
        assertEquals(flyingAnimalCount.get("walkingAnimal"), 2);
        assertEquals(flyingAnimalCount.get("swimingAnimal"), 5);
    }
    
    

}