
import javax.swing.*;
import java.awt.Font;

public class MessageDetails {
    public static void main(String[] args)
    {
        String sender, recipient, text;

        JTextArea textArea = new JTextArea(10,50);
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textAreaFont);

        Message email = new Message();

        sender = JOptionPane.showInputDialog("Enter sender name");
        email.setSender(sender);

        recipient = JOptionPane.showInputDialog("Enter recipient name");
        email.setRecipient(recipient);

        text = JOptionPane.showInputDialog("Enter message");
        email.setText(text);

        textArea.append(email.toString());
        JOptionPane.showMessageDialog(null,textArea);


    }
}
