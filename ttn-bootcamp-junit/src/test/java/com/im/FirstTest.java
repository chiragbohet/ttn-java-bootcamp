package com.im;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

  First first;

  @BeforeEach
  void setup() {
    first = new First();
  }

  @Nested
  @DisplayName("replaceSubString()")
  class replaceSubStringTests {

    @Test
    void should_ReturnMainString_When_MainStringIsEmpty() {
      // given
      String mainString = "";
      String subString = "abc";
      String replacementString = "123";

      // when
      String actual = first.replaceSubString(mainString, subString, replacementString);

      // then
      assertEquals(mainString, actual);
    }

    @Test
    void should_ReturnMainString_When_SubStringIsNull() {
      // given
      String mainString = "abcdef";
      String subString = null;
      String replacementString = "123";

      // when
      String actual = first.replaceSubString(mainString, subString, replacementString);

      // then
      assertEquals(mainString, actual);
    }

    @Test
    void should_ReturnMainString_When_ReplacementStringIsNull() {
      // given
      String mainString = "abcdef";
      String subString = "abc";
      String replacementString = null;

      // when
      String actual = first.replaceSubString(mainString, subString, replacementString);

      // then
      assertEquals(mainString, actual);
    }

    @Test
    void should_ReturnMainString_When_MainStringDoesNotContainSubstring() {
      // given
      String mainString = "abcdef";
      String subString = "xyz";
      String replacementString = "123";

      // when
      String actual = first.replaceSubString(mainString, subString, replacementString);

      // then
      assertEquals(mainString, actual);
    }

    @ParameterizedTest(
        name = "mainString={0}, SubString={1}, replacementString={2}, expectedOutputString={3}")
    @CsvFileSource(resources = "/replaceSubString.csv", numLinesToSkip = 1)
    void should_ReplaceSubstringInsideMainString_When_AllInputsArePresentAndNormal(
        String mainString,
        String subString,
        String replacementString,
        String expcectedOutputString) {
      // given
      String _mainString = mainString;
      String _subString = subString;
      String _replacementString = replacementString;
      String _expectedOutputString = expcectedOutputString;

      // when
      String actual = first.replaceSubString(_mainString, _subString, _replacementString);

      // then
      assertEquals(_expectedOutputString, actual);
    }

    @Test
    void should_ThrowNullPointerException_When_MainStringIsNull() {
      // given
      String mainString = null;
      String subString = "abc";
      String replacementString = "123";

      // when
      Executable executable =
          () -> {
            first.replaceSubString(mainString, subString, replacementString);
          };

      // then
      assertThrows(NullPointerException.class, executable);
    }
  }

  @Nested
  @DisplayName("filterEvenElements()")
  class filterEvenElementsTests {

    List<Integer> list;

    // Assuming input will be a array list
    @BeforeEach
    void setup() {
      list = new ArrayList<Integer>();
    }

    @Test
    void should_ReturnEmptyList_When_InputListIsEmpty() {

      // given
      // List has no elements

      // when
      List<Integer> filteredList = first.filterEvenElements(list);
      List<Integer> expectedList = new ArrayList<>();

      // then
      assertEquals(0, filteredList.size());
    }

    @Test
    void should_ThrowNullPointerException_When_InputListIsNull() {
      // given
      list = null;

      // when
      Executable executable =
          () -> {
            first.filterEvenElements(list);
          };

      // then
      assertThrows(NullPointerException.class, executable);
    }

    @Test
    void should_FilterEvenElements_When_InputIsGiven() {
      final int RANGE = 10000;

      // given
      for (int i = 0; i < RANGE; i++) list.add(i);

      List<Integer> oddList = list.stream().filter(e -> e % 2 != 0).collect(Collectors.toList());

      // when
      List<Integer> filteredList = first.filterEvenElements(list);

      // then
      assertEquals(oddList, filteredList);
    }
  }

  @Nested
  @DisplayName("calculateAverage()")
  class calculateAverageTests {

    List<BigDecimal> values = null;

    @BeforeEach
    void setup() {
      values = new ArrayList<BigDecimal>();
    }

    @Test
    void should_ThrowRunTimeException_When_InputListIsNull() {
      // given
      List<BigDecimal> values = null;

      // when
      Executable executable =
          () -> {
            first.calculateAverage(values);
          };

      // then
      assertThrows(RuntimeException.class, executable);
    }

    @Test
    void should_ThrowRunTimeException_When_InputListIsEmpty() {
      // given
      List<BigDecimal> values = new ArrayList<>();

      // when
      Executable executable =
          () -> {
            first.calculateAverage(values);
          };

      // then
      assertThrows(RuntimeException.class, executable);
    }

    @Test
    void should_ReturnCorrectAverage_When_InputIsGiven() {
      // given
      for (int i = 0; i < 1000000; i++) values.add(new BigDecimal("9999999999"));

      BigDecimal expectedAverage = new BigDecimal("9999999999");

      // when
      BigDecimal actualAverage = first.calculateAverage(values);

      // then
      assertEquals(expectedAverage, actualAverage);
    }
  }

  @Nested
  @DisplayName("isPallindrome()")
  class isPalindromeTests {

    @Test
    void should_ReturnTrue_When_InputStringIsEmpty() {
      // given
      String originalString = "";

      // when
      Boolean result = first.isPallindrome(originalString);

      // then
      assertTrue(result);
    }

    @Test
    void should_ThrowNullPointerException_When_InputStringIsNull() {
      // given
      String originalString = null;

      // when
      Executable executable =
          () -> {
            first.isPallindrome(originalString);
          };

      // then
      assertThrows(NullPointerException.class, executable);
    }

    @ParameterizedTest(name = "originalString={0}")
    @CsvFileSource(resources = "/palindrome/notPalindromeWords.csv")
    void should_ReturnFalse_When_InputStringIsNotPalindrome(String originalString) {
      // given
      String _originalString = originalString;

      // when
      Boolean result = first.isPallindrome(_originalString);

      // then
      assertFalse(result);
    }

    @ParameterizedTest(name = "originalString={0}")
    @CsvFileSource(resources = "/palindrome/palindromeWords.csv", numLinesToSkip = 1)
    void should_ReturnTrue_When_InputStringIsPalindrome(String originalString) {
      // given
      String _originalString = originalString;

      // when
      Boolean result = first.isPallindrome(_originalString);

      // then
      assertTrue(result);
    }

    @ParameterizedTest(name = "orginalString={0}")
    @CsvFileSource(resources = "/palindrome/palindromeNumbers.csv", numLinesToSkip = 1)
    void should_ReturnTrue_When_InputStringIsPalindromicNumber(String originalString) {
      // given
      String _originalString = originalString;

      // when
      Boolean result = first.isPallindrome(_originalString);

      // then
      assertTrue(result);
    }

    //        @ParameterizedTest(name="originalString={0}")
    //        @CsvFileSource(resources = "/palindromeSentences.csv", numLinesToSkip = 1)
    //        void should_ReturnFalse_When_InputStringIsPalindromeSentence(String originalString)
    //        {
    //            // given
    //            String _originalString = originalString;
    //
    //            // when
    //            Boolean result = first.isPallindrome(_originalString);
    //
    //            // then
    //            assertFalse(result);
    //        }

  }
}
