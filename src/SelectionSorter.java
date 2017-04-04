/**
The sort method of this class sorts an array, using the selection 
sort algorithm.
 */
public class SelectionSorter
{
    /**
    Sorts an array, using selection sort.
    @param a the array to sort
     */
    public static void sort(int[] a)
    {  
        // to do.  add you selection sort here
    	for(int i = 0; i < a.length; i++)
    		ArrayUtil.swap(a, i, getSmallestIndex(a, i));
    }
    
    public static int getSmallestIndex(int[] a, int startingIndex)
    {
    	int smallestIndex = startingIndex;
    	for(int i = startingIndex + 1; i<a.length; i++)
    	{
    		if(a[smallestIndex]>a[i])
    			smallestIndex = i;
    	}
    	return smallestIndex;
    }
}

