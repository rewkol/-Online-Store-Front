/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 24 November 2016
 *
 * Purpose: To store book information
 * Input: Hardcover, name, page numbers, author, markup, year
 * Output: Hardcover, name, page numbers, author, markup, year
 */
package cs1073_assign9;

public class Book extends Product{
    private boolean Hardcover;
    private String Author;
    private int NumberPages;
    private double markup;
    private int year;
    
    Book(boolean Hardcover, String Author, int NumberPages, double markup, int year,
            String title, String barcode, double cost, double weight,int stock, UserRating ... ratings)
            throws InvalidNumberException, StockBelowZeroException, InvalidLengthException
    {
        super(title,barcode, cost, weight,stock, ratings);
        this.Hardcover = Hardcover;
        this.Author = Author;
        this.NumberPages = NumberPages;
        this.markup = markup;
        this.year = year;
    }
    
    public boolean isHardcover(){return Hardcover;}//Simple Getters and Setter
    public String getAuthor(){return Author;}
    public int getNumPages(){return NumberPages;}
    public void setYear(int year)
    {
        this.year = year;
    }
    public double getMarkup(){return markup;}
    @Override
    public String toString()
    {
        return super.toString()+"\nAdditional Product Information: Hardcover: "+Hardcover+
                ", Author: "+Author+", # of Pages: "+NumberPages+", Year: "+year+
                "\nINTERNAL INFORMATION: Markup: "+pricefmt.format(markup);
    }
}
