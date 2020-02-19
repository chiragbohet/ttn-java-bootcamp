//Q6. There is an array with every element repeated twice except one. Find that element
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

    int arr[] = {1, 2 , 3 , 1 ,2 , 3 ,4};
    System.out.println(getUnique(arr));
  }
}
