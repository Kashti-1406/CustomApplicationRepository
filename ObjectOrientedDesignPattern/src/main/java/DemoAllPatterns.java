import ProxyDP.ReportGenerator;
import ProxyDP.ReportGeneratorImplProxy;
import ProxyDP.Role;
import singleToneDP.OnDemandLockingSingleTon;
import singleToneDP.OnDemandSingleTon;
import singleToneDP.SingleTonDesignPattern;

public class DemoAllPatterns {

    public static void main(String[] s){

        SingleTonDesignPattern object = SingleTonDesignPattern.getReadyInstance();
        System.out.println(object);
        OnDemandSingleTon object1 = OnDemandSingleTon.getOnDemandSingleToneReadyInstance();
        System.out.println(object1);
        OnDemandLockingSingleTon object2 = OnDemandLockingSingleTon.getOnDemandSingleToneReadyInstance();
        System.out.println(object2);

        /*Role accessRole=new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("Pdf",150);
        proxy.generateComplexReport("Pdf",150);
        proxy.generateSensitiveReport();
*/
    }
}
