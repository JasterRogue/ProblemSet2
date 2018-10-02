import javax.swing.*;

public class VendingMachineTest {
    public static void main(String[] args)
    {
        VendingMachine vendingMachine = new VendingMachine();

        int userInput=0, cans=0, tokens=0;
        String userInputString;

        userInputString = JOptionPane.showInputDialog("1. Insert Token" +
                "\n2.Add Cans" +
                "\n3. Check Can Count" +
                "\n4.Check Token Count" +
                "\n5. Quit");
        userInput = Integer.parseInt(userInputString);

        while(userInput!=5)
        {
            if(userInput==1)
            {

                if(vendingMachine.getCans()>0)
                {
                    JOptionPane.showMessageDialog(null, "Your drink is being dispensed. Thank you");
                    cans = vendingMachine.getCans();
                    cans -= 1;
                    vendingMachine.setCans(cans);
                    tokens = vendingMachine.getTokens();
                    tokens += 1;
                    vendingMachine.setTokens(tokens);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Sorry. There is nothing available");
                }
            }

            if(userInput==2)
            {
                cans = Integer.parseInt(JOptionPane.showInputDialog("How many cans are you adding ?"));
                vendingMachine.fillUp(cans);

            }

            if(userInput==3)
            {
                JOptionPane.showMessageDialog(null,"There are " + vendingMachine.getCans() +
                        " cans in the machine at the moment");

            }

            if(userInput==4)
            {
                JOptionPane.showMessageDialog(null,"There are " + vendingMachine.getTokens() +
                        " tokens in the machine at the moment");
            }

            userInputString = JOptionPane.showInputDialog("1. Insert Token" +
                    "\n2.Add Cans" +
                    "\n3. Check Can Count" +
                    "\n4.Check Token Count" +
                    "\n5. Quit");

            userInput = Integer.parseInt(userInputString);
        }

        JOptionPane.showMessageDialog(null,"Goodbye");

    }
}
