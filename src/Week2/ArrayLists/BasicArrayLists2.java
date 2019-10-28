package Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Random myRandom = new Random();

        for (int i = 0; i < 10; i++)
            arrList.add(myRandom.nextInt(99) + 1);

        System.out.println("ArrayList: " + arrList);
    }
}
