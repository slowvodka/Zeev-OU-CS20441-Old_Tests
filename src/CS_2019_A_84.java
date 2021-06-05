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



}
