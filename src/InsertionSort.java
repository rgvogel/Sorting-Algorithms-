/*
   Class: Sorts

   Author:  Roderick Vogel
        with assistance from:  people who helped (including instructor/TAs)
   Creation date:  date

   Modifications:
        Date    Name    reason
        ----    ----    ------
*/

// Package declaration goes here.
// package Package_Name;

// Import statements go here.
// import java.io.*;
// import java.util.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


/**
   This class creates an array and fills it with random objects. Then it creates 
   another array and makes it equal to the first. Following 
   this it takes the original array  and sorts it. Throughout the program invarients are asserted and have been tested to be correct. 


   @author Roderick Vogel
*/
public class InsertionSort
{
	Comparable[] theArray;// This is an array to sort through
	long[] testArray;
	//Integer n = 100; //keep tract of length as n to use for measuring the time complexity.
	long resultTime; // This is a variable that subtracts the start time from the end time after the insertion sort.
	// Encapsulated instance variables and shared class variables go here.
    //used to keep tract of the random numbers
	Integer arrayLength; //make variable for arraylength

		 /**
			 * This is used to check if the invariant is true for the sort method.
			 * does so by making seeing if each integer is larger then one thats next in the index if it is it returns false
			 * precondition:  an array that may be sorted
			 * post condition: if it is sorted return true else false 
			 * @return boolean
			 * @param Comparable
			 * @param int //index of comparable array
			 */
		private boolean elementIsSortedRev(Comparable A[], int i)
		{
			int s = i;
			Comparable e[] = A;
			// loop through the array from the sort
			for( s = 0; s<e.length; s++)
			{
				int a = s-1;
				//compares index seeing if a is larger then then one after it s
				if (e[s].compareTo(e[a])>0)
				{
					return false;
				}
			}
			return true;
			}

    /** 
     * This takes an array of comparable objects and puts them in order.
     * pre-condition: has a comparable array
     * post condition: the comparable array is sorted in order
     * @ return Comparable[] this is the time it takes to run the sort loop
            @param   Comparable[] array   This is a list of comparable objects.
    */
    public Comparable[] Sort(Comparable[] array)
    {
    	theArray =array;
    	int j,i; //grabs anylist of comparable objects including integers 
    	Comparable key; // creates a variable that represents object in array that list is looking at
        //for loop that goes through the array
    	char nullObject = 'n';
    	long startTime = System.nanoTime();
    	//System.out.println("the array at first: " + theArray);
    	for (  j = 1; j < theArray.length; j++)
        		{
        			  key = theArray[j];//Key is set as the object that is found in index j
        			  i = j-1; //sets i to 1
        			  //the invariant is I :an array sorted in reverse order A[0...j+1]
        			  //consist of a single element A[0] so its true because there is only one element in the array
        			  //System.out.println(" the key: " + key);
        			  //while loop makes sure i is greater then zero and a[i] is greater then the key 
          			if (theArray[i] == null)
          			{
          				System.out.println("n stands for a null object");
          				theArray[i] =  nullObject;
          				theArray[j] =  nullObject;
          			}
        			while (i>=0 && (theArray[i].compareTo(key)> 0))
        			{
        			
        				theArray[i +1] = array[i];//This moves a[i] one to the right. 
        				//assert(elementIsSorted(theArray, i)); //Maintenance check to see if true in the loop
        				i = i-1;//This is used to check if one index below is larger then the current object in the index.
        			}
        			theArray[i+1] = key; //makes array[i+1] the current key
        		}
    	//Debug.println("post condition sorted:  " + assert(elementIsSorted(theArray, theArray.length)));//check if post condition is true
    	//of time it took to go through the for loop
    	return theArray;
    	//System.out.println("the array: " + Arrays.toString(theArray));
    }
    
  // Methods




}