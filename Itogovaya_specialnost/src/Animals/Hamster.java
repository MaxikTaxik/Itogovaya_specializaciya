package Animals;

import Subanimal.Pets;

import java.time.LocalDate;
import java.util.Collections;

public class Hamster extends Pets {
    public Hamster(int id, String name, LocalDate birthDate) {
        super(id, name, birthDate);
        commands.add("Бегай");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID Животного: " + getId());
        System.out.println("Хомяк: " + name);
    }
}

/*
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append(": ");
        sb.append(this.name);
        return sb.toString();
    }

    public String detailToString(){
        StringBuilder sb = new StringBuilder();
        sb.append("The name is: " + this.name);
        sb.append("\n");
        sb.append("Color is: " + this.color);sb.append("\n");
       
        sb.append("Weight is: " + this.weight);
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public void comands() {
        System.out.println("");
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

