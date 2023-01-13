import java.util.ArrayList;

public class ListDemoy {

    public static void main(String[] args) {
        ArrayList<TestClass> demo = new ArrayList<>();

        for(int i=0;i<15; i++){
            TestClass tc = new TestClass("test-1: "+i, "test-2:"+i);
            demo.add(tc);
        }
        System.out.println(demo.size());
        System.out.println("---------------------------------------");
        for(TestClass x: demo){
            System.out.println(x);
        }


    }
}
