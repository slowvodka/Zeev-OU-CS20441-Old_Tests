public class CS_2019_A_84 {

    //Q1

    /**
     * method finds out if num is a sum of 3 to the power on n
     * @param num - int
     * @return - boolean - true if yes
     */
    public static boolean sumPower3 (int num)
    {
        if (num==0)
            return true;
        int power = 0;

        return sumPower3(num, power);

    }

    public static boolean sumPower3 (int num, int power){
        if (num==0)
            return true;
        if (num < 0)
            return false;

        return sumPower3((int) (num - Math.pow(3,power)), power+1) || sumPower3((int) (num - Math.pow(3,power+1)), power+2) ;
    }

    //Q2
    public static int average (int[] arr ){
        int max=0, index =0, rightS =0, leftS =0, temp, len = arr.length;
        for (int i = 0; i<len ; i++) {
            rightS = rightS + arr[i];
        }

        for (int i = 0; i<len-1 ; i++)
        {
            leftS = leftS + arr[i];
            rightS = rightS - arr[i];
            temp = Math.abs(leftS/(i+1) - rightS/(len-1-i));
            if (temp>max)
            {
                max = temp;
                index = i;
            }

        }
        return index;
    }

    //Q3
    /*
	i)method f returns the node of the most left node - return 5
	
	ii)method g returns the node of the most right node - returns 70
	
	iii) in general g is recursive function that returns the rightest node
	
	iv) after calling the function when num =40 secret will return true, will be printed "10,30"
	
	iv) after calling the function when num =60 secret will return false, nothing will be printed
	
	v) in general secret is a wrapper for a recursive function the finds if there are 2 numbers in the tree the sum of which is num, returns true if yes and prints them
	
	//Q4
	/*
	1.
	i - will run, a1 will be created
	ii - will be printed "abc"
	
	2.
	i - B extends A so the object will be created in the A memory section. s1 will have "def"
	ii - because of the dynamic memoty allocation the get1 method of B will be called. "def" will be printed
	iii - compilation error - A dot`t have a get2 method and the during run it will try to access the the A methods
	
	3.
	i - B object will be created under A memory. s1 = "def" , s2="jka"
	ii - will be printed  "def"
	iii - compilation error - the casting will work but A dont have get2 methods
	iv,v - will not get to those lines anyway but they are fine
	
	4.
	i - running  error - not every A is B.
	ii - will not get here
	
	5.
	i - B instance will be created in A
	ii - compilation error - since a3 regarded as A the compiler does not not it has get2 method at all
	iii - we wont get to here but there is no method get defined so compilation error
	
	6.
	i - s1 = "def", s2 = "234"
	ii - will work - b3 will point on the a4 object
	iii - since A is also B will work
	iv - "def" will be printed
	v - compillation error - A dont have a get2 method
	*/
	
	//Q5
	/*
	what - method that inverts the list, EXMP: 3->4->5->6 => 6->5->4->3
	secret - method that cuts the list in half and returns the middle of the old list. EXMP 1->2->3->4->5->6 => 4->5->6
	something - method that checks if the listt is a palindrom - EXMP 1->2->3->4->5->6 - FALSE. 1->2->3->3->2->1 - TRUE

	a. 3-6-2-7 after what will be 7-2-6-3
	b. as mentioned what inverts the list
	c. secret returns a node and it will retun the node that represents the number 2.
	d. something on 3-6-2-4-6-3 will return false
	e. since something checks if palindrom the minimal change will be to change the 2 to 4 OR the 4 to 2
	f. as mentioned the method checks if a list is a palindrome.

	*/
	
	
	
	
	


}
