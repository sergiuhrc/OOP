package com.company;

import com.company.consumers.CarnivoreConsumersPackage.*;
import com.company.consumers.HerbivoreConsumersPackage.*;
import com.company.consumers.OmnivoresConsumersPackage.*;
import com.company.producers.*;
import com.company.recyclers.Decomposers.*;
import com.company.recyclers.Detritivores.*;

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

        ArrayList<Object> listOfObejects = new ArrayList<>();
        listOfObejects.add(eagle);
        listOfObejects.add(lion);
        listOfObejects.add(bacteria);
        listOfObejects.add(tiger);
        listOfObejects.add(worm);
        listOfObejects.add(mushroom);
        listOfObejects.add(deer);
        listOfObejects.add(horse);
        listOfObejects.add(sheep);
        listOfObejects.add(bear);
        listOfObejects.add(hedgehog);
        listOfObejects.add(pig);
        listOfObejects.add(crab);
        listOfObejects.add(tree);
        listOfObejects.add(flower);
        for (int i = 0; i <listOfObejects.size() ; i++) {
            for (int j = 0; j <listOfObejects.size()-1 ; j++) {
                sc.checkSiblings(listOfObejects.get(i),listOfObejects.get(j+1));

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
