package org.example;


import java.util.*;
import java.util.logging.Logger;

public class Main {
    /* Get the class name to be printed on */
    static Logger log = Logger.getLogger(Main.class.getName());
    static Set<Integer> keySet = new HashSet<>();
    public static void main(String[] args) {
        log.info("Hello this is an info message");
        LinkedHashMap<Integer, Double> sortedMapwt = new LinkedHashMap<>();
        LinkedHashMap<Integer, Double> sortedMapcost = new LinkedHashMap<>();

        System.out.println(args.length);
        if(args.length >= 3) {
            HashMap<Integer,Double> mapWithWeight = new HashMap<>();
            HashMap<Integer,Double> mapWithCost = new HashMap<>();
            int package_weight = Integer.parseInt(args[0]);
            for(int i=2; i< args.length; i++ ){
                String cleanArgument= CustomUtility.removeExtraBracketsfromString(args[i]);
                String element[] = cleanArgument.split(",",0);
                if(element.length!= 0 && element.length==3) {
                    int item_number = Integer.parseInt(element[0]);
                    mapWithWeight.put(item_number,Double.parseDouble(element[1]));
                    mapWithCost.put(item_number,Double.parseDouble(element[2]));
                    keySet.add(item_number);
                }
                }
            sortedMapwt = CustomUtility.getSortedMapbyValue(mapWithWeight);
            sortedMapcost= CustomUtility.getSortedMapbyValue(mapWithCost);

        }
        else{
            System.out.println("No Sufficient arguments provided!");
            System.out.println("Arguments must be like : Max weight of package : detailed list of items( Item number, Wight, Cost) ");
            System.out.println("Example: 8 : (1,15.3,€34)");
        }
        System.out.println("...............................................");
        System.out.println(sortedMapwt);
        System.out.println(sortedMapcost);
        getItemsToAddInPackage(sortedMapwt,sortedMapcost);
    }

    public static void getItemsToAddInPackage(LinkedHashMap<Integer, Double> sortedMapwt, LinkedHashMap<Integer, Double>sortedMapcost){
        ArrayList<Double> weight = new ArrayList<>();
        ArrayList<Double> weightToPut = new ArrayList<>();
        ArrayList<Double> cost = new ArrayList<>();
        ArrayList<Double> costToPut = new ArrayList<>();
        Integer item_numbers[] = new Integer[15];
        double weightSum=0.0 , costSum=0.0;

        for (Map.Entry<Integer, Double> entry : sortedMapwt.entrySet()) {
            weight.add(entry.getValue());
        }
        for (Map.Entry<Integer, Double> entry : sortedMapcost.entrySet()) {
            cost.add(entry.getValue());
        }

        Collections.reverse(weight);
        Collections.reverse(cost);


        for (int i=0;i< weight.size() && i < cost.size();i++){
            if(weightSum < 100 && costSum < 100){
                weightSum += weight.get(i);
                costSum += cost.get(i);
                weightToPut.add(weight.get(i));
                costToPut.add(cost.get(i));
                if(weightSum > 100 || costSum > 100){
                    weightSum -= weight.get(i);
                    costSum -= cost.get(i);
                    weightToPut.remove(weightToPut.size()-1);
                    costToPut.remove(costToPut.size()-1);
                    continue;
                }
            }
        }
        System.out.println("...............................................");
        System.out.println(weightToPut);
        System.out.println(costToPut);
        Iterator itr = keySet.iterator();
        while(itr.hasNext()){
            int item = (Integer)itr.next();
            for(int i=0 ;i< weightToPut.size() ;i++){

            }
        }

    }


}