public class Fraction {
	private int numerator;
	private int denominator;
	private int wholeNumber;


	public Fraction(int wholeNumber, int numerator, int denominator){
		this.wholeNumber = wholeNumber;
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public String toImproperFrac() {
		int improper = (this.wholeNumber * this.denominator) + this.numerator;
		return improper + "/" + this.denominator;

	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getWholeNumber() {
		return wholeNumber;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setWholeNumber(int wholeNumber) {
		this.wholeNumber = wholeNumber;
	}

	public void add(Fraction different) {
		if (this.denominator == different.getDenominator()) {
			this.numerator += different.getNumerator();

		}
		else {
			this.denominator *= different.getDenominator();
			this.numerator += different.getNumerator();

		}

	}

	public void subtract(Fraction different){
		if (this.denominator == different.getDenominator()) {
			this.numerator -= different.getNumerator();

		}
		else {
			this.denominator *= different.getDenominator();
			this.numerator -= different.getNumerator();

		}
	}

	public void multiply(Fraction different) {
		this.numerator *= different.getNumerator();
		this.denominator *= different.getDenominator();

	}

	public void divide(Fraction different) {
		this.numerator *= different.getDenominator();
		this.denominator *= different.getNumerator();

	}
}





