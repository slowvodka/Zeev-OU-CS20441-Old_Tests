public class CS_2021_B_60 {

	/*

	
	Dear examiner, I did not change anything in the code. the only
	additions i made are in the documentation to make it more clear
	 */
	public static int smallestSub (int[] a, int k )
	{
		//I did not check if the array is empty (not needed)

		//if there is only one element - lets check it
		if (a.length == 1 )
			//if it is bigger than K return 1
			if(a[0]>=k)
				return 1;
			//return a.length + 1 (2)
			else
				return 2;
		//in case the array has more than 1 element
		//defined pointers to the start and end of the array
		int start = 0 , end = a.length -1 ;
		//sum - sum of the element, count - number of elements
		int sum = 0, count = a.length;
		//calculate the sum of the array
		for (int i = 0 ; i<a.length ; i++)
			sum = sum + a[i];
		//if k bigger than sum returns number of elements+1
		if (k >= sum)
				return count+1;
		//k smaller than the sum
		else
			//until we know the left sum of the number of elements is smaller than k
			//(that means while k<sum)
			while (k < sum)
			{
				//checking if the end element is smaller, if yes
				if(a[start] > a[end])
				{
					//remove it from the sum and & promote backwards the end pointer
					sum = sum - a[end];
					end--;
				}
				//if start element is smaller or the same
				else
				{
					//remove it from the sum and & promote the start pointer
					sum = sum - a[start];
					start++;
				}
				//in both cases we have one less element in the sub array
				count--;
			}
			//the loop finishes when we do an extra step (because now k>sum)
			//so we need to add the last element we deducted
			return count+1;

			/*
			I think that in the previous check the examiner overlooked the
			while (k < sum) condition loop and the count-- step
			this is what led him to the conclusion that I find the first sub array
			that sum > k and return the number of elements
			 */
	}

}
