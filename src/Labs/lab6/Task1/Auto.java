package Labs.lab6.Task1;

import java.sql.SQLOutput;
import java.util.Objects;

public class Auto {


    private String carBrand;
 private String carModel;
    private double valumeOfTank;
    private double currentValumeOfTank;


    private double FuelConsumption;

    private Wheel myWheel;

    public Auto(String carBrand, String carModel, double valumeOfTank, double fuelConsumption ) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.valumeOfTank = valumeOfTank;
        FuelConsumption = fuelConsumption;
        currentValumeOfTank=valumeOfTank;
        this.myWheel = new Wheel(Math.random()+1000);

    }

    @Override
    public String toString() {
        return "Auto{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", valumeOfTank=" + valumeOfTank +
                ", currentValumeOfTank=" + currentValumeOfTank +

                ", FuelConsumption=" + FuelConsumption +
                ", myWheel=" + myWheel +
                '}';
    }

    public void Drive(double distance){
            byte b1=7;
            int i =1234567;
            long l = (long) i;
            short s = (short)i;
            byte b2= (byte) i;
            int i2 = (int) 123.456;
            byte b3= b1=7;


        double wastedFuel=(distance*FuelConsumption)/100;

       while(wastedFuel>currentValumeOfTank){
                wastedFuel -= currentValumeOfTank * 0.9;

           currentValumeOfTank -= currentValumeOfTank * 0.9;



           System.out.println("Залишилося проїхати "+(wastedFuel*100)/FuelConsumption);
           Refueling();
        }

        currentValumeOfTank -= wastedFuel;
        if (currentValumeOfTank<valumeOfTank*0.9)
            Refueling();
        System.out.println("Поїздка завершилась "+toString());
ChangeWheel();
        }



    public void Refueling(){
        System.out.println("Заправка на повный бак ");
        currentValumeOfTank=valumeOfTank;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        if(this.carBrand== auto.carBrand&&this.carModel==auto.carModel&&this.valumeOfTank== auto.valumeOfTank&&this.FuelConsumption==auto.FuelConsumption&&this.myWheel==auto.myWheel)return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, valumeOfTank, currentValumeOfTank, FuelConsumption, myWheel);
    }

    public void ChangeWheel(){
        System.out.println("Заміна колеса");
        double wheelId=Math.random()+100;
        if(wheelId!=myWheel.getWheelId())
       this.myWheel=new Wheel(wheelId);
else ChangeWheel();
        System.out.println("Колесо заміняно");
    }
}
