package Animals;

import Comand.Comand;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public abstract class Animal {
    protected int id;
    protected String name;
    protected LocalDate birthDate;
    protected List<Comand> commands;

    public Animal(String name, LocalDate birthDate) {
        this.id = 0;
        this.name = name;
        this.birthDate = birthDate;
        this.commands = new ArrayList<>();
    }

    public abstract void displayInfo();

    public void addCommand(Comand command) {
        commands.add(command);
    }

    public List<Comand> getCommands() {
        return commands;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


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

