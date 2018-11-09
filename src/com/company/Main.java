package com.company;

import com.company.Consumers.CarnivoreConsumersPackage.*;
import com.company.Consumers.HerbivoreConsumersPackage.*;
import com.company.Consumers.OmnivoresConsumersPackage.*;
import com.company.Producers.*;
import com.company.Recyclers.Decomposers.*;
import com.company.Recyclers.Detritivores.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {





//Siblings Homework
        checkSiblings();
//Exceptions Homework
       exceptions();

//Generics Homework
        TestListWithGenerics test = new TestListWithGenerics();

        test.removeSpeedTest();
        test.addSpeedTest();

    }
    public static  void checkSiblings(){
        ServiceClass sc = new ServiceClass();
        Eagle eagle = new Eagle(5,20,"Male","Bald eagle",150.23,2.1f);
        Eagle eagle2 = new Eagle(5,20,"Male","Bald eagle",1500.23,2.1f);
        Lion lion = new Lion(190,12,"Male",80);
        Tiger tiger = new Tiger(300,16,"Male",55,"Amur");
        Bacteria bacteria = new Bacteria();
        Mushroom mushroom = new Mushroom();
        Deer deer = new Deer();
        Horse horse = new Horse();
        Sheep sheep= new Sheep();
        Bear bear = new Bear();
        Hedgehog hedgehog = new Hedgehog();
        Pig pig = new Pig();
        Crab crab = new Crab();
        Worm worm =new  Worm();
        Tree tree = new Tree();
        Flower flower = new Flower();

        ArrayList<Object> list_of_objects = new ArrayList<>();
        list_of_objects.add(eagle);
        list_of_objects.add(lion);
        list_of_objects.add(bacteria);
        list_of_objects.add(tiger);
        list_of_objects.add(worm);
        list_of_objects.add(mushroom);
        list_of_objects.add(deer);
        list_of_objects.add(horse);
        list_of_objects.add(sheep);
        list_of_objects.add(bear);
        list_of_objects.add(hedgehog);
        list_of_objects.add(pig);
        list_of_objects.add(crab);
        list_of_objects.add(tree);
        list_of_objects.add(flower);
        for (int i = 0; i <list_of_objects.size() ; i++) {
            for (int j = 0; j <list_of_objects.size()-1 ; j++) {
                sc.checkSiblings(list_of_objects.get(i),list_of_objects.get(j+1));

            }

        }
    }
    public static  void exceptions(){
        ServiceClass sc = new ServiceClass();
        Deer deer = new Deer();
        Lion lion = new Lion(190,12,"Male",80);
        Worm worm = new Worm();
        sc.tryToEatExceptionsHandling(lion,deer);
        try {
            sc.tryToEatExceptionsHandling(worm,deer);
        }catch (EatingException e ){

            System.out.println("User friendly message to avoid this error");
        }

        System.out.println("Still working");
    }
}
