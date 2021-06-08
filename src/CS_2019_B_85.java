public class CS_2019_B_85 {

    //Q1

    public static int howManyPaths (int[][] mat){
        int rows = mat.length;
        int cols = mat[0].length;
        if (rows == 1 && cols == 1)
            return 1;

        int[][] visited = new int[rows][cols];
        return howManyPaths(mat,visited,0,0,rows,cols);
    }

    public static int howManyPaths (int[][] mat, int[][] visited, int x, int y, int rows, int cols){
        if (x<0 || y<0 || x>=rows || y>=cols || visited[x][y]<0)
            return 0;
        if (x == rows-1 && y == cols-1)
            return 1;
        int k = mat[x][y];
        visited[x][y] = -k;
        int opt =  howManyPaths(mat,visited,x+k,y,rows,cols)+howManyPaths(mat,visited,x-k,y,rows,cols) +
                    howManyPaths(mat,visited,x,y+k,rows,cols)+howManyPaths(mat,visited,x,y-k,rows,cols);


        visited[x][y] = 0;

        return opt;
    }

    //Q2

    public static int meetingPoint (int[] a, int[] b)
    {
        int am = a.length-1;
        int bm = b.length-1;
        int m = Math.min(am,bm);
        int low =0, high = m, mid,index =-1;
        if (a[0] <b[0] )
            return -1;
        while (low<=high)
        {
            mid = (low+high)/2;
            if(a[mid]==b[mid])
            {
                index =  mid;
                while (a[mid-1] == b[mid-1])
                    mid--;
                return mid;
                //high = mid-1;
            }
            if (a[mid]>b[mid])
                low = mid-1;
            else
                high = mid-1;
        }
        return index;
    }
	
	//Q3
	
	//g - returns the rightest node / maximal number in tree
	//something - returns the biggest number that are smaller than number
	
	//a. 70
	//b. returns the rightest node / node that contains maximal number in tree - if no such node returns null
	//c. 30
	//d. returns the biggest number that are smaller than num, if no such number returns -1
	
	//Q4
	
	//a. A<-E<-C<-B
	//         C<-D
	//b.1. object<-Z<-A
	//b2.a - compilation error - A and Z are potatos and oranges
	//b2.b - works
	//b2.c - running error - cannot convert Z to A
	//b3.d - works
	//b3.e - works
	
	//c.a - work
	//c.b - works
	//c.c - compilation error - no method m in A
	//c.d - compilation error - no method m in C
	//c.e - compilation error - no method m in A
	
	//Q5
	
	//what - removes dublicates from list
	//secret - puts all zeroes in the end of the list
	
	//a. {2,6,3,4,7,1}
	//b. removies duplicated
	//c. {2,6,3,4,7,4,1,3,0,0,0}, the method returns 3.
	//d. puts all zeroes in the end of the list
	
	




}
