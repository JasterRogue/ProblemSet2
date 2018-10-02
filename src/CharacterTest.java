import javax.swing.*;

public class CharacterTest {
    public static void main(String[] args)
    {
        String name, hpString, mpString, strString, defString, ability;
        int hp, mp, strength, defence;

        Character create = new Character();

        name = JOptionPane.showInputDialog("Enter character name");
        create.setName(name);

        hpString = JOptionPane.showInputDialog("Enter max health");
        hp = Integer.parseInt(hpString);
        create.setHp(hp);

        mpString = JOptionPane.showInputDialog("Enter max mp");
        mp = Integer.parseInt(mpString);
        create.setMp(mp);

        strString = JOptionPane.showInputDialog("Enter strength");
        strength = Integer.parseInt(strString);
        create.setStrength(strength);

        defString = JOptionPane.showInputDialog("Enter defence");
        defence = Integer.parseInt(defString);
        create.setDefence(defence);

        ability = JOptionPane.showInputDialog("Enter character ability");
        create.setAbility(ability);

        JOptionPane.showMessageDialog(null,create.toString(),
                "Character Stats", JOptionPane.INFORMATION_MESSAGE);
    }
}
