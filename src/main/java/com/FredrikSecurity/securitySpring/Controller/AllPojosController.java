package com.FredrikSecurity.securitySpring.Controller;

import com.FredrikSecurity.securitySpring.Model.Animal;
import com.FredrikSecurity.securitySpring.Model.Student;
import com.FredrikSecurity.securitySpring.Model.Vehicle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("api")
public class AllPojosController {

    @GetMapping("/getStudents")
    public String getStudent(){
        Student student1= new Student(1, "Fredrik");
        Student student2= new Student(2, "notFredrik");
        Student student3= new Student(3, "alsoNotFredrik");
        List<Student> listOfStudentsToReturn = new ArrayList<>();
        listOfStudentsToReturn.add(student1);
        listOfStudentsToReturn.add(student2);
        listOfStudentsToReturn.add(student3);
        return listOfStudentsToReturn.toString();
    }

    @GetMapping("/getAnimals")
    public List<Animal> getAnimals(){
        Animal animal1= new Animal(41, "Cat");
        Animal animal2= new Animal(42, "Dog");
        Animal animal3= new Animal(43, "Wolf");
        List<Animal> listOfAnimalsToReturn = new ArrayList<>();
        listOfAnimalsToReturn.add(animal1);
        listOfAnimalsToReturn.add(animal2);
        listOfAnimalsToReturn.add(animal3);
        return listOfAnimalsToReturn;
    }

    @GetMapping("/getACar")
    public Vehicle getACar(){
        Vehicle vehicle1 = new Vehicle(100, "A Blue Toyota");
        return vehicle1;
    }

}
