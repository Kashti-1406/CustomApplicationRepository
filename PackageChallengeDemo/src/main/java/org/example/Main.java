package org.example;

import java.util.logging.Logger;

public class Main {
    /* Get the class name to be printed on */
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        log.info("Hello this is an info message");
        System.out.println(args.length);
        if(args.length >= 3) {
            int package_weight = Integer.parseInt(args[0]);
            System.out.println("Package weight must be : "+package_weight);
            for(int i=2; i< args.length; i++ ){
                String cleanArgument= CustomUtility.removeExtraBracketsfromString(args[i]);
                String element[] = cleanArgument.split(",",0);
                if(element.length!= 0 && element.length==3) {
                    int item_number = Integer.parseInt(element[0]);
                    int item_weight = Integer.parseInt(element[1]);
                    int item_cost = Integer.parseInt(element[2]);
                }

                System.out.println("...............................................");
            }
        }
        else{
            System.out.println("No Sufficient arguments provided!");
            System.out.println("Arguments must be like : Max weight of package : detailed list of items( Item number, Wight, Cost) ");
            System.out.println("Example: 8 : (1,15.3,€34)");
        }
    }
}