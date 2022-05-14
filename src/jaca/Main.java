package jaca;

import java.util.Scanner;

public class Main {

    public static String StringChallenge(String str) {

        char[] letters = str.toCharArray();
        char lastLetter = 0;
        int howManyChars = 1;

        StringBuilder result = new StringBuilder();

        int loops = 0;
        for (char a :
                letters) {

            if (a == lastLetter) {
                howManyChars++;
            } else {
                if (lastLetter != 0) {
                    result.append(howManyChars);
                    result.append(lastLetter);
                    howManyChars = 1;
                }
            }
            if (loops == letters.length - 1) {
                result.append(howManyChars);
                result.append(a);
            }

            lastLetter = a;
            loops++;
        }

        str = String.valueOf(result);
        return str;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(StringChallenge(s.nextLine()));
    }
}
