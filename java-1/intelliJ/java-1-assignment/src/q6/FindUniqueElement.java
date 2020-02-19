package q6;

public class FindUniqueElement {

  public static int getUnique(int[] arr) {

    int unique = 0;

    for (int i = 0; i < arr.length; i++) {
      unique = unique ^ arr[i];
    }

    return unique;
  }

  public static void main(String[] args) {

    int arr[] = {1, 1, 2, 2, 3};
    System.out.println(getUnique(arr));
  }
}
