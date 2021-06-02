package practice6.abstractFactory.enterprise;

import practice6.abstractFactory.AgileTeamFactory;
import practice6.abstractFactory.SoftwareDeveloper;
import practice6.abstractFactory.ProductManager;

public class EnterpriseTeam implements AgileTeamFactory {
    @Override
    public ProductManager getProductManager() {
        return new EnterpriseProductManager();
    }

    @Override
    public SoftwareDeveloper getSoftwareDeveloper() {
        return new EnterpriseSoftwareDeveloper();
    }
}
