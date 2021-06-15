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
	
	//what - how many nodes in tree
	//something - checks all nodes between min and max values and that the tree is a binary tree
	//secret - finds out the maximum number of nodes that represent a binary tree between min and max values.
	
	//3a. - 9
	//3b. - how many nodes in tree
	//3c. - false - since it is not a binary tree
	//3d. - checks all nodes between min and max values and that the tree is a binary tree
	//3e. - 4
	//3f. - finds out the maximum number of nodes that represent a binary tree between min and max values.

    //Q4
	//a
	//	a[0] txt="good luck"
	//	a[1] txt="special"
	//	a[2] txt="oyvey", 		times = "2"
	//	a[3] txt="special", 	times = "2" 
	//	a[4] txt="submarines", 	times = "2" 	lines = "3"
	//	a[5] txt="planes", 		times = "3" 	lines = "3"
	
	//b
	/*
	0***goodluck
	1***special
	1***oyveyoyvey
	1***specialspecial
	1***submarinessubmarines
	submarinessubmarines
	submarinessubmarines
	
	1***planesplanesplanes
	planesplanesplanes
	planesplanesplanes
	
	*/

    //Q5
	//what - moves all negative numbers to the begining of the list, returns the node with the first positive number
	//secret - makes the list in +-+-+-+- order

	//5a. - 8
	//5b. - {8,-4,2,-5,9,-6}
	//5c. - {2,-2,3,-2,2,2}
	//5d. - method arranges list in +-+-+- order. 
	//if all positive or negative numbers - list wont change
	//if many positives or many negatives - 


}
