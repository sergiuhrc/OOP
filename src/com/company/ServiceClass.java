package com.company;

import com.company.Consumers.CarnivoreConsumersPackage.CarnivoreConsumers;
import com.company.Consumers.HerbivoreConsumersPackage.HerbivoreConsumers;

public class ServiceClass {


    public static boolean checkSiblings(Object obj1, Object obj2){

        Class superclass=obj1.getClass().getSuperclass();
        Class superclass2=obj2.getClass().getSuperclass();
        boolean result ;

            if (superclass == superclass2){
                System.out.println("["+obj1.getClass()+"]       are siblings with          ["+obj2.getClass()+"]");
                result=true;

            }else {

                System.out.println("["+obj1.getClass()+"]       are not siblings with      ["+obj2.getClass()+"]");
                result = false;
            }
            return result;
    }


    public static  void tryToEat(Object obj1 ,Object obj2) throws  EatingException{

               if (obj1 instanceof CarnivoreConsumers && obj2 instanceof HerbivoreConsumers){
                   System.out.println("I can eat you sorry");



               }else {

                    throw new EatingException("Message: "+obj1.getClass() +" can't eat "+obj2.getClass()+" becouse of hierarchy");
                  // System.out.println("I can't eat you ");
               }



    }
}
