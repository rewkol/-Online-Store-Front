/*
 * Mitchell Golding 3552573
 * CS1073 Assignment 9
 * 25 November 2016
 *
 * Purpose: To store Product information
 * Input: Title, barcode, weight, stock, rating
 * Output: barcode, cost, weight, stock, ratings, sale price, Average rating
 */
package cs1073_assign9;

import java.text.DecimalFormat;

public class Product{
    protected String title;
    protected String barcode;//Because codes can start with 0, and it isn't computed later
    protected double cost;
    protected double weight;
    protected int QuantityInStock;
    protected UserRating[] userRating;
    DecimalFormat pricefmt;
    DecimalFormat weightfmt;
    
    Product(String title, String barcode, double cost, double weight,int stock, UserRating ... ratings) 
            throws InvalidNumberException, StockBelowZeroException, InvalidLengthException
    {
        this.title = title;
        this.barcode = barcode;
        this.cost = cost;
        this.weight = weight;
        QuantityInStock = stock;
        userRating = ratings;
        pricefmt = new DecimalFormat("$#0.00");
        weightfmt = new DecimalFormat("#0.00g");
        
        //Throwing of Exceptions
        if(this.barcode.length()!=8)
            throw new InvalidLengthException("Barcodes must contain 8 digits");
        for(int i = 0;i<8;i++)//Good to use 8 because if else the previous throw will throw meaning it won't get here
        {
            if(this.barcode.substring(i,i+1).compareTo("/")<=0||this.barcode.substring(i,i+1).compareTo("/")>10)
                throw new InvalidNumberException("Barcodes must contain numbers only");
        }
        if(this.cost<0)
            throw new InvalidNumberException("Cost cannot be less than $0");
        if(this.weight<0)
            throw new InvalidNumberException("Weight cannot be less than 0g");
        if(QuantityInStock<0)
            throw new StockBelowZeroException();
    }
    
    public String getBarcode(){return barcode;}//Simple Getters
    public double getCost(){return cost;}
    public double getWeight(){return weight;}
    public int getQuantity(){return QuantityInStock;}
    
    public String getRatings()//Does a for each loop for every rating
    {
        String out = "";
        for(UserRating rating:userRating)
        {
            out += "["+rating+"]";//Appends each rating separated by [] to out
        }
        return out;//returns the ratings
    }
    
    public double getSellingPrice()//Returns the cost? But overwritten in the children I guess 
    {
        return cost;
    }
    
    public double getAvgRating()//Returns the average rating
    {
        float arating = 0; int count = 0;
        for(UserRating rating:userRating)
        {
            arating+= rating.getRating();
            count++;
        }
        return arating/count;
    }
    @Override
    public String toString()
    {
        return "Product Name: "+title+ ", UPC: "+barcode+", Cost: "+pricefmt.format(cost)+
                ", Weight: "+weightfmt.format(weight)+", # in Stock: "+QuantityInStock+
                ", Average Rating: "+getAvgRating()+"\nUSER RATINGS: "+ getRatings();
    }
}
