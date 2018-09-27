import javax.swing.*;

public class AnimalDetails {
    public static void main(String[] args)
    {
        String type, weightString, ageString;
        String lionContinents[] = {"Africa","Asia"};
        String continents[] = new String[5];
        float weight;
        int age, i;

        Animals animal = new Animals();

        type = JOptionPane.showInputDialog("Enter animal type");
        animal.setType(type);

        for(i=0;i<continents.length;i++)
        {
            continents[i] = JOptionPane.showInputDialog("Enter continent");

            if(continents[i].equals(""))
                break;
        }

        weightString = JOptionPane.showInputDialog("Enter the weight");
        weight =Float.parseFloat(weightString);
        animal.setWeight(weight);

        ageString = JOptionPane.showInputDialog("Enter the age");
        age =Integer.parseInt(ageString);
        animal.setAge(age);

        Animals animal2 = new Animals(type,continents,weight,age);



        JOptionPane.showMessageDialog(null,animal2.toString());


    }
}
