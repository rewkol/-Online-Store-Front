/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 25 November 2016
 *
 * Purpose: To be an exception for invalid lengths of barcodes or user names
 * Input: error message
 * Output: error message
 */
package cs1073_assign9;

public class InvalidLengthException extends Exception{
    InvalidLengthException(String message)
    {
        super(message);
    }
}
