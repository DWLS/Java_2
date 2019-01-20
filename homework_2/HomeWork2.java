package Lesson2.Homework;

public class HomeWork2 {
    
    public static void main(String[] args) {
        int sum = 0;

        String[][] Arr = {
                {"1", "2", "3", "4"},
                {"1", "4", "6", "9"},
                {"4", "5", "3"},
                {"9", "4", "7", "5"}
        };
        try {
            sum = sArray(Arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();;
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }

    private static int sArray(String[][] arr) throws MyArrayDataException,MyArraySizeException {
        int sum = 0;
        if (4 != arr.length) throw new MyArraySizeException();

        for (int i = 0; i < arr.length; i++) {

            if (4 != arr[i].length) throw new MyArraySizeException();

            for (int j = 0; j < arr[i].length; j++) {

                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }

}
