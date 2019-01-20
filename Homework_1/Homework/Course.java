package Lesson1.Homework;


import Lesson1.Homework.Obstacle.Cross;
import Lesson1.Homework.Obstacle.Obstacle;
import Lesson1.Homework.Obstacle.Wall;
import Lesson1.Homework.Obstacle.Water;

public class Course {

    String name;
    Obstacle[] obstacles;


    public Course(String name) {
        this.name = name;
        this.obstacles = new Obstacle[]{new Cross(80), new Wall(5), new Water(3)};

    }

    public void doIt(Team team) {
        for (Obstacle o : obstacles) {
            team.doIt(o);
        }
    }
}
