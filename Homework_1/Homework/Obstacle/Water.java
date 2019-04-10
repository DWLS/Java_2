package Lesson1.Homework.Obstacle;

import Lesson1.Homework.Competitors.Competitors;

public class Water extends Obstacle {

    private int lenght;

    public Water(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public void doIt(Competitors competitors) {
        competitors.swim(lenght);
    }
}
