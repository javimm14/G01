import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {

	@Test
<<<<<<< HEAD
	public void test1Modificado() {
=======
	public void testNombreCambiado() {
>>>>>>> resta
		assertEquals(4, sum(1, 3));
	}

	@Test
	public void testSumNumWithZero() {
		assertEquals(2, sum(2, 0));
		assertEquals(2, sum(0, 2));
	}

	@Test
	public void testSumWithNeg() {
		assertEquals(6, sum(8, -2));
		assertEquals(-7, sum(-4, -3));
	}

	int sum(int a, int c) {
		return Sum.sum(a, c);

	}
	@Test 
	public void sumaTresNumeros() {
		assertEquals(7, Sum.sum(1, 4, 2));

	}

}
