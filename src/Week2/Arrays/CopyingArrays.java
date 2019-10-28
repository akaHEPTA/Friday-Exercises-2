package Week2.Arrays;

import java.util.Random;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] iArray = new int[10];
        int[] iArraryCopy = new int[10];
        Random myRandom = new Random();

        for (int i = 0; i < iArray.length; i++)
            iArray[i] = myRandom.nextInt(99) + 1;

        for (int i = 0; i < iArraryCopy.length; i++)
            iArraryCopy[i] = iArray[i];

        iArray[iArray.length - 1] = -7;

        System.out.print("Array 1: ");
        for (int i : iArray)
            System.out.print(i + " ");
        System.out.print("\nArray 2: ");

        for (int i : iArraryCopy)
            System.out.print(i + " ");


    }
}
