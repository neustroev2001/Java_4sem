package practice6.abstractFactory.enterprise;

import practice6.abstractFactory.ProductManager;

public class EnterpriseProductManager implements ProductManager {
    @Override
    public void manage() {
        System.out.println("PM manages enterprise project");
    }
}
