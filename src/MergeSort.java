/*
   Class: Merge Sort
   Author:  Roderick Vogel
        with assistance from:  people who helped (including instructor/TAs)
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
   This class sorts an array of  random objects by seperating them into single arrays
   merging them together in order and expanding to bigger and bigger
   subarrays tell they are all in order

   @author Roderick Vogel
*/
public class MergeSort
{
	Comparable[] a;//array which becomes sorted by merge sort
	Comparable[] L;//left half of array that is taken from the a[]
	Comparable[] R; //right half off array which is taken from a[]
	int p = 0; //lower bound of array
	int q; //half way through array
	int r; //upper bound of array
	Integer inf = Integer.MAX_VALUE; //set inf to infiniti to be used to compare to a number that is infinitly large
	/**
	 * This is used to check if the invariant is true for the sort method.
	 * does so by making seeing if each integer is larger then one thats next in the index if it is it returns false
	 * precondition:  an array that may be sorted
	 * post condition: if it is sorted return true else false
	 * @return boolean
	 * @param Comparable
	 * @param int i :begining of array and index
	 * @param int en : end of the array
	 */
	 private boolean elementIsSorted(Comparable A[], int i, int en)
	{
		 int begin = i;
		 int end = en;
		Comparable e[] = A;
		// loop through the array from the sort
		for( begin = 1; begin<en; begin++)
		{
			int a = begin-1;
			//compares index seeing if a is smaller then then one after it s
			if (e[a].compareTo(e[begin])>=0)
			{
				return false;
			}
		}
		return true;
	}
	 /**
	  * this array or sub array when split in half each half is sorted from smallest to largest
	  * Precondition: Have an array with (or subarray) with a beginning and end
	  * PostCondition: the sub array or array sorted from the beginning to end
	  * @param  Comparable []array from the user 
	  * @param int begin first index of the section of array being sorted
	  * @param int middle :middle of section of array being sorted
	  * @param int end :end of array being
	  * @return Comparable []array
	  */
	 public Comparable[] Merge(Comparable array[], int begin, int middle, int end)
	 {
		 int i;
		 int j;
		 int k;
		 //System.out.println(" numbsM: " + p + q + r);
		 int n1 = middle-begin+1;
		 int n2 = end-middle;
		 L = new Comparable[n1+1];
		 R = new Comparable[n2+1];
		 //System.out.println("arrayL" + Arrays.toString(L)+ n1);
		// System.out.println("arrayR" + Arrays.toString(R) + n2);
		 for(  i = 0; i<n1; i++)
		 {
			 L[i]= array[begin+i];//begin+i
			 //System.out.println("arrayL" + Arrays.toString(L));
		 }
		 for( j = 0; j<n2; j++)
		 {
			 
			 R[j]= array[middle+j+1];//middle+i
		 }
		 //System.out.println("arrayL" + Arrays.toString(L));
		 //System.out.println("arrayR" + Arrays.toString(R));
		 	L[n1]= inf;
		 	R[n2]= inf;
		 i =0;
		 j =0;
		 for( k = begin; k<=end; k++ )
		 {
			 //the invariant is that the array is sorted in order from begin to k
			 assert(elementIsSorted(L,i,n1));
			 //check to see if each side is sorted
			 assert(elementIsSorted(R,i,n2));
				if( L[i].compareTo(R[j])<=0)
				{
					array[k] = L[i];
					 //System.out.println("arraykL: " + array[k]);
					i = i +1;
				}
				else
				{
					array[k]= R[j];
					//System.out.println("arraykR: " + array[k]);
					j = j+1;
				}	
		 }
		 assert(elementIsSorted(a,begin,end));
		 //System.out.println("array: " + Arrays.toString(array));
		 return array;
	 }
	 /**
	  * Pre-condition: data is stored in an array with array.length-1 components
	  * Post condition: array has been sorted in order
	  * @param array array comes from user or merge method
	  * @param begin beginning of array or aub array
	  * @param end of subarray or array
	  * @return array sorted in order
	  */
	 public Comparable[] Sort(Comparable array[], int begin, int end)
	 {
		 if( begin< end)//used to stop recursion
		 {
			  int middle = begin+(end - begin)/2;//grabs the middle of array and set it to variable
			 //used to separate the array into single components that are sorted
			  //then merges them together and makes those sorted
			 Sort(array,begin,middle);//sort 
			 Sort(array,middle + 1,end);
			 Merge(array,begin,middle,end);
		 }
		 assert(elementIsSorted(array,begin,end)); //checks to see elements in array are sorted
		 return array;
	 }

}