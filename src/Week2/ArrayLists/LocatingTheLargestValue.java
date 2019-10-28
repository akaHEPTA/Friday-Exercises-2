package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Random myRandom = new Random();

        for (int i = 0; i < 10; i++)
            arrList.add(myRandom.nextInt(99) + 1);

        System.out.println("ArrayList: " + arrList);

        int max = 0, index = 0;
        for (int i = 0; i < arrList.size(); i++)
            if (arrList.get(i) > max) {
                max = arrList.get(i);
                index = i;
            }

        System.out.println("The largest value is " + max + ", which is in slot " + index);
    }
}
