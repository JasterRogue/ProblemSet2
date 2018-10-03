public class Fraction {

    private int numerator;
    private int denominator;
    private int totalFraction1=0, totalFraction2=0;
    private String op="";
    private int nA, dA;

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

    public void addFractions(int numerator, int denominator, int n2, int d2)
    {
        int lowestCommonDenominator;

        lowestCommonDenominator = denominator * d2;

        nA = numerator + n2;

        System.out.print(numerator+"/"+denominator + " + " + n2+"/"+d2 + " is " + nA + "/" + lowestCommonDenominator);


    }

    public void subtractFractions(int numerator, int denominator, int n2, int d2)
    {
        int lowestCommonDenominator;

        lowestCommonDenominator = denominator * d2;

        nA = numerator - n2;

        System.out.print(numerator+"/"+denominator + " + " + n2+"/"+d2 + " is " + nA + "/" + lowestCommonDenominator);


    }

    public void multiplyFractions(int numerator, int denominator, int n2, int d2)
    {
       // int lowestCommonDenominator;

       // lowestCommonDenominator = denominator * d2;

        nA = numerator * n2;
        dA = denominator * d2;

        System.out.print(numerator+"/"+denominator + " + " + n2+"/"+d2 + " is " + nA + "/" + d2);


    }

    public void divideFractions(int numerator, int denominator, int n2, int d2)
    {
        // int lowestCommonDenominator;

        // lowestCommonDenominator = denominator * d2;

        int holder;
        holder = d2;
        d2 = n2;
        n2 = holder;

        nA = numerator * n2;
        dA = denominator * d2;

        System.out.print(numerator+"/"+denominator + " + " + n2+"/"+d2 + " is " + nA + "/" + d2);


    }

}
