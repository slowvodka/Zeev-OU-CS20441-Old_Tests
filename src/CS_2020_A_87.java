public class CS_2020_A_87 {

    //Q1
    public static int totalWays (int [][] mat,int k)
    {
        int rows = mat.length, cols = mat[0].length;
        if (rows <k || cols <k || k==0)
            return 0;
        return totalWays(rows, cols, k, 0, 0, '0', 0,0);
    }

    public static boolean isValid(int rows, int cols, int i, int j)
    {
        return (i<rows && j<cols);
    }

    public static int totalWays (int rows, int cols, int k, int i, int j, char prev, int turns, int valids)
    {
        if (i == rows-1 && j==cols-1)
            if (turns == k)
                return valids+1;
            else
                return valids;
        if (turns > k)
            return valids;

        if (isValid(rows,cols,i+1,j))
            if (prev == 'R')
                valids=totalWays(rows,cols,k,i+1,j,'D',turns+1,valids);
            else
                valids=totalWays(rows,cols,k,i+1,j,'D',turns,valids);
        if (isValid(rows,cols,i,j+1))
            if (prev == 'D')
                valids=totalWays(rows,cols,k,i,j+1,'R',turns+1,valids);
            else
                valids=totalWays(rows,cols,k,i,j+1,'R',turns,valids);

        return valids;
    }

    //Q2
    public static void printTriplets (int [] a, int num){
        int h;
        for (h = a.length-1 ; h> 1 && a[h] > num ; h--);
        if (h<2)
            return;
        int l=0;
        int m=1;
        while (l<h)
        {
            if (m>=h)
            {
                l++;
                m=l+1;
                continue;
            }
            if (a[l]*a[m]*a[h]==num)
            {
                System.out.println(a[l]+" "+a[m]+" "+a[h]);
                m++;
                h--;
                continue;
            }
            if (a[l]*a[m]*a[h]>num)
            {
                h--;
                continue;
            }
            m++;
        }
    }

    //Q3
	
	// what - returns the depth of the tree, if root == null returns 0
	// secret - sums the level x of the tree to array a position x
	
	// a. returns 5
	// b. what - returns the depth of the tree, if root == null returns 0
	// c. 50, 60, 30, 80, 70
	// d. sums the level x of the tree to array a position x
	
	//Q4
	
	//a.
	/*
	a1	1	-
	a2	5	-
	ab	1	B
	b1	1	B
	b2	5	B
	c	5	-
	*/
	
	//b.
	/*
	Aobject 1
	BA
	Bobject 3
	BA 5
	Bobject 6
	Aobject
	BB
	Aobject
	Aobject
	*/
	
	//Q5
	
	// f - length of list
	// something - how many nodes increase and then descrease
	
	// a. 9
	// b. length of list, if empty returns 0
	// c. 4
	// d. 5
	// e. how many nodes increase and then deacrease. if empty list returns 0, if only decrease returns 1.
}