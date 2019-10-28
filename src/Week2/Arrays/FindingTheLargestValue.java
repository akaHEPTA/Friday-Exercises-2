package Week2.Arrays;

import java.util.Random;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        int[] iArray = new int[10];
        Random myRandom = new Random();

        System.out.print("Array: ");
        for (int i = 0; i < iArray.length; i++) {
            int temp = myRandom.nextInt(99) + 1;
            iArray[i] = temp;
            System.out.print(temp + " ");
        }
        System.out.println("\n");

        int max = 0;
        for (int i : iArray)
            max = Math.max(max, i);

        System.out.println("The largest value is " + max);
    }
}
