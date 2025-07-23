package Animals;


import java.time.LocalDate;

public class Camel extends Pack_animals {
    public Camel(int id, String name, LocalDate birthDate) {
        super(id, name, birthDate);
        commands.add("Иди");
    }

    @Override
    public void displayInfo() {
        System.out.println("ID Животного: " + getId());
        System.out.println("Верблюд: " + name);
    }
}


/*
    @Override
    public void comands() {
        System.out.println("");
    }

    @Override
    protected void listOfComands() {
        System.out.println(this.listOfComands(););
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

