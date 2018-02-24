package assg5_Hernandez;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexNumTest {

	private ComplexNum l;
	private ComplexNum m;
	private ComplexNum n;
	
	
	protected void setUp() {
		l = new ComplexNum();
		m = new ComplexNum(4.6, 10.2);
		n = new ComplexNum(2.3, 5.1);
	}
	
	@Test
	public void testComplexNum() {
		//assertEquals(ComplexNum,  new ComplexNum());
		fail("not yet implemented");
	}

	@Test
	public void testComplexNumDoubleDouble() {
		m = new ComplexNum(4.6, 10.2);
		n = new ComplexNum(2.3, 5.1);
		
	}

	@Test
	public void testGetReal() {
		l = new ComplexNum();
		m = new ComplexNum(4.6, 10.2);
		n = new ComplexNum(2.3, 5.1);
		
		assertEquals("0.0 should be", 0.0, l.getReal(), 0.0);
		assertEquals("4.6 should be", 4.6, m.getReal(), 0.0);
		assertEquals("2.3 should be", 2.3, n.getReal(), 0.0);
	}

	@Test
	public void testGetImaginary() {
		l = new ComplexNum();
		m = new ComplexNum(4.6, 10.2);
		n = new ComplexNum(2.3, 5.1);
		
		assertEquals("0.0 should be", 0.0, l.getImaginary(), 0.0);
		assertEquals("10.2 should be", 10.2, m.getImaginary(), 0.0);
		assertEquals("5.1 should be", 5.1, n.getImaginary(), 0.0);

	}

	@Test
	public void testSetReal() {
		l = new ComplexNum();
		m = new ComplexNum(4.6, 10.2);
		n = new ComplexNum(2.3, 5.1);
		
		l.setReal(4);
		m.setReal(5.5);
		n.setReal(6.0);
		
		assertEquals("4.0 should be", 4.0, l.getReal(), 0.0);
		assertEquals("5.5 should be", 5.5, m.getReal(), 0.0);
		assertEquals("6.0 should be", 6.0, n.getReal(), 0.0);
		
	}

	@Test
	public void testSetImaginary() {
		l = new ComplexNum();
		m = new ComplexNum(4.6, 10.2);
		n = new ComplexNum(2.3, 5.1);
		
		l.setImaginary(4);
		m.setImaginary(5.5);
		n.setImaginary(6.0);
		
		assertEquals("4.0 should be", 4.0, l.getImaginary(), 0.0);
		assertEquals("5.5 should be", 5.5, m.getImaginary(), 0.0);
		assertEquals("6.0 should be", 6.0, n.getImaginary(), 0.0);
		
	}

	@Test
	public void testAdd() {
		l = new ComplexNum();
		m = new ComplexNum(4.6, 10.2);
		n = new ComplexNum(2.3, 5.1);
		
		ComplexNum r = l.add(m);
		ComplexNum s = m.add(l);
		ComplexNum t = n.add(n);
		

		assertEquals("4.6 should be", 4.6, r.getReal(), 0.0);
		assertEquals("4.6 should be", 4.6, s.getReal(), 0.0);
		assertEquals("4.6 should be", 4.6, t.getReal(), 0.0);
		assertEquals("10.2 should be", 10.2, r.getImaginary(), 0.0);
		assertEquals("10.2 should be", 10.2, s.getImaginary(), 0.0);
		assertEquals("10.2 should be", 10.2, t.getImaginary(), 0.0);		
		
	}

	@Test
	public void testSub() {
		fail("Not yet implemented");
	}

	@Test
	public void testMul() {
		//You need to fix the imaginary Class of ComplexNUm
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
