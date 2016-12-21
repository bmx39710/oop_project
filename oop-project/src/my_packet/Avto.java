package my_packet;
    public class Avto extends OverlandTransport implements Vois {
    private int numberofDoors;

    public Avto(String name, int speed) {
        super(name, speed);
    }


    @Override
    public void vois() {
        System.out.println("br br br");
    }

    @Override
    public float Transportspeed() {

        int turboSpeed =  regimeTurboSpeed(getSpeed());
        int speed = getSpeed();
        System.out.println("Turbo speed: "+turboSpeed + " км/год ");
        float newSpeed = speed*1000/3600;

        return newSpeed;
    }

    private int regimeTurboSpeed(int speed){
        int turboSpeed = 50;
        turboSpeed += speed;
        return turboSpeed;
    }

}

