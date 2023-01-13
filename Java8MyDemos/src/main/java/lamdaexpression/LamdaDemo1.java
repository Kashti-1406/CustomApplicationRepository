package lamdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
* Lamda Expression : with expression, method body and parameters
* */
public class LamdaDemo1 {

    public static void main(String[] args) {
        String nameArray[]= new String[5];
        nameArray[0]="Swati";
        nameArray[1]="Priya";
        nameArray[2]="Akhil";
        nameArray[3]="Akash";
        nameArray[4]= "Omkar";

        List<String> names = Arrays.asList(nameArray);
        // Ways of writing lamda expression
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });
       // Collections.sort(names, (String a, String b) -> {return a.compareTo(b);});
       // Collections.sort(names, (String a, String b) -> a.compareTo(b));
       // Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted List of names with Lamda expression: "+names);

        names.sort(Collections.reverseOrder());
        System.out.println("Reverse Sorted List : "+names);

        List<String> names2 = Arrays.asList("Swati",null, "Priya", "Akash", "Akhil","Omkar");
        names2.sort(Comparator.nullsLast(String::compareTo)); // Works similar to lamda expression
        System.out.println("List With Null and null at last : "+names2);

        List<String> names3 =  Arrays.asList("Swati",null, "Priya", "Akash", "Akhil","Omkar");
        Optional.ofNullable(names3).ifPresent(list -> list.sort(Comparator.naturalOrder()));
        System.out.println("List with ofNullable: "+names3);
    }

}

