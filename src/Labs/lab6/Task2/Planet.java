package Labs.lab6.Task2;

import java.util.Objects;

public class Planet
{
  private String nameOfPlanet;
    private Continent myContinent;

    public Planet(String nameOfPlanet,String nameOfCont) {
        this.nameOfPlanet = nameOfPlanet;
        this.myContinent=new Continent(nameOfCont);


    }

    public String getNameOfPlanet() {
        return nameOfPlanet;
    }

    public void setNameOfPlanet(String nameOfPlanet) {
        this.nameOfPlanet = nameOfPlanet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        if(this.nameOfPlanet==planet.nameOfPlanet&&this.myContinent==planet.myContinent) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfPlanet,myContinent);
    }



    @Override
    public String toString() {
        return "Planet{" +
                " nameOfPlanet=" + nameOfPlanet +" , "+
                 myContinent +
                '}';
    }
}

