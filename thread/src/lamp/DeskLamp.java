package lamp;

import java.time.LocalDateTime;

/**
 * 책상 조명 반제품
 */
public abstract class DeskLamp implements Lamp {

    boolean power = false;

    @Override
    public void turnOn() {
        this.power = true;
        System.out.printf("[%s] 전원 %s\n", LocalDateTime.now(), "ON");
    }

    @Override
    public void turnOff() {
        this.power = false;
        System.out.printf("[%s] 전원 %s\n", LocalDateTime.now(), "OFF");
    }

    @Override
    public boolean getPower() {
        return this.power;
    }

}
