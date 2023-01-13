public class TestClass {

    String a,b;

    public TestClass(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public TestClass() {
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
