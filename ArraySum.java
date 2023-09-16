
public class ArraySum {

	public int sumOfArray (Integer[] a,int index) {
		
	      // Base case
        if (index < 0) {
            return 0;
        }

        // Recursive case
        return a[index] + sumOfArray(a, index - 1);
    
	}
}
