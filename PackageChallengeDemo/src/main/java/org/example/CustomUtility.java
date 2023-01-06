package org.example;

import java.util.*;

public class CustomUtility {
    public static String removeExtraBracketsfromString(String x){

        if(x.startsWith("(")) {
           x=  x.replace("(", "");
        }
        if(x.endsWith(")")){
           x=  x.replace(")", "");
        }
        if(x.contains("€")){
            x=  x.replace("€", "");
        } if(x.contains("(") | x.contains(")")){
            x=  x.replace("(", "");
            x=  x.replace(")", "");
        }
        return x;
    }

    public static LinkedHashMap getSortedMapbyValue(HashMap<Integer,Double>  sortedWithWeight){
        ArrayList<Double> weight = new ArrayList<>();
        LinkedHashMap<Integer, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Double> entry : sortedWithWeight.entrySet()) {
            weight.add(entry.getValue());
        }
        Collections.sort(weight);
        for (double num : weight) {
            for (Map.Entry<Integer, Double> entry : sortedWithWeight.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        return sortedMap;
    }

    public static void sortByValue() {
        HashMap<Integer,Double> map = new HashMap<>();
        map.put(1,923.5);
        map.put(2,45.5);
        map.put(9,523.5);
        map.put(7,451.5);
        map.put(3,405.5);
        System.out.println("UnSorted: "+map);
        List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<Integer, Double> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, Double> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        System.out.println("Sorted: "+result);
    }
}
