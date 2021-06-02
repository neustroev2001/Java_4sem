package practice6;

import practice6.abstractFactory.AgileTeamFactory;
import practice6.abstractFactory.ProductManager;
import practice6.abstractFactory.SoftwareDeveloper;
import practice6.abstractFactory.enterprise.EnterpriseTeam;
import practice6.builder.AnalyticsTeam;
import practice6.builder.ProjectManager;
import practice6.factory.AgileFramework;
import practice6.factory.AgileFrameworkFactory;
import practice6.prototype.Branch;

public class Main {

    public static void main(String[] args) {
        System.out.println("Тест. метода 'фабрика'");
        AgileFramework scrum =
                AgileFrameworkFactory.getAgileFramework(AgileFramework.AgileType.SCRUM);
        AgileFramework kanban =
                AgileFrameworkFactory.getAgileFramework(AgileFramework.AgileType.KANBAN);
        scrum.startDevelopment();
        kanban.startDevelopment();

        System.out.println("\nТест. метода 'абстрактная фабрика'");
        AgileTeamFactory agileTeam = new EnterpriseTeam();
        ProductManager pm = agileTeam.getProductManager();
        SoftwareDeveloper sd = agileTeam.getSoftwareDeveloper();
        pm.manage();
        sd.develop();

        System.out.println("\nТест. метода 'строитель'");
        ProjectManager projectManager = new ProjectManager(new AnalyticsTeam());
        System.out.println(projectManager.setTeam());

        System.out.println("\nТест. метода 'прототип'");
        Branch branch1 = new Branch("master", 247);
        System.out.println("Source: " + branch1);
        Branch branch2 = (Branch) branch1.prototype();
        System.out.println("Copy: " + branch2);
    }
}