package Animals;

import Subanimal.Pets;

import java.time.LocalDate;
import java.util.Collections;

public class Cat extends Pets {
    public Cat(int id, String name, LocalDate birthDate) {
        super(id, name, birthDate);
        commands.add("Мурлыкай");
        commands.add("Спи");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID Животного: " + getId());
        System.out.println("Кошка: " + name);
    }
}
/*
    @Override
    public void comands() {
        System.out.println("The cat going to a dish.");
    }
    @Override
    protected void listOfComands() {
        System.out.println(this.name);
    }

    @Override
    protected void addToListComands(String newComand) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.comand + newComand);
        this.comand = sb.toString();
    }

    @Override
    public LocalDate getDate() {
        return this.dateBirth;
    }

 */
