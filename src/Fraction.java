public class Fraction {

    private int numerator;
    private int denominator;
    private int totalFraction1=0, totalFraction2=0;
    private String op="";

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public Fraction()
    {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }



    public String toString()
    {
        return "";
    }

}
