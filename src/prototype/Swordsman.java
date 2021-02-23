package prototype;

import java.util.StringJoiner;

public class Swordsman extends GameUnit {

    private String state = "idle";

    public void attack() {
        this.state = "attacking";
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Swordsman.class.getSimpleName() + "[", "]")
                .add("state: " + state)
                .add("position: " + getPosition())
                .toString();
    }

    @Override
    protected void reset() {
        state = "idle";

    }
}
