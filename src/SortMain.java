import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.io.*;
import java.lang.reflect.Array;
// Import statements go here.  For example,
// import java.awt.Color;
// import java.util.ArrayList;
// import java.util.Random;

/* Analysis of Algorithms: Insertion Sort

 *
This class simply creates a timer variable and runs the class
 *  


 *  Created: 

 *     [1/24/16], [Roderick Vogel]

 *     With assistance from:  [people who helped (Liam Lundy, Raphael Wieland)]
 *     I had issues figuring out how to time my insertion sort and they helped



 *
 *  @author Roderick Vogel  [with assistance from]
 */
public class SortMain {
	/**
	 * The main function initiates execution of this program.
	 * 
	 * @param String
	 *            [] args not used in this program
	 * @throws IOException 
	 **/
	public static void main(String[] args) throws IOException {

		// the first number in rum method is the organization of the array: 0 = array in random order,
		//1= sorted array, 2= array sorted in reverse
		// the second number is the type of sort method: 0 = insertion sort 1= selection sort
		// 2 = heap sort and 3 = merge sort
		Timer timer = new Timer();
		timer.run(1,3);

	}
}// end class

