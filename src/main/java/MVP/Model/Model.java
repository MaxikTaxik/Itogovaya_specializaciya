package MVP.Model;

import Animals.*;
import Counter.Counter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



// Model.java


public class Model {
    private List<Animal> animals = new ArrayList<>();


    public Model(Counter counter) {
        this.counter = counter;
    }



    public void removeAnimal(int id) {
        animals.removeIf(a -> a.getId() == id);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public Animal getAnimalById(int id) {
        for (Animal animal : animals) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }

    public List<Animal> getAllAnimalsByBirthDate() {
        List<Animal> sortedAnimals = new ArrayList<>(animals);
        sortedAnimals.sort(Comparator.comparing(Animal::getBirthDate));
        return  sortedAnimals;
    }

    public int getCount() {
        return counter.getCount();
    }
}