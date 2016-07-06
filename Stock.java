/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Lab:           12
 * Program:       6
 * ProgramName:   Stock
 * Purpose:       Purpose is to take to take in stock info, assign it, and return the percent change.
 * Operation:     Program takes the information from the test program, and creates the objects. Method returns percent change.
 * Input(s):      Take symbol, name, and two prices from the test program.
 * Output(s):     Output the percent change to the test program.
 * Methodology:   The program creates an object based on the exact parameters, then it has a method that will take 
 *                the stock prices and calculate the percent change.
 *                
 */  
 
public class Stock 
{
   // Variables.
   String symbol;
   String name;
   double previousClosingPrice;
   double currentPrice;
   
   // Construct an object based on each of the parameters.
   public Stock(String symbol,String name,double previousClosingPrice,double currentPrice)
   {
      // The this command assigns each varible to the one taken from the test program.
      this.symbol = symbol;
      this.name = name;
      this.previousClosingPrice = previousClosingPrice;
      this.currentPrice = currentPrice;
   }
   
   // Calculate the percent change.
   public double getChangePercent()
   {
      double change = 0;
      change = ((currentPrice - previousClosingPrice) / currentPrice) * 100;
      return change;
   }
   
}
