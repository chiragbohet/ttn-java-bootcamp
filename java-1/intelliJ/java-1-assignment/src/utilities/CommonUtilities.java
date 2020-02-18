package utilities;

import java.util.Scanner;

public class CommonUtilities {

    public static String getStringFromUser()
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        return input;
    }
}
