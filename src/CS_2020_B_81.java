public class CS_2020_B_81 {
    //Q1


    public static int makeSum (int[] lengths, int k , int num)
    {

        System.out.println("not complete");

        if (lengths.length<1)
            return 0;
        return  makeSum(lengths,k,num, 0);
    }
    public static int makeSum (int [] lengths, int k, int num, int i)
    {
        if (k < 0 || num <= 0 || lengths.length == i)
            return 0;
        if (num == lengths[i] && k >= 0 )
            return 1;


        return makeSum(lengths,k-1,num-lengths[i], i) + makeSum(lengths,k,num, i+1);

    }

    //Q2

    public static void minimumSubK (int[] arr, int k)
    {
        int len = arr.length;
        if (len ==k)
        {
            System.out.println("Minimum dum sub-array is(0," + (len-1) + ")");
        }
        int sumsub = 0, index = k-1, minsum;
        for (int i = 0; i<k; i++)
        {
            sumsub = sumsub + arr[i];
        }
        minsum = sumsub;
        for (int i =k; i < len ; i++)
        {
            sumsub = sumsub + arr[i] - arr[i-k];
            if (sumsub < minsum)
            {
                minsum = sumsub;
                index = i;
            }
        }
        System.out.println("Minimum dum sub-array is(" + (index-k+1) + "," + index + ")");
    }

    //Q3
    /*
    a. false
    b. remove 40
    c. the method checks if therre are two trees with a difference greater than 1
    if yes returns false
     */
    //Q4
    /*
    first one
    first two
    first copytwo
    first empty 4

    second
    first copyone
    first copytwo

    second
    first copyempty 4
    first two

    6
    first one
    first two
    second
    first copyone
    first copytwo
    second
    first copyempty 4
    first two

    7
    first five
    first two
    second
    first copyone
    first copytwo
    second
    first six
    first six
     */

    //Q5
    /*
    a. 2
    b. 1
    c. the minimal index difference between x and y in the array
     */


}
