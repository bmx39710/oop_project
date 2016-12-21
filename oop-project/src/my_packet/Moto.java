package my_packet;

/**
 * Created by Тарас on 15.12.2016.
 */
public class Moto extends OverlandTransport implements Vois {
    private String typeMoto;
    private boolean airCooling;

    public Moto(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void vois() {


        if(getSpeed()>250) typeMoto = "Sport-moto";
        else typeMoto = "Choper";
        System.out.println("Type moto: " + typeMoto);
        System.out.println("drinningg");
    }

    @Override
    public float Transportspeed() {
        int motoSpeed = getSpeed();
        float turboSpeed = motoSpeed *2 -(100 * 3);
        System.out.println("turbo speed:  "+turboSpeed + " км/год ");
        turboSpeed = turboSpeed *1000 / 3600;
        return turboSpeed;
    }

}