package assg5_Hernandez;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexNumTest {

	private ComplexNum l;
	private ComplexNum m;
	private ComplexNum n;
	@Test
	public void testComplexNum() {
		l = new ComplexNum();
	}

	@Test
	public void testComplexNumDoubleDouble() {
		m = new ComplexNum(4.6, 10.2);
		n = new ComplexNum(2.3, 5.1);
		
	}

	@Test
	public void testGetReal() {
		assertEquals("Default should be 0.0", 0.0, l.getReal(), 0.0);
		assertEquals("Default should be 4.6", 4.6, m.getReal(), 0.0);
		assertEquals("Default should be 2.3", 2.3, n.getReal(), 0.0);
	}

	@Test
	public void testGetImaginary() {
		assertEquals("Default should be 0.0", 0.0, l.getImaginary(), 0.0);
		assertEquals("Default should be 10.2", 10.2, m.getImaginary(), 0.0);
		assertEquals("Default should be 5.1", 5.1, n.getImaginary(), 0.0);

	}

	@Test
	public void testSetReal() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetImaginary() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testSub() {
		fail("Not yet implemented");
	}

	@Test
	public void testMul() {
		fail("Not yet implemented");
	}

	@Test
	public void testNeg() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

}
