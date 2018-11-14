package com.company;

import com.company.consumers.CarnivoreConsumersPackage.*;
import com.company.consumers.HerbivoreConsumersPackage.*;
import com.company.consumers.OmnivoresConsumersPackage.*;
import com.company.producers.*;
import com.company.recyclers.Decomposers.*;
import com.company.recyclers.Detritivores.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Main {

    public static void main(String[] args) {


//Siblings Homework
        //  checkSiblings();
//Exceptions Homework
        //exceptions();

//Generics Homework
        // TestListWithGenerics test = new TestListWithGenerics();

        // test.removeSpeedTest();
        // test.addSpeedTest();
//Using Stream API Homework
        streams();


    }

    public static void checkSiblings() {
        ServiceClass sc = new ServiceClass();
        Eagle eagle = new Eagle(5, 20, "Male", "Bald eagle", 150.23, 2.1f);
        Eagle eagle2 = new Eagle(5, 20, "Male", "Bald eagle", 1500.23, 2.1f);
        Lion lion = new Lion(190, 12, "Male", 80);
        Tiger tiger = new Tiger(300, 16, "Male", 55, "Amur");
        Bacteria bacteria = new Bacteria();
        Mushroom mushroom = new Mushroom();
        Deer deer = new Deer();
        Horse horse = new Horse();
        Sheep sheep = new Sheep();
        Bear bear = new Bear();
        Hedgehog hedgehog = new Hedgehog();
        Pig pig = new Pig();
        Crab crab = new Crab();
        Worm worm = new Worm();
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
        for (int i = 0; i < listOfObejects.size(); i++) {
            for (int j = 0; j < listOfObejects.size() - 1; j++) {
                sc.checkSiblings(listOfObejects.get(i), listOfObejects.get(j + 1));

            }

        }
    }

    public static void exceptions() {
        ServiceClass sc = new ServiceClass();
        Deer deer = new Deer();
        Lion lion = new Lion(190, 12, "Male", 80);
        Worm worm = new Worm();
        sc.tryToEatExceptionsHandling(lion, deer);
        try {
            sc.tryToEatExceptionsHandling(worm, deer);
        } catch (EatingException e) {

            System.out.println("User friendly message to avoid this error");
        }

        System.out.println("Still working");
    }
    public  static  void streams(){
        List<User> listOfUsers =  Arrays.asList(

                new User("Sergiu", true, Roles.OWNER, "sergiuhrc@yahoo.com", new BigDecimal(2010.51), LocalDate.of(2010, 01, 22)),
                new User("Dima", true, Roles.SALESAGENT, "sergiuhrc1@yahoo.com", new BigDecimal(2020.51), LocalDate.of(2018, 8, 5)),
                new User("Alex", true, Roles.FINANCEEXECUTIVE, "sergiuhrc2@yahoo.com", new BigDecimal(2030.51), LocalDate.of(2013, 2, 21)),
                new User("Cristi", true, Roles.COUSTUMERSUPPORT, "sergiuhrc3@yahoo.com", new BigDecimal(1100.51), LocalDate.of(2014, 3, 16)),
                new User("Luminita", false, Roles.ANALYST, "luminita96@yahoo.com", new BigDecimal(3200.51), LocalDate.of(2015, 11, 29)),
                new User("Angela", true, Roles.COUSTUMERSUPPORT, "se3@yahoo.com", new BigDecimal(1200.51), LocalDate.of(2014, 3, 16)),
                new User("Vasile", false, Roles.ANALYST, "lumina96@yahoo.com", new BigDecimal(3202.51), LocalDate.of(2015, 11, 29)),

                new User("Sergiu", true, Roles.OWNER, "sergiuhrc@yahoo.com", new BigDecimal(2010.51), LocalDate.of(2010, 01, 22)),
                new User("Dima", true, Roles.SALESAGENT, "sergiuhrc1@yahoo.com", new BigDecimal(2020.51), LocalDate.of(2018, 8, 5)),
                new User("Alex", true, Roles.FINANCEEXECUTIVE, "sergiuhrc2@yahoo.com", new BigDecimal(2030.51), LocalDate.of(2013, 2, 21)),
                new User("Cristi", true, Roles.COUSTUMERSUPPORT, "sergiuhrc3@yahoo.com", new BigDecimal(1200.51), LocalDate.of(2014, 3, 16)),
                new User("Luminita", false, Roles.ANALYST, "luminita96@yahoo.com", new BigDecimal(3200.51), LocalDate.of(2015, 11, 29))
        );
        System.out.println("Average balance User");


        System.out.println("Distinct");
        listOfUsers.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("Min balance User");
        listOfUsers.stream().distinct().
                min(Comparator.comparing(User::getBalance)).
                ifPresent(user -> {System.out.println(user.toStringMinMaxBalance());});

        System.out.println("Average");
        BigDecimal averageValue = listOfUsers.stream().distinct().filter(user -> user != null).filter(user -> user.getBalance() != null).map(User::getBalance).reduce(BigDecimal.ZERO, BigDecimal::add);
        Double average = averageValue.doubleValue();
        System.out.println(average / listOfUsers.stream().distinct().count());

        System.out.println("Max balance User");
        listOfUsers.stream().distinct().
                max(Comparator.comparing(User::getBalance)).
                ifPresent(user -> {System.out.println(user.toStringMinMaxBalance());});

        System.out.println("Partition users by active and locked accounts");
        listOfUsers.stream().distinct().forEach(user -> {

            if (user.isActive() == true) {
                System.out.println("Active accounts: " + user);
            } else {
                System.out.println("Locked accounts " + user);
            }
        });

        System.out.println("Get list of emails");
        listOfUsers.stream().distinct().filter(user -> user.getEmail().trim().length()>0 && user.getEmail() != null).map(User::getEmail).forEach(System.out::println);

        System.out.println("Group users by registration date");

        Roles role;
        listOfUsers.stream().distinct().sorted(Comparator.comparing(User::getDate)).forEach(user -> {System.out.println(user.toStringUserRegestrationDate());});
        System.out.println("Group users by their roles");

        Map<Enum<Roles>,List<User>> list = listOfUsers.stream().collect(groupingBy(User::getRoles));
        System.out.println(list);
        System.out.println("Number of non active users ");
        Long nonActiveUsers=listOfUsers.stream().distinct().filter(user -> user.isActive() == false).count();
        System.out.println(nonActiveUsers);
        System.out.println("Get first user with balance > 10000, and what if there is none such?");
    }
}
