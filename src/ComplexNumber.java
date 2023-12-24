public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(int real, int imaginary) {
        this.real = (double) real;
        this.imaginary = (double) imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        return new ComplexNumber(realSum, imaginarySum);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double realDifference = this.real - other.real;
        double imaginaryDifference = this.imaginary - other.imaginary;
        return new ComplexNumber(realDifference, imaginaryDifference);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realProduct = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryProduct = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realProduct, imaginaryProduct);
    }

    public boolean equals(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }
}