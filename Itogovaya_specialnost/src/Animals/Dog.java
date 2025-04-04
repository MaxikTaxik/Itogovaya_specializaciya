package Animals;

import Subanimal.Pets;

import java.time.LocalDate;
import java.util.Collections;

public class Dog extends Pets {
    public Dog(int id, String name, LocalDate birthDate) {
        super(id, name, birthDate);
        commands.add("Сиди");
        commands.add("Лежи");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID Животного: " + getId());
        System.out.println("Собака: " + name);
    }
}
/*

    @Override
    public void comands() {
        System.out.println("");
    }

    @Override
    public void listOfComands() {
        System.out.println(this.comand);
    }
    @Override
    public void addToListComands(String newComand) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.comand + ", " + newComand);
        this.comand = sb.toString();
    }

    @Override
    public LocalDate getDate() {
        return this.dateBirth;
    }


 */

