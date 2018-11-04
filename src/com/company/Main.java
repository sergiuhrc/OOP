package com.company;

import com.company.Consumers.CarnivoreConsumersPackage.Eagle;
import com.company.Consumers.CarnivoreConsumersPackage.Lion;
import com.company.Consumers.CarnivoreConsumersPackage.Tiger;
import com.company.Consumers.HerbivoreConsumersPackage.Deer;
import com.company.Consumers.HerbivoreConsumersPackage.Horse;
import com.company.Consumers.HerbivoreConsumersPackage.Sheep;
import com.company.Consumers.OmnivoresConsumersPackage.Bear;
import com.company.Consumers.OmnivoresConsumersPackage.Hedgehog;
import com.company.Consumers.OmnivoresConsumersPackage.Pig;
import com.company.Producers.Flower;
import com.company.Producers.Tree;
import com.company.Recyclers.Decomposers.Bacteria;
import com.company.Recyclers.Decomposers.Mushroom;
import com.company.Recyclers.Detritivores.Crab;
import com.company.Recyclers.Detritivores.Worm;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Eagle eagle = new Eagle(5,20,"Male","Bald eagle",150,2.1);
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




        ServiceClass sc = new ServiceClass();
        LinkedList<Object> list_of_objects = new LinkedList();
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
            System.out.println("____________________________________________________________");
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        eagle.canEat();
        lion.canEat();
        bacteria.canEat();
        tiger.canEat();
        worm.canEat();
        mushroom.canEat();
        deer.canEat();
        horse.canEat();
        sheep.canEat();
        bear.canEat();
        hedgehog.canEat();
        pig.canEat();
        crab.canEat();
        tree.canEat();
        flower.canEat();
    }
}
