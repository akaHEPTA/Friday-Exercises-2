package Week2.Arrays;

import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int[] iArray = new int[10];
        Random myRandom = new Random();

        for (int i = 0; i < iArray.length; i++)
            iArray[i] = myRandom.nextInt(99) + 1;

        for (int i = 0; i < iArray.length; i++)
            System.out.println(String.format("Slot %d contains a %d", i, iArray[i]));

    }
}