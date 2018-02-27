/**
 * @author Johnnie Hernandez
 * 
 * @version Assignment 5
 * <p>csci2540Assignment 2 & 5 is a group of methods for creating and 
 * manipulating Complex Numbers</p>
 */
package assg5_Hernandez;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexNumTest {

	private double a = 4.6;
	private double b = 10.2;
	private double c = 2.3;
	private double d = 5.1;
	private ComplexNum l;
	private ComplexNum m;
	private ComplexNum n;
	
		
	@Test
	public void testComplexNum() {
		l = new ComplexNum();
		assertEquals("0.0 should be", 0.0, l.getReal(), 0.0);
		assertEquals("0.0 should be", 0.0, l.getImaginary(), 0.0);
	}

	
	@Test
	public void testComplexNumDoubleDouble() {
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
		
		assertEquals(a + " should be", a, m.getReal(), 0.0);
		assertEquals(b + " should be", b, m.getImaginary(), 0.0);
		assertEquals(c + " should be", c, n.getReal(), 0.0);
		assertEquals(d + " should be", d, n.getImaginary(), 0.0);
	}

	
	@Test
	public void testGetReal() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
		
		assertEquals("Real of ComplexNum", 0.0, l.getReal(), 0.0);
		assertEquals("Real of ComplexNum", a, m.getReal(), 0.0);
		assertEquals("Real of ComplexNum", c, n.getReal(), 0.0);
	}

	
	@Test
	public void testGetImaginary() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
		
		assertEquals("Imaginary of ComplexNum", 0.0, l.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", b, m.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", d, n.getImaginary(), 0.0);

	}

	
	@Test
	public void testSetReal() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
		
		l.setReal(4);
		m.setReal(5.5);
		n.setReal(6.0);
		
		assertEquals("Real of ComplexNum", 4.0, l.getReal(), 0.0);
		assertEquals("Real of ComplexNum", 5.5, m.getReal(), 0.0);
		assertEquals("Real of ComplexNum", 6.0, n.getReal(), 0.0);
		
	}

	
	@Test
	public void testSetImaginary() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
		
		l.setImaginary(4);
		m.setImaginary(5.5);
		n.setImaginary(6.0);
		
		assertEquals("Imaginary of ComplexNum", 4.0, l.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", 5.5, m.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", 6.0, n.getImaginary(), 0.0);
		
	}

	@Test
	public void testAdd() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
		
		ComplexNum r = l.add(m);
		ComplexNum s = m.add(l);
		ComplexNum t = n.add(n);
		

		assertEquals("Real of ComplexNum", a, r.getReal(), 0.0);
		assertEquals("Real of ComplexNum", a, s.getReal(), 0.0);
		assertEquals("Real of ComplexNum", (c+c), t.getReal(), 0.0);
		assertEquals("Imaginary of ComplexNum", b, r.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", b, s.getImaginary(), 0.0);
		assertEquals("Imaginary of ComplexNum", (d+d), t.getImaginary(), 0.0);		
		
	}

	@Test
	public void testSub() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
		
		ComplexNum r = l.sub(m);
		ComplexNum s = m.sub(l);
		ComplexNum t = n.sub(n);
		

		assertEquals(" should be", -a, r.getReal(), 0.0);
		assertEquals(" should be", a, s.getReal(), 0.0);
		assertEquals(" should be", 0.0, t.getReal(), 0.0);
		assertEquals(" should be", -b, r.getImaginary(), 0.0);
		assertEquals(" should be", b, s.getImaginary(), 0.0);
		assertEquals(" should be", 0.0, t.getImaginary(), 0.0);		
				
		
	}

	@Test
	public void testMul() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
	
		ComplexNum r = l.mul(m);
		ComplexNum s = m.mul(n);
		ComplexNum t = n.mul(n);
		
		assertEquals("Multiplication of ComplexNum real", 0.0, r.getReal(), 0.0 );
		assertEquals("Multiplication of ComplexNum real", -40.5, s.getReal(), 0.0);
		assertEquals("Multiplication of ComplexNum real", -20.72, t.getReal(), 0.0);
		assertEquals("Multiplication of ComplexNum imaginary", 0.0, r.getImaginary(), 0.0);
		assertEquals("Multiplication of ComplexNum imaginary", -10.2, s.getImaginary(), 0.0);
		assertEquals("Multiplication of ComplexNum imaginary", -5.1, t.getImaginary(), 0.0);
	}

	@Test
	public void testNeg() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
		
		ComplexNum r = l.neg();
		ComplexNum s = m.neg();
		ComplexNum t = n.neg();
		

		assertEquals("Neg of Complex number real", 0.0, r.getReal(), 0.0);
		assertEquals("Neg of Complex number real", -a, s.getReal(), 0.0);
		assertEquals("Neg of Complex number real", -c, t.getReal(), 0.0);
		assertEquals("Neg of Complex number imaginary", 0.0, r.getImaginary(), 0.0);
		assertEquals("Neg of Complex number imaginary", -b, s.getImaginary(), 0.0);
		assertEquals("Neg of Complex number imaginary", -d, t.getImaginary(), 0.0);		
				
	}

	
	@Test
	public void testToString() {
		l = new ComplexNum();
		m = new ComplexNum(a, b);
		n = new ComplexNum(c, d);
		
		assertEquals("Method toString should be", "0.0+0.0i", l.toString());
		assertEquals("Method toString should be", a + "+" + b + "i", m.toString());
		assertEquals("Method toString should be", c + "+" + d + "i", n.toString());		
		
	}

	@Test
	public void testEqualsObject() {
		l = new ComplexNum();
		m = new ComplexNum(0.0, 0.0);
		n = new ComplexNum(c, d);
		
		assertTrue("Should be true", l.equals(m));
		assertTrue("Should be true", m.equals(l));
		assertFalse("Should be false", n.equals(l));
		assertFalse("Should be false", n.equals(m));
		
	}

}
