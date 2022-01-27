package chegg.animals;

import java.util.ArrayList;
import java.util.List;

public class AnimalFarm {

    public static void main(String[] args) {
        AnimalFarm animalFarm = new AnimalFarm();
        List<Animal> dogs = new ArrayList<>();
        dogs.add(new Dog());
        animalFarm.upperBound(dogs);
        animalFarm.lowerBound(dogs);
        dogs.clear();
        dogs.add(new Yorkie());
        animalFarm.upperBound(dogs);
        animalFarm.lowerBound(dogs);
        dogs.clear();
        dogs.add(new Animal());
        animalFarm.upperBound(dogs);
        animalFarm.lowerBound(dogs);
    }

    public void lowerBound(List<Animal>obj) {
        System.out.println(obj.get(0).sound());
    }

    public void upperBound(List<? extends Animal> obj) {
        System.out.println(obj.get(0).sound());
    }
}
