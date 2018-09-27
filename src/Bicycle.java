public class Bicycle {

    private String name, make;
    private float value;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getMake()
    {
        return make;
    }

    public void setValue(float value)
    {
        this.value = value;
    }

    public float getValue()
    {
        return value;
    }

    public Bicycle()
    {
        this.name = "Bike Guy";
        this.make = "Typical Bike";
        this.value = 0.0f;
    }

    public Bicycle(String name, String make, float value)
    {
        this.name = name;
        this.make = make;
        this.value = value;
    }

    public String toString()
    {
        float bike2val=getValue() + 10;
        float total = bike2val + getValue();

        return "\n\nName: " + getName() +
                "\nBike 1 Value: " + getValue() +
                "\nBike 2 Value: " + bike2val +
                "\nTotal Value: " + total;
    }

}
