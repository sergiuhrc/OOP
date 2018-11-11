package com.company;

import com.company.consumers.CarnivoreConsumersPackage.Eagle;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestListWithGenerics implements TestListInterface {

    private static  ArrayList<Integer> testRemoveFromArrayList(ArrayList<Integer> arrayList ){
        for (int i = 0; i <arrayList.size() ; i++) {
            //double y = i%2;
            // Object value = arrayList.get(i);
            if (arrayList.get(i)%2!=0) {
                arrayList.remove(i);
            }

        }


        return arrayList;
    }

    private static  LinkedList<Integer> testRemoveFromLinkedList(LinkedList<Integer> linkedList ){
        for (int i = 0; i <linkedList.size() ; i++) {
            //double y = i%2;
            // Object value = arrayList.get(i);
            if (linkedList.get(i)%2!=0) {
                linkedList.remove(i);
            }

        }


        return linkedList;
    }

    private  static ArrayList<?> setArrayListmethod(){
        ArrayList<Object> eagleArrayList = new ArrayList<>();
        for (int i = 0; i < 50000; i++) {
            eagleArrayList.add(new Eagle(i,20,"Male","Bald eagle",150.23,2.1));
        }
//        for (int i = 0; i < eagleArrayList.size(); i++) {
//            eagleArrayList.get(i);
//        }
        return eagleArrayList;
    }

    private static LinkedList<?> setLinkedListmethod(){
        LinkedList<Object> eagleLinkedList = new LinkedList<>();
        for (int i = 0; i < 50000; i++) {
            eagleLinkedList.add(new Eagle(5,20,"Male","Bald eagle",150.23,2.1));
        }
//        for (int i = 0; i <eagleLinkedList.size() ; i++) {
//            eagleLinkedList.get(i);
//        }
        return eagleLinkedList;
    }

      @Override
      public void addSpeedTest(){
          int countArrayListWinTimes=0;
          int countLinkedListWinTimes=0;
          int draw=0;
        while (countArrayListWinTimes !=500 ){

            long start = System.nanoTime();
            setArrayListmethod();
            long elapsedTime = System.nanoTime() - start;

            long start2 = System.nanoTime();
            setLinkedListmethod();
            long elapsedTime2 = System.nanoTime() - start2;

            if (elapsedTime<elapsedTime2){
                countArrayListWinTimes++;
            }else if(elapsedTime>elapsedTime2){
                countLinkedListWinTimes++;
            }else {
                draw++;
            }
        }
        System.out.println("ArrayList won "+countArrayListWinTimes+" times");
        System.out.println("LinkedList won "+countLinkedListWinTimes+" times");
        System.out.println("Draw "+draw+" times");
    }
    @Override
    public void removeSpeedTest(){
        int countArrayListWinTimes=0;
        int countLinkedListWinTimes=0;
        int draw=0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <50000 ; i++) {
            arrayList.add(i);
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <50000 ; i++) {
            linkedList.add(i);
        }
        while (countArrayListWinTimes !=20 ) {

            long start2 = System.nanoTime();
            testRemoveFromLinkedList(linkedList);
            long elapsedTime2 = System.nanoTime() - start2;

            long start = System.nanoTime();
            testRemoveFromArrayList(arrayList);
            long elapsedTime = System.nanoTime() - start;

            if (elapsedTime<elapsedTime2){
                countArrayListWinTimes++;
            }else if(elapsedTime>elapsedTime2){
                countLinkedListWinTimes++;
            }else {
                draw++;
            }
        }
        System.out.println("Remove with LinkedList win "+countLinkedListWinTimes+" times");
        System.out.println("Remove with ArrayList win "+countArrayListWinTimes+" times");
        System.out.println("Draw "+draw+" times");
    }
}
