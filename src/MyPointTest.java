import java.util.Scanner;

public class MyPointTest {
    public static void main(String[] args)
    {
        int xVal, yVal, userInput;

        Scanner input = new Scanner(System.in);

        MyPoint point = new MyPoint();

        System.out.print("0. Quit" +
                "\n1. Move Horizontally" +
                "\n2. Move Vertically" +
                "\n3. Translate" +
                "\n4. Distance from Origin");

        userInput = input.nextInt();

        while(userInput!=0)
        {

            if(userInput==1)
            {
                System.out.print("\n\nEnter movement value for x: ");
                xVal = input.nextInt();
                point.moveHorizontally(xVal);
                System.out.print("X: " + point.getxVal() +" Y: "+ point.getyVal());
            }

            if(userInput==2)
            {
                System.out.print("\n\nEnter movement value for y: ");
                yVal = input.nextInt();
                point.moveVertically(yVal);
                System.out.print("X: " + point.getxVal() +" Y: "+ point.getyVal());
            }

            if(userInput==3)
            {
                System.out.print("\n\nEnter movement value for x: ");
                xVal = input.nextInt();
                System.out.print("\n\nEnter movement value for y: ");
                yVal = input.nextInt();
                point.translate(xVal ,yVal);
                System.out.print("X: " + point.getxVal() +" Y: "+ point.getyVal());
            }

            if(userInput==4)
            {
                point.distanceFromOrigin();
            }

            System.out.print("\n\n0. Quit" +
                    "\n1. Move Horizontally" +
                    "\n2. Move Vertically" +
                    "\n3. Translate" +
                    "\n4. Distance from Origin\n\n");

            userInput = input.nextInt();
        }

        System.out.print("Goodbye");




    }

}
