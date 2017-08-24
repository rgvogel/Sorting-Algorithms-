import java.io.*;
import java.util.Arrays;

/* Analysis of Algorithms: Insertion Sort

*
*the user puts in the array they want and type of sort they want based on the index they pick.
*the index is explained in the main
This class runs a loop which determines the size of the array. 
then an array is created for an array that is going to be in reverse. 
one that is sorted and another that is in random order. First the Array filled with  random numbers
is grabbed from the sorts class and the reverse one is also grabbed from the sorts class. 
The array is sorted 20 times and an average is calculated for its speed.  this is done for both the sorted and 
reverse array

*  


*  Created: 

*     [1/24/16], [Roderick Vogel]


*
*  @author Roderick Vogel  [with assistance from]
*/
public class Timer {
	MyArray arrays = new MyArray();
	InsertionSort iS = new InsertionSort();
	//create files to store times 
	//different sorts that can be used
	SelectionSort sS = new SelectionSort();
	HeapSort hS = new HeapSort();
	MergeSort mS = new MergeSort();
	long startTime;//time sort started
	long endTime;//time sort ended
	long resultTime; //time sort ran
	// the average time it took to go through the sort method for an array
	// of:
	
	long avgTimeRand = 0; // random integers
	long avgTimeSort = 0;// sorted integers
	long avgTimeRev = 0;  // and integers sorted in reverse
public void run(int aSort, int type) 
{
		
	for (Integer n = 0; n < 500000;n = n +20000) 
	{
		Comparable[] thearraySort = arrays.SortedArray(n); // array that well be sorted (best case)
		Comparable[] thearrayRand = arrays.RandomArray(n); // array in random														// order
																// (average
																// case)
		Comparable[] thearrayRev = arrays.ReverseArray(n); // array
																				// in
																				// reverse
																				// order	

		long s = 20; // grab array length and store it in a long to be used to
					// calculate time
		long rTime; // the time it takes to go through the sort method
		long p = 1;
		
		long totalTime = 0;
		// the following loops are used to repeat the sort method for the
		// specified array
		// after every loop the time it took is added to the total time
		// at the end we collect the total time and divide it by the amount
		// of times we ran the method
		// loop for the array filled with random #'s
		if( aSort==0)
		{
			//array input is random
				//based on number picked for type will choose type of sort for this case
				if( type ==0)
				{
					//insertion sort random
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						iS.Sort(thearraySort);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearrayRand = arrays.RandomArray(n);
						totalTime = rTime + totalTime;// time sort ran plus the previous
						// times it ran in the loop
						avgTimeRand= ((totalTime) / (s + p));
					}
					System.out.println(avgTimeRand);// average time taken by
					// dividing the total time
					// by the amount of times
					// sort ran	
				}
				//selection Sort random
				else if( type == 1)
				{
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						sS.Sort(thearraySort);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearrayRand = arrays.RandomArray(n);
						totalTime = rTime + totalTime;// time sort ran plus the previous
						// times it ran in the loop
						
						avgTimeRand= ((totalTime) / (s + p));
					}
					 System.out.println(avgTimeRand);// average time taken by
						// dividing the total time
						// by the amount of times
						// sort ran	
				}
				//heap sort random
				else if( type ==2)
				{
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						hS.Sort(thearrayRand);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearrayRand = arrays.RandomArray(n);
						totalTime = rTime + totalTime;// time sort ran plus the previous
						// times it ran in the loop
						avgTimeRand= ((totalTime) / (s + p));
					}
					 System.out.println(avgTimeRand);// average time taken by
						// dividing the total time
						// by the amount of times
						// sort ran	
			}

				else
				{	//merge sort random
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						mS.Sort(thearrayRand,0, thearrayRand.length-1);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearrayRand = arrays.RandomArray(n);
						totalTime = rTime + totalTime;// time sort ran plus the previous
						// times it ran in the loop
						}
						avgTimeRand= ((totalTime) / (s + p));
				}
				System.out.println(avgTimeRand);// average time taken by
				// dividing the total time
				// by the amount of times
				// sort ran		
		}

		else if (aSort==1)
		{
			// loop for the array with numbers sorted
				//based on number picked for type will choose type of sort for this case
				if( type ==0)
				{//insertion sort sorted
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						iS.Sort(thearraySort);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearraySort = arrays.SortedArray(n);
						totalTime = rTime + totalTime;
					}
					avgTimeSort = ((totalTime) / (s + p));
					 System.out.println(avgTimeSort);
				}
				else if( type == 1)
				{//selection sort sorted
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						sS.Sort(thearraySort);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearraySort = arrays.SortedArray(n);
						totalTime = rTime + totalTime;
					}
					avgTimeSort = ((totalTime) / (s + p));
					 System.out.println(avgTimeSort);
				}
				else if( type ==2)
				{//heap sort sorted
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						hS.Sort(thearraySort);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearraySort = arrays.SortedArray(n);
						totalTime = rTime + totalTime;
					}
					avgTimeSort = ((totalTime) / (s + p));
					 System.out.println(avgTimeSort);
				}
				else
				{	//merge sort sorted
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						mS.Sort(thearraySort,0, thearraySort.length-1);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearraySort = arrays.SortedArray(n);
						totalTime = rTime + totalTime;
					}
					avgTimeSort = ((totalTime) / (s + p));
					 System.out.println(avgTimeSort);
			}	
		}

		else
		{
			// the loop with the numbers in reverse order
				//based on number picked for type will choose type of sort for this case
				if( type ==0)
				{//insertion sort reverse
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						iS.Sort(thearrayRev);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearrayRev = arrays.ReverseArray(n);
						totalTime = rTime + totalTime;
					}
					avgTimeRev = ((totalTime) / (s + p));
					 System.out.println(avgTimeRev);
				}
				else if( type == 1)
				{//selection sort reverse
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						sS.Sort(thearrayRev);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearrayRev = arrays.ReverseArray(n);
						totalTime = rTime + totalTime;
					}
					avgTimeRev = ((totalTime) / (s + p));
					 System.out.println(avgTimeRev);
				}
				else if( type ==2)
				{//heap sort reverse
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						hS.Sort(thearrayRev);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearrayRev = arrays.ReverseArray(n);
						totalTime = rTime + totalTime;
					}
					avgTimeRev = ((totalTime) / (s + p));
					 System.out.println(avgTimeRev);
				}
				else
				{	//merge sort reverse 
					for (int i = 0; i <= 20; i++)
					{
						startTime= System.nanoTime();
						mS.Sort(thearrayRev,0, thearrayRev.length-1);
						endTime= System.nanoTime();
						//keep track of time
						rTime = endTime - startTime;
						thearrayRev = arrays.ReverseArray(n);
						totalTime = rTime + totalTime;
					}
					avgTimeRev = ((totalTime) / (s + p));
					 System.out.println(avgTimeRev);
				}

			}
		} 
		 
	}
}
	
	//close files



