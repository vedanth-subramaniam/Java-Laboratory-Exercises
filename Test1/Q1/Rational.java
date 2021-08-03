public class Rational{
    float real;
    float imaginary;
    
    
	public Rational(float ireal, float iimaginary) {
		
		this.real = ireal;
		this.imaginary = iimaginary;
	}
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImaginary() {
		return imaginary;
	}
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	
	public String toString() {
		return "real:"+this.real+"\n"+"imaginary:"+this.imaginary;
	}
    
}