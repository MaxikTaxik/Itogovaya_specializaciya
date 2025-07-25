package Animals;

import java.time.LocalDate;

public abstract class Pack_animals extends Animal {
    private static int countId = 0;
    public Pack_animals(String name, LocalDate birthDate) {
        super(name, birthDate);
        this.id = Pack_animals.countId++;
    }

 /*   @Override
    public int compareTo(Animal animal){
        return this.getClass().getSimpleName().compareTo(animal.getClass().getSimpleName());
    }

  */
}
