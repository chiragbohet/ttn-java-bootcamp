package healthycoderapp;

import com.sun.org.apache.bcel.internal.classfile.Code;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

  private static String environment = "prod";

  @Nested
  @DisplayName("isDietRecommended()")
  class isDietRecommendedTest {

    @ParameterizedTest(name = "weight={0}, height={1}")
    @CsvFileSource(resources = "/coderWeightHeight.csv")
    void should_ReturnTrue_When_DietIsRecommended(double coderWeight, double coderHeight) {

      // given
      double weight = coderWeight;
      double height = coderHeight;

      // when
      boolean recommend = BMICalculator.isDietRecommended(weight, height);

      // then
      assertTrue(recommend);
    }

    @ParameterizedTest(name = "weight={0}, height={1}")
    @CsvSource(value = {"50.0,1.92", "40.0, 1.92", "45.0,1.9"})
    void should_ReturnFalse_When_DietNotRecommended(double coderWeight, double coderHeight) {

      // given
      double weight = coderWeight;
      double height = coderHeight;

      // when
      boolean recommend = BMICalculator.isDietRecommended(weight, height);

      // then
      assertFalse(recommend);
    }

    @Test
    void should_ThrowArithmeticException_When_HeightZero() {
      // given
      double weight = 50.0;
      double height = 0;

      // when
      Executable executable = () -> BMICalculator.isDietRecommended(weight, height);

      // then
      assertThrows(ArithmeticException.class, executable);
    }

    @ParameterizedTest(name = "weight={0}")
    @CsvSource(value = {"0", "-10", "-30"})
    void should_ReturnFalse_When_WeightIsZeroOrNegative(double weight) {
      // given
      double _weight = weight;
      double height = 1.72;

      // when
      Boolean result = BMICalculator.isDietRecommended(weight, height);

      // then
      assertFalse(result);
    }
  }

  @Nested
  @DisplayName("findCoderWithWorstBMI()")
  class worstBMITest {

    @Test
    void should_ReturnCoderWithWorstBMI_When_CoderListIsNotEmpty() {

      // given
      List<Coder> coders = new ArrayList<>();
      coders.add(new Coder(1.80, 60.0));
      coders.add(new Coder(1.82, 98.0));
      coders.add(new Coder(1.82, 64.7));

      // when
      Coder coderWithWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

      // then
      assertAll(
          () -> assertEquals(1.82, coderWithWorstBMI.getHeight()),
          () -> assertEquals(98.0, coderWithWorstBMI.getWeight()));
    }

    @Test
    void should_ReturnNullCoderWithWorstBMI_When_CoderListIsEmpty() {

      // given
      List<Coder> coders = new ArrayList<>();

      // when
      Coder coderWithWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

      // then
      assertNull(coderWithWorstBMI);
      // assertEquals(null,coderWithWorstBMI); //this can be used too
    }

    @Test
    void should_ReturnCorrectBMIScoresArray_When_CoderListIsNotEmpty() {
      // given
      List<Coder> coders = new ArrayList<>();
      coders.add(new Coder(1.80, 60.0));
      coders.add(new Coder(1.82, 98.0));
      coders.add(new Coder(1.82, 64.7));
      double[] expected = {18.52, 29.59, 19.53};

      // when
      double[] bmiScores = BMICalculator.getBMIScores(coders);

      // then
      assertArrayEquals(expected, bmiScores);
    }

    @Test
    void should_ReturnCoderWithWorstBMI_When_CoderListIs10000Elements() {

      // given
      Assumptions.assumeTrue(BMICalculatorTest.this.environment.equals("prod"));
      List<Coder> coders = new ArrayList<>();
      for (int i = 0; i < 10000; i++) coders.add(new Coder(1.0 + i, 10.0 + i));

      // when
      Executable executable = () -> BMICalculator.findCoderWithWorstBMI(coders);

      // then
      assertTimeout(Duration.ofMillis(10), executable);
    }
  }

  @Nested
  @DisplayName("getBMIScores()")
  class getBMIScoresTest {

    List<Coder> coderList;

    @BeforeEach
    void setup() {
      coderList = new ArrayList<Coder>();
    }

    @Test
    void should_ReturnEmptyList_When_InputListIsEmpty() {
      // given
      // Empty list
      double[] expected = new double[0];

      // when
      double[] actual = BMICalculator.getBMIScores(coderList);

      // then
      assertArrayEquals(expected, actual);
    }

    @Test
    void should_ThrowNullPointerException_When_InputListIsNull() {

      // given
      coderList = null;

      // when
      Executable executable =
          () -> {
            BMICalculator.getBMIScores(coderList);
          };

      // then
      assertThrows(NullPointerException.class, executable);
    }

    @Test
    void should_ReturnCorrectBMI_When_InputIsGiven()
    {
        // given
        coderList.add(new Coder(1.80, 60.0));
        coderList.add(new Coder(1.82, 98.0));
        coderList.add(new Coder(1.82, 64.7));
        double[] expected = {18.52, 29.59, 19.53};

        // when
        double[] actual = BMICalculator.getBMIScores(coderList);

        // then
        assertArrayEquals(expected,actual);

    }
  }


}
