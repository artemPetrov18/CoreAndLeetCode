package Labs.lab6.Task1;

import java.util.Objects;

public class Wheel {
    private double wheelId;

    public double getWheelId() {
        return wheelId;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheelId=" + wheelId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.wheelId, wheelId) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelId);
    }

    public Wheel(double wheelId ) {

        this.wheelId=wheelId;
    }
}
