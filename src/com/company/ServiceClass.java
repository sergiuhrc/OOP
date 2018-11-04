package com.company;

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

}
