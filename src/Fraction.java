import java.util.Scanner;
public class Fraction {
	private int numerator;
	private int denominator;
	private int wholeNumber;


	public Fraction(String fraction){
		Scanner fractionScanner = new Scanner(fraction);
		if (fraction.contains("_")){
			fractionScanner.useDelimiter("_");
			this.wholeNumber = Integer.parseInt(fractionScanner.next());
		}
		fractionScanner.useDelimiter("/");
		this.numerator = Integer.parseInt(fractionScanner.next());
		this.denominator = Integer.parseInt(fractionScanner.next());
	}

	public Fraction() {

	}

	public void toImproper() {
		if (this.wholeNumber != 0) {
			this.numerator = (this.wholeNumber * this.denominator) + this.numerator;
			this.wholeNumber = 0;
		}
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
		if (this.denominator != different.getDenominator()) {
			this.denominator *= different.getDenominator();
		}
		this.numerator += different.getNumerator();
	}

	public void subtract(Fraction different){
		if (this.denominator != different.getDenominator()) {
			this.denominator *= different.getDenominator();

		}
		this.numerator -= different.getNumerator();
	}

	public void multiply(Fraction different) {
		this.numerator *= different.getNumerator();
		this.denominator *= different.getDenominator();

	}

	public void divide(Fraction different) {
		this.numerator *= different.getDenominator();
		this.denominator *= different.getNumerator();

	}

	public String toAnswer(){
		return this.numerator + "/" + this.denominator;
	}

	public String toString(){
		return "whole:" + this.wholeNumber + " numerator:" + this.numerator + " denominator:" + this.denominator;
	}
}





