package Comand;

import Animals.Animal;

public class SitComand extends Comand {


	@Override
	public void executing(Animal animal) {
		String name = animal.getName();
		System.out.printf("The s% is siting.", name );
	}


}
