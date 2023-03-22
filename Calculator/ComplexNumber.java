package Calculator;

public class ComplexNumber {
    private double real;
    private double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber sumComplexNumber(ComplexNumber cn) {
        double real = this.real + cn.real;
        double imag = this.imag + cn.imag;
        return new ComplexNumber(real, imag);
    }

    public ComplexNumber differenceComplexNumber(ComplexNumber cn) {
        double real = this.real - cn.real;
        double imag = this.imag - cn.imag;
        return new ComplexNumber(real, imag);
    }

    public ComplexNumber multiplycatiComplexNumber(ComplexNumber cn) {
        double real = this.real * cn.real - this.imag * cn.imag;
        double imag = this.real * cn.imag + this.imag * cn.real;
        return new ComplexNumber(real, imag);
    }

    public ComplexNumber divisionComplexNumber(ComplexNumber cn) {
        double denominator = cn.real * cn.real + cn.imag * cn.imag;
        double real = (this.real * cn.real + this.imag * cn.imag) / denominator;
        double imag = (this.imag * cn.real - this.real * cn.imag) / denominator;
        return new ComplexNumber(real, imag);
    }

    public double modulusComplexNumber() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argumentComplexNumber() {
        return Math.atan2(imag, real);
    }

    @Override
    public String toString() {
        return real + "+" + imag + "i";
    }
}
