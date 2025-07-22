package MVP;

import BaseClass.Animal;
// AnimalView.java
public class View {
    public void printAnimal(Animal animal) {
        animal.displayInfo();
        System.out.println("Дата рождения: " + animal.getBirthDate());
        System.out.println("Команды: " + animal.getCommands());
    }

    public void printComands(Animal animal){
        System.out.println("Команды: " + animal.getCommands());
    }

    public void printBirthDate(Animal animal){
        System.out.println("Дата рождения: " + animal.getBirthDate());
    }

    public void printMenu() {
        System.out.println("1. Завести новое животное");
        System.out.println("2. Удалить животное");
        System.out.println("3. Посмотреть список команд животного");
        System.out.println("4. Обучить животное новым командам");
        System.out.println("5. Показать всех животных отсортированных по дате рождения");
        System.out.println("6. Показать количество животных в реестре.");
        System.out.println("7. Выход");
    }
}

