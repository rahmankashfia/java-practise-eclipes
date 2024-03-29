import java.util.Arrays;

public class MaximumSumSubarray {
	static int passCountGlobal = 1;
	// Find the maximum possible sum in arr[]  
    // such that arr[m] is part of it 
    static int maxCrossingSum(int arr[], int l, 
                                int m, int h) 
    { 
        // Include elements on left of mid. 
        int sum = 0; 
        int left_sum = Integer.MIN_VALUE; 
        for (int i = m; i >= l; i--) 
        { 
            sum = sum + arr[i]; 
            if (sum > left_sum) 
            left_sum = sum; 
        } 
        System.out.println("left sum : " +  left_sum);
        // Include elements on right of mid 
        sum = 0; 
        int right_sum = Integer.MIN_VALUE; 
        for (int i = m + 1; i <= h; i++) 
        { 
            sum = sum + arr[i]; 
            if (sum > right_sum) 
            right_sum = sum; 
        } 
        System.out.println("right sum : " +  right_sum);
        // Return sum of elements on left 
        // and right of mid 
        return left_sum + right_sum; 
    } 
	
    // Returns sum of maxium sum subarray  
    // in aa[l..h] 
    static int maxSubArraySum(int arr[], int l,  
                                      int h) 
    { 
    // Base Case: Only one element 
    	if (l == h) 
    		return arr[l]; 
  
    	// Find middle point 
    	int m = (l + h)/2; 
    	int passCount = passCountGlobal++;
    	/* Return maximum of following three  
    	possible cases: 
    	a) Maximum subarray sum in left half 
    	b) Maximum subarray sum in right half 
    	c) Maximum subarray sum such that the  
    	subarray crosses the midpoint */
    	System.out.println(passCount + " pass : " + Arrays.toString(arr));
    	System.out.println(passCount + " pass (left): " + "l : " + l + " h(m) : " + m);
    	int i1 = maxSubArraySum(arr, l, m);
    	System.out.println(passCount + " pass : " + "i1 : " + i1);
    	System.out.println(passCount + " pass (right): " + "l (m+1) : " + (m+1) + " h : " + h);
    	int i2 = maxSubArraySum(arr, m+1, h);
    	System.out.println(passCount + " pass : " + "i2 : " + i2);
    	System.out.println(passCount + " pass (crossing) : " + "l : " + l + " m : " + m + " h : " + h);
    	int i3 = maxCrossingSum(arr, l, m, h);
    	System.out.println(passCount + " pass: " + "i3 : " + i3);
    	int r = Math.max(i1, Math.max(i2, i3));
    	return r;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
	    int n = arr.length; 
	    int max_sum = maxSubArraySum(arr, 0, n-1); 
	      
	    System.out.println("Maximum contiguous sum is "+ 
	                                         max_sum);

	}

}
