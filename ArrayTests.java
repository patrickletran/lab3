import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlaceWithNums() {
    int[] input1 = {1,2,4};
    assertArrayEquals(new int[]{4,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedWithNums() {
    int[] input1 = {1,2,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,2,1}, input1);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input = {1.0,2.0,3.0,4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input),.1);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input = {1.0};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input),.1);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input = {1.0,2.0,3.0,1.0,4.0};
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(input),.1);
  }

  @Test
  public void testAverageWithoutLowest4() {
    double[] input = {2.0,3.0,1.0,4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input),.1);
  }

}
