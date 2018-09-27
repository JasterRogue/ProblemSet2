import java.util.Scanner;

public class MyPoint {

    private int xVal, yVal;

    Scanner input = new Scanner(System.in);

    public void setxVal(int xVal)
    {
        this.xVal = xVal;
    }

    public int getxVal()
    {
        return xVal;
    }

    public void setyVal(int yVal)
    {
        this.yVal = yVal;
    }

    public int getyVal()
    {
        return yVal;
    }

    public MyPoint()
    {
        this.xVal = 0;
        this.yVal = 0;
    }

    public MyPoint(int xVal, int yVal)
    {
        this.xVal = xVal;
        this.yVal = yVal;
    }

    public void moveHorizontally(int dX)
    {
        //System.out.print("\n\nEnter movement value for x: ");
        xVal = dX + xVal;

       // System.out.print("X: " + xVal +" Y: "+ yVal);
    }

    public void moveVertically(int dY)
    {
        //System.out.print("\n\nEnter movement value for y: ");
        yVal = dY + yVal;

        //System.out.print("X: " + xVal +" Y: "+ yVal);
    }

    public void translate(int dX, int dY)
    {
       // System.out.print("\n\nEnter movement value for x: ");
        xVal = dX + xVal;

       // System.out.print("\n\nEnter movement value for y: ");
        yVal = dY + yVal;

        //System.out.print("X: " + xVal +" Y: "+ yVal);
    }

    public void distanceFromOrigin()
    {
        double distance;

        distance = Math.pow(xVal,2) + Math.pow((double)yVal,2);

        Math.sqrt(distance);

        System.out.print("Distance from origin is: " + (int)distance);
    }

}
