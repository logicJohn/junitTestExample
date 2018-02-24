/**
 * @author Johnnie Hernandez
 * 
 * @version Assignment 5
 * <p>csci2540Assignment2 is a group of methods for creating and 
 * manipulating Complex Numbers</p>
 */
package assg5_Hernandez;



/**
 * ComplexNum is an object to represent a Complex number in form <i> a + bi </i>
 * where the <i> a </i> and <i> b </i> are stored as doubled. 
 * In this case <i> a </i> is called the real number and <i> b </i> is called the imaginary number.
 */
public class ComplexNum {

	private double real;
	private double imaginary;
	
	/**
	 * Constructs a complex number <i> a + bi </i> both values are stored as doubles.
	 */
	public ComplexNum () {
		this.real = 0.0;
		this.imaginary = 0.0;
	}
	
	/**
	 * Constructs a complex number with the given real and imaginary values as doubles.
	 * @param real This is the <i> a </i> in the complex number.
	 * @param imaginary This is the <i> b </i> in the complex number.
	 */
	public ComplexNum (double real, double imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
	}
	
	/**
	 * Get the real number of the complex number.
	 * @return The real number of the Object ComplexNum.
	 */
	public double getReal () {
		return this.real;
	}
	
	/**
	 * Get the imaginary number of the complex number.
	 * @return The imaginary number of the Object ComplexNum.
	 */
	public double getImaginary () {
		return this.imaginary;
	}
	
	/**
	 * Changes the real number of an Object ComplexNum.
	 * @param real New real value as double.
	 */
	public void setReal (double real) {
		this.real = real;
	}
	
	/**
	 * Changes the imaginary number of an Object ComplexNum.
	 * @param imaginary New imaginary value as double.
	 */
	public void setImaginary (double imaginary) {
		this.imaginary = imaginary;
	}
	
	/**
	 * Provides the sum of two Complex Numbers.
	 * @param added is the Complex Number you wish to add.
	 * @return New ComplexNum which is the sum of two given ComplexNum.
	 */
	public ComplexNum add (ComplexNum added) {
		return new ComplexNum (this.real + added.getReal(), this.imaginary 
				+ added.getImaginary());
	}
	
	/**
	 * Provides the difference of two Complex Numbers.
	 * @param subtract Is the ComplexNum being used as subtracting value.
	 * @return New ComplexNum which is the difference of two given ComplexNum.
	 */
	public ComplexNum sub (ComplexNum subtract) {
		return new ComplexNum (this.real - subtract.getReal(), this.imaginary
				- subtract.getImaginary()); 
	}

	/**
	 * Provides the multiplied value of two Complex Numbers.
	 * @param multiple The ComplexNum being used to multiple.
	 * @return New ComplexNum which is the multiplied value of two given ComplexNum.
	 */
	public ComplexNum mul (ComplexNum multiple) {
		return new ComplexNum (this.real * multiple.getReal(), this.imaginary
				* multiple.getImaginary());
	}
	
	/**
	 * Provides the negative value of a Complex Number.
	 * @return New complexNum which is the multiplied value of two given ComplexNum.
	 */
	public ComplexNum neg () {
		return new ComplexNum (this.real * -1, this.imaginary * -1);
	}
	
	/**
	 * Provides Complex number in the form <i> a+bi</i>.
	 * @return  String of ComplexNum <i>a+bi</i>.
	 * {@inheritDoc} 
	 */
	@Override
	public String toString () {
		return   real + "+" + imaginary + "i";
	}
	
	/**
	 * Test to see if an object is a Complex Number.
	 * @param num An object.
	 * @return True if the given is a ComplexNum, else False.
	 */
	@Override
	public boolean equals (Object obj) {
		if ((obj instanceof ComplexNum)) {
			ComplexNum temp = (ComplexNum) obj;
			if (this.getReal() == temp.getReal()) {
				if (this.getImaginary() == temp.getImaginary()) {
					return true;
				}
			}
		}
		return false;
	}
	
}
