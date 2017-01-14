/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 24 November 2016
 *
 * Purpose: To allow a user rating for products
 * Input: user's name, rating and comments
 * Output: user's name, rating and comments
 */
package cs1073_assign9;
import java.text.DecimalFormat;
public class UserRating {
    private String user;
    private double rating;
    private String comment;
    DecimalFormat ratefmt = new DecimalFormat("0.00");
    
    UserRating(String user, double rating, String comment)
            throws InvalidLengthException, InvalidNumberException
    {
        this.user = user;
        this.rating = rating;
        this.comment = comment;
        
        //Throwing Exceptions!
        if(this.user.length()<5||this.user.length()>12)
            throw new InvalidLengthException("Usernames must be between 5 and 12 characters");
        if(this.rating<0||this.rating>5)
            throw new InvalidNumberException("Ratings must be between 0 and 5");
    }
    
    public double getRating(){return rating;}
    public String getUser(){return user;}
    public String getComment(){return comment;}
    @Override
    public String toString()
    {
        return "Username: "+user+", Rating: "+ratefmt.format(rating)+ ", Comment: "+comment;
    }
}
