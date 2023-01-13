package optionalJava8;

import java.util.Optional;

public class OptionalDemo {

    // Without Optional class
  /*  public static void main(String[] args)
    {
        String[] words = new String[10];
        String word = words[5].toLowerCase();
        System.out.print(word);
    }*/
    // With Optional class
   public static void main(String[] args)
    {
        String[] words = new String[10];
       /* for(int i=0;i< words.length; i++) {
            words[i] = "Test optional class";
        }*/
        Optional<String> checkNull
                = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        }
        else
            System.out.println("word is null");
    }

}
