package Main;

import Animals.Cat;
import Animals.Dog;
import Animals.Hamster;
import BaseClass.Animal;
import Counter.Counter;
import MVP.Controller;
import MVP.Model;
import MVP.View;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            Model service = new Model(counter);
            View view = new View();
            Controller controller = new Controller(service, view);
            controller.run();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

    }

}