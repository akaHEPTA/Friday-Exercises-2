package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Random myRandom = new Random();

        for (int i = 0; i < 10; i++)
            arrList.add(myRandom.nextInt(99) + 1);

        System.out.println("ArrayList: " + arrList);
        System.out.println();

        int max = 0;
        for (int i : arrList)
            max = Math.max(max, i);

        System.out.println("The largest value is " + max);
    }
}
