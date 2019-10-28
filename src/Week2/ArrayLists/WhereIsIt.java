package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Random myRandom = new Random();
        Scanner myScan = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
            arrList.add(myRandom.nextInt(49) + 1);

        System.out.println("ArrayList: " + arrList);
        System.out.print("Value to find: ");

        int input = myScan.nextInt();
        System.out.println();
        boolean isIn = false;

        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) == input) {
                System.out.println(input + " is in slot " + i + '.');
                isIn = true;
            }
        }

        if (!isIn) {
            System.out.println(input + " is not in the array.");
        }
    }
}
