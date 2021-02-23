package prototype;

import java.util.StringJoiner;

public class General extends GameUnit {

    private String state = "idle";

    public void boostMorale() {
        this.state = "MoralBoost";
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", General.class.getSimpleName() + "[", "]")
                .add("state: " + state)
                .add("position: " + getPosition())
                .toString();
    }


    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }
}
