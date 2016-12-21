package my_packet;

/**
 * Created by Тарас on 15.12.2016.
 */
public class OverlandTransport extends  Technika {
    private String name;
    private int speed;
    private int numberWheels;

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {

        this.numberWheels = numberWheels;
    }

    public OverlandTransport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

    }

    public int getSpeed() {
        return speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
