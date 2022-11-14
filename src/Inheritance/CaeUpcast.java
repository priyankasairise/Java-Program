package Inheritance;

public class CaeUpcast extends VehicleUPcast{


    public static void main(String[] args) {
        VehicleUPcast a=new CaeUpcast();
        System.out.println(a.wheel);
        a.ShowInfo();

    }
}
