/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 25 November 2016
 *
 * Purpose: To be an exception for Invlaid Numbers(Barcodes/Ratings/costs/weights)
 * Input: error message
 * Output: error message
 */
package cs1073_assign9;

public class InvalidNumberException extends Exception{
    InvalidNumberException(String message)
    {
        super(message);
    }
}
