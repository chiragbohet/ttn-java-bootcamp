package main.java.com.learning.day2_java2.q2;

//Q2 WAP to sorting string without using string Methods?
interface StringSortingAlgorithm {
  String sort(String stringToSort);
}

class BubbleSort implements StringSortingAlgorithm {
  @Override
  public String sort(String stringToSort) {

    char[] toSortCharArr = stringToSort.toCharArray();

    for (int i = 0; i < toSortCharArr.length - 1; i++)
      for (int j = 0; j < toSortCharArr.length - i - 1; j++)
        if (toSortCharArr[j] > toSortCharArr[j + 1]) {
          // swap arr[j+1] and arr[i]
          char temp = toSortCharArr[j];
          toSortCharArr[j] = toSortCharArr[j + 1];
          toSortCharArr[j + 1] = temp;
        }

    return new String(toSortCharArr);
  }
}

public class SortString {

  String stringToSort;
  StringSortingAlgorithm stringSortingAlgorithm;

  public SortString(String stringToSort, StringSortingAlgorithm stringSortingAlgorithm) {
    this.stringToSort = stringToSort;
    this.stringSortingAlgorithm = stringSortingAlgorithm;
  }

  String sortString() {
    return stringSortingAlgorithm.sort(stringToSort);
  }

  public static void main(String[] args) {

      String stringToSort = "ddasda2eqqe1AnJG";
      SortString sortString = new SortString(stringToSort, new BubbleSort());

    System.out.println("After sort : " + sortString.sortString());
  }
}
