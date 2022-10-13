import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseMany(){
    int[] input1 = {3, 4, 5, 7, 6};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{6, 7, 5, 4, 3}, input1);
  }

  @Test
  public void testReversedMany(){
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverage(){
    double[] input1 = {1.0, 1.0, 1.0, 2.0, 3.0, 4.0};
    assertEquals(2.2, ArrayExamples.averageWithoutLowest(input1), 0);
  }
}
