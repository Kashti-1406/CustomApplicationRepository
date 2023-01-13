package streamsJava8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {

    public static void main(String[] args) {

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");


        // sorting
      /*  stringCollection
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.print(stringCollection+", ");*/



        /*String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.asList(arr).stream();
        //Stream<String> stream = Arrays.stream(arr);
        stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);*/


       // IntStream.range(0, 10)
               // .forEach(value -> System.out.println(value));

        //IntStream.range(0, 5)
                //.forEach(System.out::println);

        List<Integer> list = IntStream.range(1, 100)
                .boxed()
                .collect(Collectors.toList());
       System.out.println(list.stream().count());

       /* IntSummaryStatistics intSummaryStatistics = list.stream()
                .collect(Collectors.summarizingInt(value -> value));

        System.out.println(intSummaryStatistics);*/

       /* Map<Integer, Integer> map = list.stream()
                .collect(Collectors.toMap(p -> p, q -> q * 3));
        System.out.println(map);*/

       /* long c = stringCollection
                .stream()
                .filter(s -> s.startsWith("c"))
                .count();
        System.out.println(c);*/
    }

}
