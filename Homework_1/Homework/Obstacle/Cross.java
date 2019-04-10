package Lesson1.Homework.Obstacle;


import Lesson1.Homework.Competitors.Competitors;

public class Cross extends Obstacle {
    private int lenght;

    public Cross(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitors competitors) {
        competitors.run(lenght);
    }
}
