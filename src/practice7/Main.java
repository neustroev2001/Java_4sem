package practice7;

import practice7.facade.Facade;
import practice7.facade.ShapeType;
import practice7.flyweight.PotionFactory;
import practice7.flyweight.PotionType;

public class Main {
    /*
    Паттерны Фасад, Легковес.
     */
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.draw(ShapeType.Rectangle);

        PotionFactory potionFactory = new PotionFactory();
        potionFactory.createPotion(PotionType.HEAL).use();
        potionFactory.createPotion(PotionType.HEAL).use();
        potionFactory.createPotion(PotionType.STAMINA).use();
        potionFactory.createPotion(PotionType.STAMINA).use();
        potionFactory.createPotion(PotionType.SPEED).use();
        potionFactory.createPotion(PotionType.SPEED).use();
    }
}
