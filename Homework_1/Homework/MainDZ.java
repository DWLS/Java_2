package Lesson1.Homework;


public class MainDZ {

    public static void main(String[] args) {

        Team team = new Team("Team");
        Course course = new Course("Course");
        course.doIt(team);

        System.out.println("-----------------");
        team.ShowRes();
    }

}
