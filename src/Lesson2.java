public class Lesson2 {
    public static void main(String[] args) throws MyArraySizeException {
        System.out.println("Массив 1");
        String[][] arr1 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            System.out.println("Сумма элементов: " + sum(arr1));
        } catch (MyArraySizeException e1) {
            System.out.println(e1.getMessage());
        } catch (MyArrayDataException e2) {
            System.out.println(e2.getMessage());
        }
        System.out.println("Массив 2");
        String[][] arr2 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            System.out.println("Сумма элементов: " + sum(arr2));
        } catch (MyArraySizeException e1) {
            System.out.println(e1.getMessage());
        } catch (MyArrayDataException e2) {
            System.out.println(e2.getMessage());
        }
        System.out.println("Массив 3");
        String[][] arr3 = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "З", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        try {
            System.out.println("Сумма элементов: " + sum(arr3));
        } catch (MyArraySizeException e1) {
            System.out.println(e1.getMessage());
        } catch (MyArrayDataException e2) {
            System.out.println(e2.getMessage());
        }
    }

    private static int sum(String arr[][]) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4)
            throw new MyArraySizeException("Ошибка! Требуется двумерный строковый массив размером 4х4");
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArraySizeException("Ошибка! В ячейке [" + String.valueOf(i) + "]["+ String.valueOf(j) + "] содержится не числовое значение");
                }
            }
        }

        return sum;
    }
}
