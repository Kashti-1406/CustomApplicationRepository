package singleToneDP;

public class OnDemandSingleTon {


        private static OnDemandSingleTon customObject =null;

        public static OnDemandSingleTon getOnDemandSingleToneReadyInstance() {
        if (customObject == null){
            customObject = new OnDemandSingleTon();
            return customObject;
        }else{
            return customObject;
        }
    }

        private final String className= "-----------------------OnDemandSingleTon----------------------- \n" ;
        private final String description ="Instance is created only when it is first requested.Not thread-safe. Due to race conditions, multiple instances can be created.";
        private final String saperator ="\n ---------------------------------------------------------------------   \n";
        @Override
        public String toString() {

        return className+description +saperator;
    }
    }

