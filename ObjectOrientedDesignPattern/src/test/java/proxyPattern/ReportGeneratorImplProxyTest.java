package proxyPattern;
import ProxyDP.ReportGenerator;
import ProxyDP.ReportGeneratorImplProxy;
import ProxyDP.Role;
import org.junit.jupiter.api.Test;
public class ReportGeneratorImplProxyTest {
    @Test
    public void testGenerateReport() throws Exception {
        Role accessRole=new Role();
        accessRole.setRole("Manager");
        ReportGenerator proxy=new ReportGeneratorImplProxy(accessRole);
        proxy.displayReportTemplate("Pdf",150);
        proxy.generateComplexReport("Pdf",150);
        proxy.generateSensitiveReport();
    }
}
