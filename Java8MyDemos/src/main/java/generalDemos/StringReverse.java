package generalDemos;

import org.apache.commons.lang3.StringUtils;

public class StringReverse {

    public static void main(String[] args) {

        // Simple String operation
        String inputString = "!yllaunaM gnirtS esreveR";
        String outputString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            outputString = outputString + inputString.charAt(i);
        }
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + outputString);

        //  String operation with StringBuffer
        String bufferString = "Reverse with StringBuffer!";
        StringBuffer bf = new StringBuffer(bufferString);
        bf.reverse();
        System.out.println("Original string with StringBuffer: " + bufferString);
        System.out.println("Reversed string with StringBuffer: " + bf);

        //  String operation with StringBuilder
        String builderString = "Reverse with StringBuilder!";
        StringBuilder builder = new StringBuilder(builderString);
        builder.reverse();
        System.out.println("Original string with StringBuilder: " + builderString);
        System.out.println("Reversed string with StringBuilder: " + builder);

        // String operation with StringUtils
        String input = "!gnirtS yM esreveR";
        String output = StringUtils.reverse(input);
        System.out.println("StringUtils.reverse(input) :"+output);

        String s = "hellO-EDUcativeaa";
        System.out.printf("The output of StringUtils.reverse() for the string - '%s' is '%s'", s, StringUtils.reverse(s));
        System.out.println();

        // Example 2
        s = "";
        System.out.printf("The output of StringUtils.reverse() for the string - '%s' is '%s'", s, StringUtils.reverse(s));
        System.out.println();

        // Example 3
        s = null;
        System.out.printf("The output of StringUtils.reverse() for the string - '%s' is '%s'", s, StringUtils.reverse(s));
        System.out.println();


    }

}
