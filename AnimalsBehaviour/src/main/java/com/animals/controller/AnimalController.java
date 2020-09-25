package com.animals.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.animals.bean.Animal;
import com.animals.helper.AnimalCount;


@Controller
public class AnimalController {
    @RequestMapping(method = RequestMethod.GET, value = "/animal/getFlyingAnimalCount")
    @ResponseBody
    public Map<String,Integer> getFlyingAnimalCount(@RequestBody Animal[] animals) {
        AnimalCount animalCount = new AnimalCount(animals);
        Map<String,Integer> flyingAnimal = animalCount.getActionsCount();
        return flyingAnimal;
    }
}
