import java.util.Scanner;

public class BicycleTest {
    public static void main(String[] args)
    {
        String name, make;
        float value;

        Bicycle bike = new Bicycle();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = input.nextLine();
        bike.setName(name);

        System.out.print("Enter bike make");
        make = input.nextLine();
        bike.setMake(make);

        System.out.print("Enter bike value");
        value = input.nextFloat();
        bike.setValue(value);

       System.out.print( bike.toString());






    }
}
