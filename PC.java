/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 24 November 2016
 *
 * Purpose: Extends the videogame class for PC games
 * Input: System requirements and if it is a physical purchase
 * Output: System requirements and if it is a physical purchase
 */
package cs1073_assign9;

public class PC extends VideoGame {
    private String SystemRequirements;
    private boolean isPhysicalMedia;
    
    PC(String require, boolean physical, String genre, AgeRating ageRating, int year, double markup,
            String title, String barcode, double cost, double weight,int stock, UserRating ... ratings)
            throws InvalidNumberException, StockBelowZeroException, InvalidLengthException
    {
        super(genre,ageRating,year, markup,title, barcode, cost, weight,stock, ratings);
        SystemRequirements = require;
        isPhysicalMedia = physical;
    }
    @Override
    public String toString()
    {
        return super.toString() + "\nFurther Information: Physical Copy: "+isPhysicalMedia+
                ", System Requirements: "+SystemRequirements;
    }
}
