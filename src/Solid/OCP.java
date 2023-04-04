package Solid;

import java.lang.reflect.AnnotatedElement;

public class OCP {

    /*
    * Open-closed pricipl - программные сущности (классы, модули, функции и т.п.) должны быть открыты для расширения, но закрыты для изменения.
    *
    * Тоесть место того что бы создавлять или добавлять в методи условия(if) мы создаем новие сущности путем наследования
    *
    *
    *
    *
    *
    *
    *
    * */
    public static void main(String[] args) {

        new Bark(new Cat()).barking();

        new Bark(new Dog()).barking();

        new Bark(new Unkhown()).barking();

    }

}
/*
class Animal{
    String type;

    public Animal(String type) {
        this.type = type;
    }
}


class Bark{
    Animal animal;

    public Bark(Animal animal) {
        this.animal = animal;
    }

    public void barking(){                        // Вместо создания условий лучше создать новие сущности
        if(animal.type=="Cat")
            System.out.println("miayy");
        else if (animal.type=="Dog") {
            System.out.println("Gav");
        }
        else System.out.println("ayaya");
    }
}
*/
interface BarkInter{
    void bark();
}
class Animal implements BarkInter{


    @Override
    public void bark() {

    }
}


class Bark{
    Animal animal;

    public Bark(Animal animal) {
        this.animal = animal;
    }

    public void barking(){                        // Вместо создания условий лучше создать новие сущности
        animal.bark();
    }
}


class Cat extends Animal{ //  создали новие сущности


    @Override
    public void bark() {
        System.out.println("miayy");
    }
}

class Dog extends Animal{

    @Override
    public void bark() {
        System.out.println("Gav");
    }
}

class Unkhown extends Animal{

    @Override
    public void bark() {
        System.out.println("ayaya");
    }
}



