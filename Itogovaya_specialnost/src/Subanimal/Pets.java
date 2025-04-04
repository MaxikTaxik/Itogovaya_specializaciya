package Subanimal;

import BaseClass.Animal;

import java.time.LocalDate;


public abstract class Pets extends Animal {
    public Pets(int id, String name, LocalDate birthDate) {
        super(id, name, birthDate);
    }


/*    @Override
    public int compareTo(Animal animal){
        return this.getClass().getSimpleName().compareTo(animal.getClass().getSimpleName());
    }

 */
}
