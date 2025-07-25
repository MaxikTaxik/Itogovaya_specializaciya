package MVP.Model;

import Animals.Animal;
import Animals.Pack_animals;
import Animals.Pets;
import Counter.Counter;

import java.util.ArrayList;
import java.util.List;

public class AnimalReester {
	int counterAnimals;
	int counterPackAnimals;
	int counterPets;

	List<Animal> packAnimals;
	List<Animal> petsAnimals;

	AnimalReester(){
		this.packAnimals = new ArrayList<>();
		this.petsAnimals = new ArrayList<>();
	}

	public void addAnimal(Animal animal) {
		if (animal instanceof Pack_animals) {
			packAnimals.add(animal);
			counterAnimals++;
		}
	}


}
