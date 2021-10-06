package q4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sequence: ");
        String s = scanner.next();

        char[] chars = s.toCharArray();
        Character[] characters = new Character[chars.length];

        for (int i = 0; i < chars.length; i++) {
            characters[i] = chars[i];
        }
        Permutations<Character> perm = new Permutations<>(characters);

        int count = 0;
        while(perm.hasNext()){
            System.out.println(Arrays.toString(perm.next()));
            count++;
        }
        System.out.println("total: " + count);
    }
}
