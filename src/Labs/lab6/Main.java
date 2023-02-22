package Labs.lab6;

import Labs.lab6.Task1.Auto;
import Labs.lab6.Task2.Continent;
import Labs.lab6.Task2.Planet;

public class Main {
    public static void main(String[] args) {

      //  Task2
        Planet planet1=new Planet("Earth","Australia");
        Planet planet2=new Planet("Eart","Australia");
        System.out.println(planet1);
        System.out.println(planet2);
        if(planet1==planet2)
            System.out.println("Same continets");
        else System.out.println("diferent continets");

        // Task1


//        Auto auto1=new Auto("BMW","X5",40,15);
//        auto1.Drive(500);
//        Auto auto2=new Auto("Audi","a5",30,17);
//        System.out.println();
//        if(auto1==auto2)
//            System.out.println("Same auto");
//        else System.out.println("diferent auto");
    }
}
