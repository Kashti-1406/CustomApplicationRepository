import org.example.CustomUtility;

import org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.*;

public class InputTest {

    @ParameterizedTest
    @DisplayName("In Test file")
    @CsvSource({"'abc()' , 'abc'","'df(fd)ds' , 'dffdds'"})
    public void testBrackets(String testData, String expected){
        String result = CustomUtility.removeExtraBracketsfromString(testData);
        Assertions.assertEquals(expected,result);
        System.out.println(result);
    }

}
