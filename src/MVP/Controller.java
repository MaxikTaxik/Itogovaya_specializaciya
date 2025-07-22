package MVP;

// Controller.java
import Animals.*;
import BaseClass.Animal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;



public class Controller {
    private Model service;
    private View view;
    private Scanner scanner;

    public Controller(Model service, View view) {
        this.service = service;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            view.printMenu();
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Чистим буфер
            switch (choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    removeAnimal();
                    break;
                case 3:
                    printCommands();
                    break;
                case 4:
                    teachNewCommands();
                    break;
                case 5:
                    printAllAnimalsByBirthDate();
                    break;
                case 6:
                    printCount();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Недопустимый выбор");
            }
        }
    }

    private void addAnimal() {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();
        System.out.print("Введите дату рождения (в формате yyyy-MM-dd): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.print("Выберите тип животного (1 - собака, 2 - кошка, 3 - хомяк, 4 - верблюд, 5 - лошадь, 6 - осёл): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // Чистим буфер
        Animal animal;
        switch (type) {
            case 1:
                animal = new Dog(service.getAnimals().size() + 1, name, birthDate);
                break;
            case 2:
                animal = new Cat(service.getAnimals().size() + 1, name, birthDate);
                break;
            case 3:
                animal = new Hamster(service.getAnimals().size() + 1, name, birthDate);
                break;
            case 4:
                animal = new Camel(service.getAnimals().size() + 1, name, birthDate);
                break;
            case 5:
                animal = new Horse(service.getAnimals().size() + 1, name, birthDate);
                break;
            case 6:
                animal = new Donkey(service.getAnimals().size() + 1, name, birthDate);
                break;
            default:
                System.out.println("Недопустимый тип");
                return;
        }
        service.addAnimal(animal);
    }

    private void removeAnimal() {
        if (!service.getAnimals().isEmpty()) {
            System.out.print("Введите ID животного для удаления: ");
            int id = scanner.nextInt();
            service.removeAnimal(id);
        }
        else {
            System.out.println("В реестре не найденно животных");
        }
    }

    private void printCommands() {
        System.out.print("Введите ID животного: ");
        int id = scanner.nextInt();
        Animal animal = service.getAnimalById(id);
        if (animal != null) {
            view.printComands(animal);
        } else {
            System.out.println("Животное не найдено");
        }
    }

    private void teachNewCommands() {
        System.out.print("Введите ID животного: ");
        int id = scanner.nextInt();
        Animal animal = service.getAnimalById(id);
        scanner.nextLine();
        if (animal != null) {
            System.out.println("Введите новую команду: ");
            String command = scanner.nextLine();
            animal.addCommand(command);
            System.out.println("Животное обучено команде: " + command);
        } else {
            System.out.println("Животное не найдено");
        }
    }

    private void printAllAnimalsByBirthDate() {
        List<Animal> sortedAnimals = service.getAllAnimalsByBirthDate();
        if (sortedAnimals.isEmpty()) {
            System.out.println("Животных в репозитории нет");
        }
        else {
            for (Animal animal: sortedAnimals) {
                view.printAnimal(animal);
            }
        }
    }

    public void printCount() {
        System.out.println("Колличество животных в реестре: " + service.getCount());
    }
}


