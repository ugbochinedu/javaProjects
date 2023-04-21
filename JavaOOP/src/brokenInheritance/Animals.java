package brokenInheritance;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    private List<Animal> animals = new ArrayList<>();

    public Animals(Animal animal){
        animals.add(animal);
    }

    public void behave(){
        animals.forEach(Animal::behave);
    }
}
