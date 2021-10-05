package q2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(3);
        arrayList.add(1);


        ArrayList<Integer> integers = deleteInappropriateCouples(arrayList);

        for (var entry : integers) {
            System.out.println(entry);
        }
    }

    private static ArrayList<Integer> deleteInappropriateCouples(ArrayList<Integer> arrayList) {
        ArrayList<Integer> tempList;
        if (arrayList == null)
            tempList = null;
        else {
            tempList = new ArrayList<>();

            if (arrayList.size() % 2 != 0)
                arrayList.remove(arrayList.size() - 1);
            for (int i = 0; i < arrayList.size() - 1; i += 2) {
                if (arrayList.get(i) <= arrayList.get(i + 1)) {
                    tempList.add(arrayList.get(i));
                    tempList.add(arrayList.get(i + 1));
                }
            }
        }
        return tempList;
    }
}
