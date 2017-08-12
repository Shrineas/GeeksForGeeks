package g4g.arrays.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KadaneAlgorithmTest {
	private KadameAlgorithm kadameAlgorithm;

	@Before
	public void setUp() throws Exception {
		kadameAlgorithm = new KadameAlgorithm();
	}

	// [1] = 1 					Single number
	// [2] = 2					Other single number
	// [-1] = -1				Single negative number
	// [1, 2] = 3				Multiple positive numbers, sum
	// [-1, -3] = -1			Multiple negative numbers
	// [1, 3, 2] = 6			Multiple positive numbers scrambled
	// [-1, 2] = 2				Multiple positive and negative numbers
	// [1, 3, -4, -1, 2] = 4	Multiple positive and negative numbers
	// [1, 1, -4, 5, 2, -3] = 7	Multiple positive and negative numbers


	@Test
	public void singleNumber_ShouldReturnSingleNumber() throws Exception {
		assertEquals(1, kadameAlgorithm.solution(new int[]{1}));
		assertEquals(2, kadameAlgorithm.solution(new int[]{2}));
	}

	@Test
	public void singleNegativeNumber_ShouldReturnNegativeNumber() throws Exception {
		assertEquals(-1, kadameAlgorithm.solution(new int[]{-1}));
	}

	@Test
	public void multiplePositiveNumbers_ShouldReturnSumOfNumbers() throws Exception {
		assertEquals(3, kadameAlgorithm.solution(new int[]{1, 2}));
	}

	@Test
	public void multipleNegativeNumbers_ShouldReturnMinusOne() throws Exception {
		assertEquals(-1, kadameAlgorithm.solution(new int[]{-1, -3}));
	}

	@Test
	public void multiplePositiveNumbersNumbersScrambled_ShouldReturnSumOfAllNumbers() throws Exception {
		assertEquals(6, kadameAlgorithm.solution(new int[]{1, 3, 2}));
	}

	@Test
	public void multiplePositiveAndNegativeNumbers_ShouldReturnLargestSumOfContiguousArray() throws Exception {
		assertEquals(2, kadameAlgorithm.solution(new int[]{-1, 2}));
		assertEquals(4, kadameAlgorithm.solution(new int[]{1, 3, -4, -1, 2}));
		assertEquals(7, kadameAlgorithm.solution(new int[] {1, 1, -4, 5, 2, -3}));
	}

}
