package homework6.product;

public class Drink {
    protected String name;
    protected float value;

    public Drink(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVolume() {
        return value;
    }

    public void setVolume(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s  %.1f", name, value);
    }
}
