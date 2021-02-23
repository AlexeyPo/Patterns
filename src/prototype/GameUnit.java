package prototype;

import javafx.geometry.Point3D;

public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        this.position = Point3D.ZERO;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();
        unit.initialize();
        return unit;
    }

    private void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();


    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

    public Point3D getPosition() {
        return position;
    }
}
