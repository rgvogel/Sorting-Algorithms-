import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

// Import statements go here.  For example,
// import java.awt.Color;
// import java.util.ArrayList;
// import java.util.Random;

/**
 this is meant to give abunch of different type of arrays that then can be sorted
 *Created
 *2/10/16 by Roderick Vogel
 *
 *  @author Roderick Vogel

 */
public class MyArray
{
	/**
	 * This is used to check if the invariant is true for the fillArray method.
	 * does so by filling making sure there is a number at every spot in the array
	 * @return boolean
	 * @param Comparable
	 * @param int //index of comparable array
	 */
	 private boolean elementHaveValues(Comparable A[], int i)
	{
		 int s = i;
		 Comparable e[] = A;
		for( s = 0; s<e.length; s++)
		{
			if (e[s]== null)
			{
				return false;
			}
		}
		return true;
	}
  // State: instance variables and shared class variables go here.
    private int x;                // example instance variable

  // Constructors

    /**
     * Creates an array of sorted integers
     *      @param   initialValue    initial value for the object's state
     *		@return  Comparable[] array
     */
    public Comparable[] SortedArray( Integer arrayLength)
    {
    	Comparable[] sArray = new Comparable[arrayLength];
    	for( Integer i = 0; i< arrayLength; i++ )
    	{
    		sArray[i] =i+1;
    	}
    	return sArray;
    }

    /**
     * Creates an array of sorted integers
     *      @param   initialValue    initial value for the object's state
     */
    public Comparable[] RandomArray( Integer arrayLength)
    {
    	Comparable[] randArray = new Comparable[arrayLength];
    	for( Integer i = 0; i<arrayLength; i++ )
    	{
    		randArray[i] =i+1;
    	}
    	Collections.shuffle(Arrays.asList(randArray));
    	return randArray;
    }
    
    /**
     * Creates an array integers sorted in reverse
     *      @param   initialValue    initial value for the object's state
     */
    public Comparable[] ReverseArray( Integer arrayLength)
    {
    	Comparable[] rArray = new Comparable[arrayLength];
    	for( Integer i = 0; i< arrayLength; i++ )
    	{
    		rArray[i] =arrayLength-i;
    	}
    	return rArray;
    }
    /**
     * Creates an array of characters
     *      @param   initialValue    initial value for the object's state
     */
    public Comparable[] CharArray( Integer arrayLength)
    {
		char b = 'b';
		char c = 'c';
		char d = 'd';
    	Comparable[] charArray = new Comparable[arrayLength];
    	for( Integer i = 0; i< arrayLength; i++ )
    	{
    		if( i<= 5)
			{
    			charArray[i] =  c;
			}
			else if( i<= 10)
			{
				charArray[i] =  b;
			}
			else
			{
				charArray[i] =  d;
			}
    	}
    	return charArray;
    }
    /**
     * Creates an array of sorted integers
     *      @param   initialValue    initial value for the object's state
     */
    public Comparable[] StringArray( Integer arrayLength)
    {
		String pi = "pi";
		String bat = "bat";
		String love = "love";
    	Comparable[] strArray = new Comparable[arrayLength];
    	for( Integer i = 0; i< arrayLength; i++ )
    	{
    		if(i<=5)
    		{
    			strArray[i] =  love;
			}
			else if( i<= 10)
			{
				strArray[i] =  bat;
			}
			else
			{
				strArray[i] =  pi;
			}
    	}
    	return strArray;
    }
  }