package lesson;
import java.util.Arrays;
import java.util.Scanner;

public class massive {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Insert array elements:");


        for (int i = 0; i < size; i++){

            array[i] = input.nextInt();

        }
        for(int i = 0; i < size; i++){
            if(array[i] < 0)
            {
                System.out.println("Negative num is: " + array[i]);
            }
            if (array[i] > 0)
            {
                System.out.println("Positive number is: " + array[i]);
            }
        }

        System.out.println();
    }
}
