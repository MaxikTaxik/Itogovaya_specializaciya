package BaseClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class Animal {
    protected int id;
    protected String name;
    protected LocalDate birthDate;
    protected List<String> commands;

    public Animal(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    public void addCommand(String command) {
        commands.add(command);
    }

    public List<String> getCommands() {
        return commands;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public abstract void displayInfo();

    public int getId() {
        return id;
    }
}


//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (!(obj == null || getClass() != obj.getClass())) return  false;
//        BaseClass.Animal other = (BaseClass.Animal) obj;
//        return  id == other.id && Objects.equals(name, other.name);
//
//    }

