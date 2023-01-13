package singleToneDP;
public class SingleTonDesignPattern {

    private static SingleTonDesignPattern customObject =null;
    static {
        customObject = new SingleTonDesignPattern();
    }
    public static SingleTonDesignPattern getReadyInstance() {
            return customObject;
    }
      private final String className= "-----------------------SingleToneDesignPattern----------------------- \n" ;
    private final String description ="The most easy way to create Singleton in Java. Instance is created when the class loader first loads the class.If the instance is never required, it is created non the less.";
    private final String saperator ="\n ---------------------------------------------------------------------   \n";
    @Override
    public String toString() {

        return className+description +saperator;
    }
}

