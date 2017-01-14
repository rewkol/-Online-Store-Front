/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 25 November 2016
 *
 * Purpose: To be an exception for stock below zero
 * Input: error message
 * Output: error message
 */
package cs1073_assign9;

public class StockBelowZeroException extends Exception {
    StockBelowZeroException()//Pointlessly special and Not InvalidNumber because it sounds cool.
    {                       //Say it with me, "Stock Below Zero Exception." Exceptional, isn't it!
        super("Stock value cannot be below 0");
    }
}
