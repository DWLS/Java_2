package Lesson1.Homework.Competitors;


public class Animal implements Competitors {

    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;


    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " Успешно пробежал");
        } else {
            System.out.println("Провалил");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " Успешно проплыл");
        } else {
            System.out.println("Провалил");
            onDistance = false;
        }

    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " Успешно перепрыгнул");
        } else {
            System.out.println("Провалил");
            onDistance = false;
        }
    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}
