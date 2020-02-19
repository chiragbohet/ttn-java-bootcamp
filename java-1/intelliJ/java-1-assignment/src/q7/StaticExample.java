package q7;

public class StaticExample {

  static String firstNname = "Chirag";
  static String lastName = "Bohet";
  static int age = 24;

  static {
    System.out.println("Using static block!");
    System.out.println("First Name : " + firstNname);
    System.out.println("Last Name : " + lastName);
    System.out.println("Age : " + age);
  };

  static void usingStaticFunction() {
    System.out.println("Using static function!");
    System.out.println("First Name : " + firstNname);
    System.out.println("Last Name : " + lastName);
    System.out.println("Age : " + age);
  };

  public static void main(String[] args) {
    // By default static block code will get executed
    // Can execute static function by uncommentinglink
    // usingStaticFunction();

    //        System.out.println("Calling static variables directly inside main!");
    //        System.out.println("First Name : "+ firstNname);
    //        System.out.println("Last Name : "+ lastName);
    //        System.out.println("Age : " +age);
  }
}
