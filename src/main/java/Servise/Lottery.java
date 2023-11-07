package Servise;

import Objects.Toys;

import java.util.*;

public class Lottery {

    public Integer SizeArrayForLottery(List<Toys> arr) {
        int summ = 0;
        for (int i = 0; i < arr.size(); i++) {
            summ = summ + arr.get(i).getWeight();
        }
        return summ;
    }

    public Object[] fillArray(List<Toys> arr, List<Toys> arr1) {
        PriorityQueue<String> newList = new PriorityQueue<>();
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr1.get(i).getWeight(); j++) {
                newList.add(arr1.get(i).getName());
            }
        }
        Object[] objectsList = newList.toArray();
        return objectsList;
    }

    public Integer randomNumber(Integer arr) {
        Random random = new Random();
        return random.nextInt(arr);
    }

    public List<String> listOfHuman() {
        List<String> humanLine = new ArrayList<>();
        humanLine.add("Alex");
        humanLine.add("Alex1");
        humanLine.add("Alex2");
        humanLine.add("Alex3");
        humanLine.add("Alex4");
        humanLine.add("Alex5");
        humanLine.add("Alex6");
        humanLine.add("Alex7");
        humanLine.add("Alex8");
        humanLine.add("Alex9");
        humanLine.add("Alex10");
        return humanLine;
    }
}

