package Lesson1.Homework;


import Lesson1.Homework.Competitors.Cat;
import Lesson1.Homework.Competitors.Competitors;
import Lesson1.Homework.Competitors.Dog;
import Lesson1.Homework.Competitors.Human;
import Lesson1.Homework.Obstacle.Obstacle;

public class Team {
    String name;
    Competitors[] competitors;

    public Team(String name) {
        this.name = name;
        this.competitors = new Competitors[]{new Cat("Barsik"), new Dog("Tuzik"),
                new Human("Bob"), new Human("Petr")};

    }

    public void doIt(Obstacle obstacle) {
        for (Competitors c : competitors) {
            obstacle.doIt(c);
            if (!c.isDistance())
                break;
        }

    }

    public void ShowRes() {
        for (Competitors c : competitors) {
            c.info();
        }

    }
}
