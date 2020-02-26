package main.java.com.learning.day1_java1.q1;

public class SubStringReplace {

    public static String replaceSubString(String original, String subString, String replacementText) {

        if (!original.isEmpty() && original.contains(subString)) {
            original = original.replaceAll(subString, replacementText);

        }
        return original;
    }

    public static void main(String[] args) {
        String original = "This is the original string";
        String subString = "original";
        String replacementString = "modified";

        String newString = SubStringReplace.replaceSubString(original, subString, replacementString);

        System.out.println(newString);  //This is the modified string
    }
}
