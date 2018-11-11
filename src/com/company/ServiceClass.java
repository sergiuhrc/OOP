package com.company;

import com.company.consumers.CarnivoreConsumersPackage.CarnivoreConsumers;
import com.company.consumers.HerbivoreConsumersPackage.HerbivoreConsumers;

public class ServiceClass implements TestFoodChain{

    @Override
    public  boolean checkSiblings(Object obj1, Object obj2){

        Class superclass=obj1.getClass().getSuperclass();
        Class superclass2=obj2.getClass().getSuperclass();
        boolean result ;

            if (superclass == superclass2){
                System.out.println("["+obj1.getClass().getName().substring(21)+"]    are siblings with      ["+obj2.getClass().getName().substring(21)+"]");
                result=true;

            }else {

                System.out.println("["+obj1.getClass().getName().substring(21)+"]    are not siblings with  ["+obj2.getClass().getName().substring(21)+"]");
                result = false;
            }
            return result;
    }

    @Override
    public   void tryToEatExceptionsHandling(Object obj1 ,Object obj2) throws  EatingException{

               if (obj1 instanceof CarnivoreConsumers && obj2 instanceof HerbivoreConsumers){

                   System.out.println("I can eat you");

               }else {

                   throw new EatingException("Message: "+obj1.getClass() +" can't eat "+obj2.getClass()+" becouse of hierarchy");

               }



    }


}
