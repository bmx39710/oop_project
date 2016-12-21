package my_packet;

/**
 * Created by Тарас on 15.12.2016.
 */
public class main {
    public static void main(String args[]){

        System.out.println("Автомобіль");
        OverlandTransport bmv = new Avto("X5", 280);
        Vois voisAvto =new Avto(bmv.getName(),bmv.getSpeed());
        System.out.println(bmv.getName()+ " speed: " + bmv.getSpeed() );
        float autoSpeed = voisAvto.Transportspeed();
        System.out.println(autoSpeed + " м/сек");
        voisAvto.vois();

        System.out.println();

        System.out.println("Мотоцикл");

        OverlandTransport susuki =new Moto("Bandit", 340);
        System.out.println(susuki.getName()+ " speed: "+ susuki.getSpeed() + " км/год ");

        Vois voisMoto = new Moto(susuki.getName(),susuki.getSpeed());

        float motoSpeed = voisMoto.Transportspeed();
        System.out.println(motoSpeed + " м/сек");
        voisMoto.vois();


        //Vois voiskwadro =new kwadro();
       // voiskwadro.vois();



    }
}
