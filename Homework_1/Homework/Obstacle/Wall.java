package Lesson1.Homework.Obstacle;

import Lesson1.Homework.Competitors.Competitors;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitors competitors) {
        competitors.jump(height);
    }
}
