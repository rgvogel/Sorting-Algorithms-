/*
   Class: Selection Sort
   Author:  Roderick Vogel
        with assistance from:  Code based on code from Wikipedia
   Creation date:  02/08/16

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
   This class sorts an array of  random objects by first building a max heap and then sorting it
   through max heapifying each index of the array starting at the end of the array.


   @author Roderick Vogel
*/
public class SelectionSort
{
	Comparable[] a;//array which becomes sorted by merge sort
	int p = 0; //lower bound of array
	//Comparable smallest = double.Infiniti; //smallest 
	int r; //upper bound of array
	/**
	 * This is used to check if the invariant is true for the sort method.
	 * does so by making seeing if each integer is larger then one thats next in the index if it is it returns false
	 * precondition:  an array that may be sorted
	 * post condition: if it is sorted return true else false
	 * @return boolean
	 * @param Comparable
	 * @param int //index of comparable array
	 */
	 private boolean elementIsSorted(Comparable A[], int i)
	{
		 int s = i;
		Comparable e[] = A;
		// loop through the array from the sort
		for( s = 1; s<e.length; s++)
		{
			int a = s-1;
			//compares index seeing if a is smaller then then one after it s
			if (e[a].compareTo(e[s])>0)
			{
				return false;
			}
		}
		return true;
	}
	 /**
	  * pre-condition: has a comparable array
      *	 post condition: the comparable array is sorted in order
	  * 
	  * @param Comparable[] array
	  * @return Comparable[] array
	  */
	public Comparable[]  Sort(Comparable array[])
	{
		a = array;
		//The invariant for the sort method is the array is sorted from 0 to i. 
		for( int i = 0; i<a.length -1; i++)
		{
			int jMin = i;
			for( int j= i +1; j< a.length;j++)
			{
				if(a[j].compareTo(a[jMin])<0)
				{
					jMin = j;
				}
			}
			if (jMin != i)
			{
				Comparable temp = a[jMin];
				a[jMin]=a[i];
				a[i] =temp;
			}
			assert(elementIsSorted(a, i));//check to see if sorted from the start to i
		}
		assert(elementIsSorted(a,a.length)); //check to see if array is sorted
		return a;
	}
}
