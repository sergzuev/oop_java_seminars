package homework6.product;

public class HotDrink extends Drink {

    private int temperature;
    
    public HotDrink(String name, float value, int temperature) {
        super(name, value);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s  %.1f  %d", name, value, temperature);
    }
}