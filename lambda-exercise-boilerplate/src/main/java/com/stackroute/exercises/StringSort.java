package com.stackroute.exercises;


import java.util.Collections;
import java.util.List;

public class StringSort {

    public String stringSorter(List<String> stringList, String sortingOrder) {
        String result = null;
        boolean nullString = false;

        try {
            for (String value : stringList) {
                if (value == null || value.equalsIgnoreCase("") || value.equalsIgnoreCase(" ")) {
                    nullString = true;
                    break;
                }
            }
        } catch (Exception nullPointer){
            //this will keep the program from breaking if iterator can't be used because stringlist is null
        }

        if (stringList == null || stringList.size() < 1 || sortingOrder == null || sortingOrder.equalsIgnoreCase("") || sortingOrder.equalsIgnoreCase(" ")) {
            result = "Given stringList or sortingOrder is empty, null or blank space";
        }
        else if (nullString){
            for (String string : stringList) {
                if (string == null || string.equalsIgnoreCase("") || string.equalsIgnoreCase(" ")) {
                    result = "The list contains an empty or blank space value";
                }
            }
        }
        else if (stringList.size() == 1) {
            result = "The list contains only one value";
        } else if (!sortingOrder.equalsIgnoreCase("asc") && !sortingOrder.equalsIgnoreCase("desc")){
            result = "No sorting order present for given string '" + sortingOrder + "' , 'asc' for ascending order sort and 'desc' for descending order sort";
        }
        else {
            //one sort statement and logic inside lambda expression

            if (sortingOrder.equalsIgnoreCase("asc")){
                stringList.sort((p1, p2) -> p1.compareTo(p2));
            }
            if (sortingOrder.equalsIgnoreCase("desc")) {
                stringList.sort((p1, p2) -> p2.compareTo(p1));
            }
            result = stringList.toString();
            }
        return result;
    }


}

