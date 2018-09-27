import javax.swing.*;
import java.awt.Font;

public class BookDetails {
    public static void main(String[] args)
    {
        String title, isbn, numberOfPagesString, priceString;
        float price;
        int numberOfPages;
        boolean valid;

        JTextArea textArea = new JTextArea(15,28);
        Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(textAreaFont);

        Book favouriteBook = new Book();

        Book leastFavouriteBook = new Book();

        //Favourite book details entered
        textArea.append("Favourite Book Details");

        title = JOptionPane.showInputDialog("Enter favourite book name");
        favouriteBook.setTitle(title);


        priceString  = JOptionPane.showInputDialog("Enter book price");
        price = Float.parseFloat(priceString);

        valid = false;

        while(!valid)
        {
            if(price>=1)
            {
                valid=true;
            }
            else
            {
                priceString  = JOptionPane.showInputDialog("Invalid! Enter book price");
                price = Float.parseFloat(priceString);
            }

        }

        favouriteBook.setPrice(price);

        isbn = JOptionPane.showInputDialog("Enter book ISBN");
        favouriteBook.setISBN(isbn);

        numberOfPagesString  = JOptionPane.showInputDialog("Enter number of pages");
        numberOfPages = Integer.parseInt(numberOfPagesString);
        favouriteBook.setNumberOfPages(numberOfPages);

        textArea.append(favouriteBook.toString());

        //Least favourite book details entered
        textArea.append("\nLeast favourite book details");

        title = JOptionPane.showInputDialog("Enter least favourite book name");
        leastFavouriteBook.setTitle(title);

        priceString  = JOptionPane.showInputDialog("Enter book price");
        price = Float.parseFloat(priceString);

        valid = false;

        while(!valid)
        {
            if(price>=1)
            {
                valid=true;
            }
            else
            {
                priceString  = JOptionPane.showInputDialog("Invalid! Enter book price");
                price = Float.parseFloat(priceString);
            }

        }

        leastFavouriteBook.setPrice(price);

        isbn = JOptionPane.showInputDialog("Enter book ISBN");
        leastFavouriteBook.setISBN(isbn);

        numberOfPagesString  = JOptionPane.showInputDialog("Enter number of pages");
        numberOfPages = Integer.parseInt(numberOfPagesString);
        leastFavouriteBook.setNumberOfPages(numberOfPages);

        textArea.append(leastFavouriteBook.toString());

        JOptionPane.showMessageDialog(null,textArea);



    }
}
