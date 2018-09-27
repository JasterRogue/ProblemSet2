import javax.swing.*;

public class Book {

    private String title;
    private float price;
    private String isbn;
    private int numberOfPages;

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setPrice(float price)
    {

        this.price = price;
    }

    public float getPrice()
    {
        return price;
    }

    public void setISBN(String ISBN)
    {
        this.isbn = ISBN;
    }

    public String getISBN()
    {
        return isbn;
    }

    public void setNumberOfPages(int numberOfPages)
    {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages()
    {
        return numberOfPages;
    }

    public Book()
    {
        this.title="No title";
        this.price=0.00f;
        this.isbn="No ISBN";
        this.numberOfPages=0;
    }

    public Book(String title,float price, String ISBN, int numberOfPages)
    {
        this.title=title;
        this.price=price;
        this.isbn=ISBN;
        this.numberOfPages=numberOfPages;
    }

    public String toString()
    {
        return "\nTitle: " + getTitle() +
                "\nPrice: " + getPrice() +
                "\nISBN: " + getISBN() +
                "\nNumber of Pages: " + getNumberOfPages() + "\n";
    }

}
