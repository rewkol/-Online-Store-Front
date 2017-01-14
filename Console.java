/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 24 November 2016
 *
 * Purpose: To extend the Videogame class for console games
 * Input: type(AKA which console)
 * Output: type
 */
package cs1073_assign9;

public class Console extends VideoGame {
    private Type type;
    
    Console(Type type, String genre, AgeRating ageRating, int year, double markup,
            String title, String barcode, double cost, double weight,int stock, UserRating ... ratings)
            throws InvalidNumberException, StockBelowZeroException, InvalidLengthException
    {
        super(genre,ageRating,year, markup,title, barcode, cost, weight,stock, ratings);
        this.type = type;
    }
    @Override
    public String toString()
    {
        return super.toString()+"Further Information: System: "+type;
    }
}
