/* Class:         CS1301
 * Section:       8
 * Term:          Fall 2015
 * Name:          Sam Mullinix
 * Instructor:    Mr. Robert Thorsen
 * Lab:           12
 * Program:       6
 * ProgramName:   TestStock
 * Purpose:       Purpose tests the stock program with 3 differnt stocks and calculates the percent change.
 * Operation:     Program calls for the creation of 3 objects and returns the percent change.
 * Input(s):      None.
 * Output(s):     Output the percent change of each stock.
 * Methodology:   The program calls to create three onbjects with parameters to the program Stock. Then returns the percent
 *                change using the method within class Stock.
 *                
 */
 
 public class TestStock
 {
 public static void main (String[] args)
 {
 
 // Object for ORCL with parameters.
 Stock ORCL = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
 System.out.printf("Percent change for " + ORCL.name + "(" + ORCL.symbol + ")" + ":\t%.3f", ORCL.getChangePercent());
 
 // Object for MS with parameters.
 Stock MS = new Stock("MSFT", "Microsoft", 50.9, 54.3);
 System.out.printf("\nPercent change for " + MS.name + "(" + MS.symbol + ")" + ":\t\t%.3f", MS.getChangePercent());
 
 // Object for Google with parameters.
 Stock Google = new Stock("GOOG", "Google", 110.44, 180.43);
 System.out.printf("\nPercent change for " + Google.name + "(" + Google.symbol + ")" + ":\t\t%.3f", Google.getChangePercent());
 }
 }