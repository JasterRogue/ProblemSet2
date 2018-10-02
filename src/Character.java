public class Character {

    private String name;
    private int hp;
    private int mp;
    private int strength;
    private int defence;
    private String ability;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getHp()
    {
        return hp;
    }

    public void setMp(int mp)
    {
        this.mp = mp;
    }

    public int getMp()
    {
        return mp;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setDefence(int defence)
    {
        this.defence = defence;
    }

    public int getDefence()
    {
        return defence;
    }

    public void setAbility(String ability)
    {
        this.ability = ability;
    }

    public String getAbility()
    {
        return ability;
    }

    public String toString()
    {
        return "\nName: " + getName() +
                "\nHP: " + getHp() +
                "\nMP: " + getMp() +
                "\nStrength: " + getStrength() +
                "\nDefence: " + getDefence() +
                "\nAbility: " + getAbility();
    }





}
