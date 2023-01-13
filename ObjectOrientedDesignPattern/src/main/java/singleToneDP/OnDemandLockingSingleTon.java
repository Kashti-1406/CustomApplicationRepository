package singleToneDP;

public class OnDemandLockingSingleTon {


    private static OnDemandLockingSingleTon customObject =null;

    public static OnDemandLockingSingleTon getOnDemandSingleToneReadyInstance() {
        if (customObject == null){
            customObject = new OnDemandLockingSingleTon();
            return customObject;
        }else{
            return customObject;
        }
    }

    private final String className= "-----------------------OnDemandLockingSingleTon----------------------- \n" ;
    private final String description ="Instance is created only when it is first required. Locking ensures that only one instance can ever be created. Locking is nested under first comparison, so it happens only if instance hasn't been created yet.Thread-safe. Lock is invoked only on instance creation (not-always). Instance is only created if it's needed.";
    private final String saperator ="\n ---------------------------------------------------------------------   \n";
    @Override
    public String toString() {

        return className+description +saperator;
    }
}