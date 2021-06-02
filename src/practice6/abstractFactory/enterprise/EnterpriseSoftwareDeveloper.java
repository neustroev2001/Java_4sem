package practice6.abstractFactory.enterprise;

import practice6.abstractFactory.SoftwareDeveloper;

public class EnterpriseSoftwareDeveloper implements SoftwareDeveloper {
    @Override
    public void develop() {
        System.out.println("SD works on enterprise project");
    }
}