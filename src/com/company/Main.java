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
import java.util.stream.IntStream;
import java.util.logging.Logger;


import static java.util.stream.Collectors.groupingBy;


public class Main {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
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
            LOGGER.info("User friendly message to avoid this error");

        }


        LOGGER.info("Still working");
    }

    public  static  void streams(){
        List<User> listOfUsers =  Arrays.asList(

                new User("Sergiu", true, Roles.OWNER, "sergiuhrc@yahoo.com", new BigDecimal("2010.51"), LocalDate.of(2010, 01, 22)),
                new User("Dima", true, Roles.SALESAGENT, "sergiuhrc1@yahoo.com", new BigDecimal("2020.51"), LocalDate.of(2018, 8, 5)),
                new User("Alex", true, Roles.FINANCEEXECUTIVE, "sergiuhrc2@yahoo.com", new BigDecimal("2030.51"), LocalDate.of(2013, 2, 21)),
                new User("Cristi", true, Roles.COUSTUMERSUPPORT, "sergiuhrc3@yahoo.com", new BigDecimal("1100.51"), LocalDate.of(2014, 3, 16)),
                new User("Luminita", false, Roles.ANALYST, "luminita96@yahoo.com", new BigDecimal("3200.51"), LocalDate.of(2015, 11, 29)),
                new User("Angela", true, Roles.COUSTUMERSUPPORT, "se3@yahoo.com", new BigDecimal("10000"), LocalDate.of(2014, 3, 16)),
                new User("Vasile", false, Roles.ANALYST, "lumina96@yahoo.com", new BigDecimal("10000.01"), LocalDate.of(2015, 11, 29)),

                new User("Sergiu", true, Roles.OWNER, "sergiuhrc@yahoo.com", new BigDecimal("2010.51"), LocalDate.of(2010, 01, 22)),
                new User("Dima", true, Roles.SALESAGENT, "sergiuhrc1@yahoo.com", new BigDecimal("2020.51"), LocalDate.of(2018, 8, 5)),
                new User("Alex", true, Roles.FINANCEEXECUTIVE, "sergiuhrc2@yahoo.com", new BigDecimal("2030.51"), LocalDate.of(2013, 2, 21)),
                new User("Cristi", true, Roles.COUSTUMERSUPPORT, "sergiuhrc3@yahoo.com", new BigDecimal("1200.51"), LocalDate.of(2014, 3, 16)),
                new User("Luminita", false, Roles.ANALYST, "luminita96@yahoo.com", new BigDecimal("3200.51"), LocalDate.of(2015, 11, 29))
        );



        LOGGER.fine("Distinct");
        System.out.println("----------------------------------------------");
        listOfUsers.stream()
                .distinct()
                .forEach(System.out::println);


        LOGGER.fine("Min balance User");
        System.out.println("----------------------------------------------");
        listOfUsers.stream().distinct().
                min(Comparator.comparing(User::getBalance)).
                ifPresent(user -> System.out.println(user.toStringMinMaxBalance()));


        LOGGER.fine("Average Balance");
        System.out.println("----------------------------------------------");

        BigDecimal averageValue = listOfUsers.stream().
                distinct().
                filter(Objects::nonNull).
                filter(user -> user.getBalance() != null).
                map(User::getBalance).
                reduce(BigDecimal.ZERO, BigDecimal::add);


        Double average = averageValue.doubleValue();
        System.out.println(average / listOfUsers.stream().distinct().count());

        LOGGER.fine("Max balance");
        System.out.println("----------------------------------------------");
        listOfUsers.stream().
                distinct().
                max(Comparator.comparing(User::getBalance)).
                ifPresent(user -> System.out.println(user.toStringMinMaxBalance()));


        LOGGER.fine("Partition users by active and locked accounts");
        System.out.println("----------------------------------------------");
        listOfUsers.stream().
                distinct().
                forEach(user -> {

                 if (user.isActive()) {
                     System.out.println("Active accounts: " + user);
                 } else {
                      System.out.println("Locked accounts " + user);
                   }
                });


        LOGGER.fine("Get list of emails");
        System.out.println("----------------------------------------------");
        listOfUsers.stream().
                distinct().
                filter(user -> user.getEmail().trim().length()>0 && user.getEmail() != null).
                map(User::getEmail).
                forEach(System.out::println);


        LOGGER.fine("Group users by registration date");
        System.out.println("----------------------------------------------");

        listOfUsers.stream().
                distinct().
                sorted(Comparator.comparing(User::getDate)).
                forEach(user -> System.out.println(user.toStringUserRegestrationDate()));


        LOGGER.fine("Group users by their roles");
        System.out.println("----------------------------------------------");
        Map<Enum<Roles>,List<User>> list = listOfUsers.stream().
                collect(groupingBy(User::getRoles));

        System.out.println(list);

        LOGGER.fine("Number of non active users ");
        System.out.println("----------------------------------------------");

              Long nonActiveUsers=listOfUsers.stream().
                      distinct().
                      filter(user -> user.isActive() ).
                      count();

              System.out.println(nonActiveUsers);


        LOGGER.fine("Get first user with balance > 10000, and what if there is none such?");
        System.out.println("----------------------------------------------");
              listOfUsers.stream().
                      filter(user -> user.getBalance().doubleValue() >10000).
                      findAny().
                      ifPresentOrElse(user -> System.out.println(user.toStringUserName()) ,()->System.out.println("User with balance bigger than 10000 not found"));
        LOGGER.fine("Reduce all users names into 1 coma separated string");
        System.out.println("----------------------------------------------");

              listOfUsers.stream().
                      distinct().
                      filter(user -> user.getName().trim().length()>0 && user.getName() != null).
                      map(User::getName).
                      forEach(user-> System.out.print(user +","));

        System.out.println();

        LOGGER.fine("Create 2 lists of ints and chars, and using stream api get cartesian product of those 2 lists.");
        System.out.println("----------------------------------------------");
       List<Integer> arrayOfInts = Arrays.asList(1,2,3);
        List<Character> arrayOfChars = Arrays.asList('A','B','C');
        List<?> cartesianProduct = arrayOfInts.stream()
                .flatMap( s1 -> arrayOfChars.stream().map( s2 -> s1 +""+ s2 ) )
                .collect( Collectors.toList() );
        System.out.println(cartesianProduct);


        LOGGER.fine("Factorial");
        System.out.println("----------------------------------------------");
        int number = 5;
       Integer i =  IntStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y);
        System.out.println(i);
    }
}
