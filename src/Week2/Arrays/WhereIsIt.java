package Week2.Arrays;

import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Random myRandom = new Random();
        Scanner myScan = new Scanner(System.in);
        int[] iArray = new int[10];

        System.out.print("Array: ");
        for (int i = 0; i < iArray.length; i++) {
            int temp = myRandom.nextInt(49) + 1;
            iArray[i] = temp;
            System.out.print(temp + " ");
        }
        System.out.print("\nValue to find: ");
        int input = myScan.nextInt();
        System.out.println();
        boolean isIn = false;

        for (int i = 0; i < iArray.length; i++) {
            if (iArray[i] == input) {
                System.out.println(input + " is in slot " + i + '.');
                isIn = true;
            }
        }

        if(!isIn){
            System.out.println(input + " is not in the array.");
        }

    }

}
