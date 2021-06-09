public class CS_2020_A_85 {

    //Q1
    public static int findMaximum (int[][] mat)
    {
        if (mat[0][0] == -1)
            return -1;
        int[][] copy = new int[mat.length][mat[0].length];
        return findMaximum(mat,copy,0,0,0,0);
    }

    //to know if the next step within bounds of array
    public static boolean isValid(int i, int j, int rows, int cols){
        return (i<rows && i>=0 && j<cols && j>=0);
    }

    //to know if the step is good for question constrains
    public static boolean isSafe (int[][] mat, int[][]copy, int i , int j){
        if (mat[i][j] != -1 && copy[i][j] != -1)
            return true;
        return false;
    }

    public static int findMaximum(int[][] mat, int[][] copy, int i, int j, int dist, int maxD){
        if (!isSafe(mat, copy,i+1,j) && !isSafe(mat, copy,i,j+1) && !isSafe(mat, copy,i,j-1))
            if (mat[i][j] == 1)
                return Integer.max(dist+1, maxD);
            else
                return Integer.max(dist, maxD);

        copy[i][j] = -1;

        if(isValid(i,j+1, mat.length, mat[0].length) && isSafe(mat, copy, i, j+1) && i%2==0) {
            if (mat[i][j] == 1)
                maxD = findMaximum(mat, copy, i, j + 1, dist+1, maxD);
            maxD = findMaximum(mat, copy, i, j + 1, dist, maxD);
        }
        if(isValid(i,j-1, mat.length, mat[0].length) && isSafe(mat, copy, i, j-1) &&i%2==1)
        {
            if(mat[i][j] == 1)
                maxD = findMaximum(mat,copy,i,j-1,dist+1,maxD);
            maxD = findMaximum(mat,copy,i,j-1,dist,maxD);
        }

        if(isValid(i+1,j, mat.length, mat[0].length) && isSafe(mat, copy, i+1, j))
        {
            if(mat[i][j] == 1)
                maxD = findMaximum(mat,copy,i+1,j,dist+1,maxD);
            maxD = findMaximum(mat,copy,i+1,j,dist,maxD);
        }
        copy[i][j] = 0;
        return maxD;
    }

    //Q2


    //count how many increasing and the number of subarray is (n-1)+(n-2)+....2 + 1
    //example - in {7,10,11,15} num of subarrays is 3 + 2 + 1 = 3
    public static int strictlyIncreasing (int[] a) {
        int local = 0, total = 0, alen= a.length;
        if (alen < 2)
            return 0;
        for (int i = 0; i < alen - 1; i++) {
            if (a[i+1]>a[i])
                local++;
            else if (a[i+1] <= a[i])
            {
                total = total + comb (local);
                local = 0;
            }
        }
        total = total + comb (local);
        return total;
    }

    public static int comb (int num){
        if (num<1)
            return 0;
        int combinations = 0;
        for (int i=0; i<=num;i++)
            combinations = combinations+ i;
        return combinations;
    }



    //Q3

    //Q4

    //Q5



}
