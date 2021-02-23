package prototype;

import javafx.geometry.Point3D;

public class Client {

    public static void main(String[] args) {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(-10, 0, 0), 20);
        swordsman.attack();

        General general = new General();
        general.move(new Point3D(-15, 0, 0), 10);
        general.boostMorale();

        System.out.println(swordsman);
        System.out.println(general);
    }
}
