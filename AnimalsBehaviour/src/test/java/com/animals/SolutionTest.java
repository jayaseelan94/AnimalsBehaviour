package com.animals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import com.animals.bean.Animal;
import com.animals.bean.Bird;
import com.animals.bean.Butterfly;
import com.animals.bean.Chicken;
import com.animals.bean.Clownfish;
import com.animals.bean.Duck;
import com.animals.bean.Fish;
import com.animals.bean.Parrot;
import com.animals.bean.Shark;
import com.animals.enums.Gender;
import com.animals.enums.LanguageEnums;
import com.animals.enums.SoundEnums;
import com.animals.helper.AnimalCount;
import com.animals.helper.SingHelper;
import com.animals.bean.Dog;
import com.animals.bean.Dolphin;
import com.animals.bean.Cat;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SolutionTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);
	
	  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	  private final PrintStream originalOut = System.out;
	  
	  
	
	  @BeforeAll
	    public static void setUp() {
	        System.out.println("@BeforAll - Executes");
	    }

	    @BeforeEach
	    public void init() {
	        System.out.println("@BeforeEach - Executes");
	        System.setOut(new PrintStream(outContent));
	    }

	    @AfterEach
	    void restoreStreams() {
	        System.setOut(originalOut);
	    }

	    @Test
	    void walk() {
	        new Bird().walk();
	        assertThat(outContent.toString(), containsString("I am walking"));
	    }

	    @Test
	    void fly() {
	        new Bird().fly();
	        assertThat(outContent.toString(), containsString("I am flying"));
	        new Duck().fly();
	        assertThat(outContent.toString(), containsString("I am flying"));
	        
	        new Butterfly().fly();
	        assertThat(outContent.toString(), containsString("I cant Fly"));
	        new Butterfly().transform();

	        new Butterfly().fly();
	        assertThat(outContent.toString(), containsString("flying"));
	    }

	    @Test
	    void sing() {
	    	new Bird().makeSound("I am singing");
	        new Bird().makeSound();
	        assertThat(outContent.toString(), containsString("I am singing"));
	        new Duck().makeSound("Quack, quack");
	        new Duck().makeSound();
	        assertThat(outContent.toString(), containsString("Quack, quack"));
	       
	        //Chicken
	        new Chicken().setSex(Gender.FEMALE);
	        new Chicken().canSpeak();
	        assertThat(outContent.toString(), containsString("Cluck, cluck"));

	        //Rooster
	        new Chicken().setSex(Gender.MALE);
	        new Chicken().canSpeak();
	        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
	        new Chicken(LanguageEnums.DANISH).makeSound();
	        assertThat(outContent.toString(), containsString("kykyliky"));
	        
	        new Dog(new SingHelper(SoundEnums.DOG)).canSpeak();
	        assertThat(outContent.toString(), containsString("Woof, woof"));
	        new Cat(new SingHelper(SoundEnums.CAT)).canSpeak();
	        assertThat(outContent.toString(), containsString("Meow"));
	        
	        //Parrot
	        new Parrot().makeSound();
	        assertThat(outContent.toString(), containsString("I am singing"));
	        new Parrot(new SingHelper(SoundEnums.DOG)).makeSound();
	        assertThat(outContent.toString(), containsString("Woof, woof"));
	        new Parrot(new SingHelper(SoundEnums.CAT)).makeSound();
	        assertThat(outContent.toString(), containsString("Meow"));
	        new Parrot(new SingHelper(SoundEnums.ROOSTER)).makeSound();
	        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
	        
	        //Butterfly
	        new Butterfly().canSpeak();
	        assertThat(outContent.toString(), containsString("caterpillar"));
	        new Butterfly().transform();
	        new Butterfly().canSpeak();
	        assertThat(outContent.toString(), containsString(""));
	        
	    }
	    
	    @Test
	    void bodyColor() {
	        assertEquals(new Fish().bodyColor(), null);
	        assertEquals(new Shark().bodyColor(), "grey");
	        assertEquals(new Clownfish().bodyColor(), "orange");

	    }
	    
	    @Test
	    void bodySize() {
	        assertEquals(new Fish().bodySize(), null);
	        assertEquals(new Shark().bodySize(), "large");
	        assertEquals(new Clownfish().bodySize(), "small");
	    }
	    
	    @Test
	    void extraFishTest() {
	        new Shark().canEat();
	        assertThat(outContent.toString(), containsString("I eat fish"));
	        new Clownfish().makeJoke();
	        assertThat(outContent.toString(), containsString("I make jokes"));
	    }
	    
	    @Test
	    void CountingAnimals() {

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
	        AnimalCount animalCount = new AnimalCount(animals);

	        assertEquals(animalCount.getFlyingAnimal(), 1);
	        assertEquals(animalCount.getWalkingAnimal(), 5);
	        assertEquals(animalCount.getSpeakingAnimal(), 2);
	        assertEquals(animalCount.getSwimingAnimal(), 5);


	    }
	   
}
