package q1;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Character> characterSet1;
        Set<Character> characterSet2;

        characterSet1 = fillSetWithRandomChar();
        characterSet2 = fillSetWithRandomChar();

        System.out.println("-------------characterSet1-------------");
        printCharset(characterSet1);
        System.out.println();
        System.out.println("-------------characterSet2-------------");
        printCharset(characterSet2);

        System.out.println("-------------union Of Sets-------------");
        unionOfSets(characterSet1, characterSet2);

        System.out.println("-------------intersection Of Sets-------------");
        intersectionOfSets(characterSet1, characterSet2);
    }

    public static void unionOfSets(Set<Character> set1, Set<Character> set2) {
        Set<Character> tempSet = new TreeSet<>(set1);
        tempSet.addAll(set2);
        printCharset(tempSet);
    }

    public static void intersectionOfSets(Set<Character> set1, Set<Character> set2) {
        Set<Character> tempSet = new TreeSet<>(set1);
        tempSet.retainAll(set2);
        printCharset(tempSet);
    }

    private static TreeSet<Character> fillSetWithRandomChar() {
        TreeSet<Character> charSet = new TreeSet<>();
        Random random = new Random();
        int counter = 0;
        while (counter < 10) {
            char randomizedCharacter = (char) (random.nextInt(26) + 'a');
            if (charSet.contains(randomizedCharacter))
                continue;
            else
                counter++;
            charSet.add(randomizedCharacter);
        }
        return charSet;
    }

    private static void printCharset(Set<Character> charSet) {
        for (var entry : charSet) {
            System.out.println(entry);
        }
    }
}
