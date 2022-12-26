package lamp;

import java.util.StringJoiner;

/**
 * 밝기 조절이 가능한 책상 조명
 */
public class SimpleDeskLamp extends DeskLamp {

    private int bright = 0; // 밝기 = [ 0:꺼짐 / 1:1단계 밝기 / 2:2단계 밝기 / 3:3단계 밝기 ]

    @Override
    public void turnOn() {
        super.turnOn();
        this.bright = 1;
    }

    @Override
    public void turnOff() {
        super.turnOff();
        this.bright = 0;
    }

    public int getBright() {
        return this.bright;
    }

    /**
     * 밝기 조절
     */
    public void nextBright() {
        if (!super.getPower()) {
            return;
        }

        if (this.bright == 0) {
            this.turnOn();
        } else if (this.bright < 3) {
            this.bright++;
        } else {
            this.turnOff();
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SimpleDeskLamp.class.getSimpleName() + "[", "]")
            .add("power=" + power)
            .add("bright=" + bright)
            .toString();
    }

}
