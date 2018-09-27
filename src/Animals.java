public class Animals {

    private String type;
    private String continents[];
    private float weight;
    private int age;

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public void setContinents(String continents[])
    {
        this.continents = continents;
    }

    public String[] getContinents()
    {
        return continents;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public float getWeight()
    {
        return weight;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public Animals()
    {
        this.type = "No type specified";
        this.continents = null;
        this.weight = 0.0f;
        this.age = 0;
    }

    public Animals(String type, String continents[], float weight, int age)
    {
        this.type = type;
        this.continents = continents;
        this.weight = weight;
        this.age = age;
    }

    public String toString()
    {
        String conts = "";

        if(continents==null)
            conts = "No continents specified";
        else
            for(int i=0;i<continents.length;i++)
        {
            conts += continents[i] + " ";


            if(continents[i].equals(""))
               break;
        }

        return "Type: " + getType() +
                "\nContinents: " + conts +
                "\nWeight: " + getWeight() +
                "\nAge: " + getAge();
    }
}
