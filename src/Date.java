import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    public static void main(String[] args)
    {
        GregorianCalendar borrowDate, returnDate;

        int day, month, year;
        int val1, val2;

        day = Integer.parseInt(JOptionPane.showInputDialog("Enter the borrow date"));
        month = Integer.parseInt(JOptionPane.showInputDialog("Enter the borrow month"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter the borrow year"));

        borrowDate = new GregorianCalendar(year, month, day);

        day = Integer.parseInt(JOptionPane.showInputDialog("Enter the return date"));
        month = Integer.parseInt(JOptionPane.showInputDialog("Enter the return month"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter the return year"));

        returnDate = new GregorianCalendar(year, month, day);

        val1 = returnDate.get(GregorianCalendar.DAY_OF_YEAR);
        val2 = borrowDate.get(GregorianCalendar.DAY_OF_YEAR);
        int val3 = val1- val2;

        JOptionPane.showMessageDialog(null,"The number of days you kept the book are " +
        val3);






    }
}
