package Animals;


import java.time.LocalDate;

public class Donkey extends Pack_animals {
    public Donkey(int id, String name, LocalDate birthDate) {
        super(id, name, birthDate);
        commands.add("Иди");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID Животного: " + getId());
        System.out.println("Осёл: " + name);
    }
}


/*
    @Override
    public String toString(){
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

