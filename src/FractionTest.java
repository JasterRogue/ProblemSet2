import java.util.Scanner;

public class FractionTest {
    public static void main(String[] args)
    {
        int numerator, denominator, d2, n2, answerNumerator, answerDenominator;

        Scanner input = new Scanner(System.in);
        Fraction fraction = new Fraction();

        System.out.print("Please enter the numerator of the first fraction");
        numerator = input.nextInt();
        fraction.setNumerator(numerator);

        System.out.print("Please enter the denominator of the first fraction");
        denominator = input.nextInt();
        fraction.setDenominator(denominator);

        System.out.print("Please enter the numerator of the second fraction");
        n2 = input.nextInt();

        System.out.print("Please enter the denominator of the second fraction");
        d2 = input.nextInt();

        System.out.print("1. Add" +"\n2. Subtract" + "\n3. Multiply" + "\n4. Division");
        int userInput = input.nextInt();

        if(userInput==1)
        {
            fraction.addFractions(numerator, denominator, n2, d2);
        }

        if(userInput==2)
        {
            fraction.subtractFractions(numerator, denominator, n2, d2);
        }

        if(userInput==3)
        {
            fraction.multiplyFractions(numerator, denominator, n2, d2);
        }

        if(userInput==4)
        {
            fraction.divideFractions(numerator, denominator, n2, d2);
        }

        //System.out.print(fraction.toString());




    }
}
