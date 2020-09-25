package com.animals.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

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
import com.animals.interfaces.AnimalActivity;


public class AnimalService {
	
	 private List<Animal> animals;
	 
	 @PostConstruct
	    void init() {
	        animals = new ArrayList<>();
	        Animal[] animalTypes = new Animal[]{
	        		new Bird(),
	        		new Duck(),
	        		new Chicken(),
	        		new Parrot(),
	        		new Cat(),
	        		new Dog(),
	        		new Fish(),
	        		new Clownfish(),
	        		new Shark(),
	        		new Dolphin(),
	        		new Butterfly()
	        };
	       animals.addAll(Arrays.asList(animalTypes)); 
	 }       
	 
	 public int count(Class<? extends AnimalActivity> activity) {
	        return (int) animals.stream().filter(activity::isInstance).count();
	 }
	 
	
}
