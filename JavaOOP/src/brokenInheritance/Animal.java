package brokenInheritance;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private List<Behaviour> behaviours = new ArrayList<>();

    public Animal(Behaviour behaviour){
        behaviours.add(behaviour);
    }

    public void behave(){
        behaviours.forEach(Behaviour::doStuff);
    }
}
