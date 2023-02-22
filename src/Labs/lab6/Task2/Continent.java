package Labs.lab6.Task2;

import java.util.Objects;

public class Continent {
     private String nameOfContinent;

    public Continent( String nameOfContinent) {

        this.nameOfContinent = nameOfContinent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        if(this.nameOfContinent==continent.nameOfContinent) return true;

        return false;

    }

    @Override
    public int hashCode() {
        return Objects.hash( nameOfContinent);
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public void setNameOfContinent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    @Override
    public String toString() {
        return "We are on " +
                this.nameOfContinent ;

    }
}
