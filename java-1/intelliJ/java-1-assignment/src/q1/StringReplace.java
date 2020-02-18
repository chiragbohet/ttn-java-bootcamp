package q1;

import java.util.Scanner;

public class StringReplace {

    static String replaceSubString(String original, String replacementText, int startIndex, int endIndex)
    {
        StringBuilder newOriginal = new StringBuilder(original);
        newOriginal.replace(startIndex, endIndex, replacementText);
        return newOriginal.toString();
    }


    public static void main(String[] args) {

        System.out.println("Enter a string : ");
        Scanner in = new Scanner(System.in);
        String original = in.nextLine();

        System.out.println("Enter replacement string: ");
        String replacement = in.nextLine();

        System.out.println("Start Index : ");
        int startIndex = in.nextInt();

        System.out.println("End Index: ");
        int endIndex = in.nextInt();

        System.out.printf("New string : ");
        System.out.println(replaceSubString(original,replacement,startIndex,endIndex));

    }
}
