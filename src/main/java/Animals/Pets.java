package Animals;

import java.time.LocalDate;


public abstract class Pets extends Animal {
    private static int countId = 0;
    public Pets(int id, String name, LocalDate birthDate) {
        super(name, birthDate);
        this.id = Pets.countId++;
    }


/*    @Override
    public int compareTo(Animal animal){
        return this.getClass().getSimpleName().compareTo(animal.getClass().getSimpleName());
    }

 */
}
