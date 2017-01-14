/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 24 November 2016
 *
 * Purpose: To store video game information
 * Input: genre, agerating, markup, year
 * Output: genre, agerating, markup, year
 */
package cs1073_assign9;

public class VideoGame extends Product{
    protected String genre;
    protected AgeRating ageRating;
    protected int year;
    protected double markup;
    
    VideoGame(String genre, AgeRating ageRating, int year, double markup,
            String title, String barcode, double cost, double weight,int stock, UserRating ... ratings)
            throws InvalidNumberException, StockBelowZeroException, InvalidLengthException
    {
        super(title, barcode, cost, weight,stock, ratings);
        this.genre = genre;
        this.ageRating = ageRating;
        this.year = year;
        this.markup = markup;
    }
    
    public String getGenre(){return genre;}//Simple Getters
    public AgeRating getAgeRating(){return ageRating;}
    public int getYear(){return year;}
    public double getMarkup(){return markup;}
    @Override
    public String toString()
    {
        return super.toString() + "Additional Product Information:\nGenre: "+genre+
                ", ESRB Rating: "+ ageRating+", Release Year: "+year+
                "\nINTERNAL INFORMATION: Markup: "+pricefmt.format(markup);//Don't want the customers to know how much we rip them off!
                                                    //But as a retail employee I also acknowledge the need for high markups
    }
}
