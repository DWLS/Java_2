package Lesson2.Homework;

public class MyArrayDataException extends Exception {
    int row;
    int col;

    public MyArrayDataException(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
