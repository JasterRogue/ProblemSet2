import java.util.Scanner;

public class FractionTest {
    public static void main(String[] args)
    {
        int numerator, denominator;

        Scanner input = new Scanner(System.in);
        Fraction fraction = new Fraction();

        System.out.print("Please enter the numerator of the first fraction");
        numerator = input.nextInt();
        fraction.setNumerator(numerator);

        System.out.print("Please enter the denominator of the first fraction");
        denominator = input.nextInt();
        fraction.setDenominator(denominator);

        System.out.print("1. Add" +"\n2. Subtract" + "\n3. Multiply" + "\n4. Division");
        int userInput = input.nextInt();

        if(userInput==1)
        {
            fraction.addFractions();
        }

        if(userInput==2)
        {

        }

        System.out.print(fraction.toString());




    }
}
