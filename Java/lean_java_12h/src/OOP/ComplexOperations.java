package OOP;

/**
 * A complex number is a number that can be expressed in the form a + bi, where
 * a and b are real numbers, and i is a solution of the equation x2 = −1.
 * Because no real number satisfies this equation, i is called an imaginary
 * number. For the complex number a + bi, a is called the real part, and b is
 * called the imaginary part. To add or subtract two complex numbers, just add
 * or subtract the corresponding real and imaginary parts. For instance, the sum
 * of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is
 * 2 + 3i.
 * 
 * 
 * Write a class with the name ComplexNumber. The class needs two fields
 * (instance variables) with name real and imaginary of type double. It
 * represents the Complex Number.
 */
public class ComplexOperations {
    private double real;
    private double imaginary;

    /**
     * The class needs to have one constructor. The constructor has parameters real
     * and imaginary of type double and it needs to initialize the fields.
     * 
     * @param real
     * @param imaginary
     */
    public ComplexOperations(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    /**
     * 
     * Method named add with two parameters real and imaginary of type double, it
     * needs to add parameters to fields. In other words, it needs to do a complex
     * number add operation as described above.
     * 
     * @param real
     * @param imaginary
     */
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary = imaginary;
    }

    /**
     * Method named add with one parameter of type ComplexNumber. It needs to add
     * the ComplexNumber parameter to the corresponding instance variables.
     * 
     * @param complexOperations
     */
    public void add(ComplexOperations complexOperations) {
        add(complexOperations.real, complexOperations.imaginary);
    }

    /**
     * 
     * Method named subtract with two parameters real and imaginary of type double,
     * it needs to subtract parameters from fields, in other words, it needs to do a
     * complex number subtract operation as described above.
     * 
     * @param real
     * @param imaginary
     */
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexOperations complexOperations) {
        subtract(complexOperations.real, complexOperations.imaginary);
    }

}
