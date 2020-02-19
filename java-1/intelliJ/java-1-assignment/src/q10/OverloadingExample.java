package q10;

public class OverloadingExample {

    public static void main(String[] args) {

        OverloadingExample oe = new OverloadingExample();

        System.out.println("Adding two integers : " + oe.add(5, 5));
        System.out.println("Adding two doubles : " + oe.add(5.0, 5.0));
        System.out.println("Multiplying two floats : " + oe.multiply(5.0f, 5.0f));
        System.out.println("Multiplying two integers : " + oe.multiply(5, 5));
        System.out.println("Concatenating two Strings  : " + oe.contatenateStrings("Chirag ", "Bohet"));
        System.out.println(
                "Concatenating three Strings  : " + oe.contatenateStrings("Mr.", "Chirag ", "Bohet"));
    }

    public double add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float multiply(int a, int b) {
        return a * b;
    }

    public String contatenateStrings(String s1, String s2) {
        return s1 + s2;
    }

    public String contatenateStrings(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }
}
