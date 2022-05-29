package classes;

public class dynaarr {

    int[] result = new int[5];

    int count;

    void add(int value) {
        if (count == result.length) { // если count равняется длинне массива ,
            int[] newArray = new int[result.length * 2]; // создаётся новый массив по размерности в 2 раза больше предыдущего
            System.arraycopy(result, 0, newArray, 0, result.length); // arraycopy - копирование элементов одного массива в другой
            result = newArray;
        }
        result[count++] = value; // value - добавление нового элемента в Dynaarr
    }
}