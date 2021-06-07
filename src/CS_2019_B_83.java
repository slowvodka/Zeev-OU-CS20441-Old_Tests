public class CS_2019_B_83 {


    //Q1

    public static int longestPath (int[][] mat, int x, int y){
        // construct a matrix to keep track of visited cells
        int[][] visited= new int[mat.length][mat[0].length];

        // `(0, 0)` are the source cell, and `(5, 7)` are the destination
        // cell coordinates
        int max_dist = longestPath(mat, visited, 0, 0, x, y, 0, 0);

        return max_dist;
    }

    // Check if it is possible to go to position `(x, y)` from
    // the current position. The function returns false if the cell
    // has a value 0, or it is already visited.
    private static boolean isSafe(int mat[][], int copy[][], int x, int y)
    {
        if (mat[x][y] == 0 || copy[x][y] == 1)
            return false;
        return true;
    }

    // Returns false if not a valid position
    private static boolean isValid(int x, int y, int rows, int cols)
    {
        if (x < rows && y < cols && x >= 0 && y >= 0)
            return true;
        return false;
    }

    // Find the longest possible route in a matrix `mat` from the source cell
    // `(0, 0)` to destination cell `(x, y)`.
    // `max_dist` —> keep track of the length of the longest path from source to
    // destination.
    // `dist` —> length of the path from the source cell to the current cell `(i, j)`.
    public static int longestPath(int[][] mat, int[][] copy, int i, int j, int x, int y, int max_dist, int dist)
    {
        // if the destination is not possible from the current cell
        if (mat[i][j] == 0)
            return 0;

        // if the destination is found, update `max_dist`
        if (i == x && j == y)
            return Integer.max(dist, max_dist);

        // set `(i, j)` cell as visited
        copy[i][j] = 1;

        // go to the bottom cell
        if (isValid(i + 1, j, mat.length, mat[0].length) && isSafe(mat, copy, i + 1, j))
        {
            max_dist = longestPath(mat, copy, i + 1, j, x, y, max_dist, dist + 1);
        }

        // go to the right cell
        if (isValid(i, j + 1, mat.length, mat[0].length) && isSafe(mat, copy, i, j + 1))
        {
            max_dist = longestPath(mat, copy, i, j + 1, x, y, max_dist, dist + 1);
        }

        // go to the top cell
        if (isValid(i - 1, j, mat.length, mat[0].length) && isSafe(mat, copy, i - 1, j))
        {
            max_dist = longestPath(mat, copy, i - 1, j, x, y, max_dist, dist + 1);
        }

        // go to the left cell
        if (isValid(i, j - 1, mat.length, mat[0].length) && isSafe(mat, copy, i, j - 1))
        {
            max_dist = longestPath(mat, copy, i, j - 1, x, y, max_dist, dist + 1);
        }

        // backtrack: remove `(i, j)` from the visited matrix
        copy[i][j] = 0;

        return max_dist;
    }


    //Q2
	public static int howManyNagativeNumbers (int[][] arr)
	{
		int row = arr.length;
		int col = arr[0].length;
		int count = 0; //negative numbers counter
		int j=0;//col counter
		//for every row starting from top, and columns starting from first
		for (int i=row-1; i>=0 && j<col ; j++ )
		{
			//if the i j position if >=0
			if (arr[i][j] >= 0)
			{
				count = count + j;//we know all the numbers on the left will be less than 0
				i--; // go one row up
				j--; //decrease the column counter since the arr[i-1][j] might be also negative 
			}
		}
		count = count + j; // for the last row we need to add the number of negative numbers.
		//this also can be done with iteration over the first row.

		return count;
	}
	
	//Q3
	
	// f - returns the tree depth
	// what - prints the nodes of the tree in depth i from left to right
	// secret - prints all the tree in layers from root to leaves
	
	//a. f on the tree root will return 4 
	//b. f returns tree depth
	//c. what (root,3) will print "5 25 45"
	//d. prints the nodes of the tree in depth i from left to right, 
	//   error will occur if x<1, no return statement in this case, 
	//   if x > tree depth also will be error (will try to access left/right node of null
	//e. 60 20 70 10 38 5 25 45 30
	//f. prints all the tree in layers from root to leaves
	
	//Q4
	
	// a. A<-E<-C<-B
	//    A<-D
	// b. A(int a)
	//	  B(int a, float b, char c, boolean d)
	//	  B(E e, A a)
	// c. you have f function in B C E classes
	// d. 1. a4=o1 - compilation error because types not compatible
	//    2. o2=o1 - will work because they are 2 objects
	//    3. ((A) o1).toString() - running time error - because o1 is object and cannot be casted to A class
	//    4. a.toString() - will work because A inherits toString() from object
	//    5. ((A) o2).toString - will work since o2 is actually an A class 
	
	//Q5
	
	// f return the middle node between p1 and p2
	// what is a binary search algorithm in lists
	
	//a. f on the list {2,3,8,14,15,35 } returns the node that has 14
	//b. f return the middle node between p1 and p2 - p1 must be before p2 otherwise we will have a problem.
	//c. we will get the node that contains the number 15
	//d. what is a binary search algorithm in lists, if the list don`t have the number we will get null.

}
