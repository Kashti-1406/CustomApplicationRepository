package lamdaexpression;
import java.lang.*;
/*
 * Functional Interface: regular function, function with definition, static function, private method
 * */
public class InterfaceDemo {

        public interface FunctionalInterface {
        double calculate(int a);
        default String testFunctionalInterface(){
            System.out.println("In Functional Interface, method with definition1");
            return testPrivateMethod();

        }
        static int positive(int a) {
            return a > 0 ? a : 0;
        }

        private String  testPrivateMethod(){return "Its private method inside interface !";}
    }

    public static void main (String[]args){
        FunctionalInterface formula1 = new FunctionalInterface() {
            @Override
            public double calculate(int a) {
                return 100;
            }

        };
        System.out.println("Regular no definition method in interface: "+formula1.calculate(100));
        System.out.println("Static method in oInterface : "+FunctionalInterface.positive(-4));
        String s= formula1.testFunctionalInterface();
        System.out.println(s);

    }


}

