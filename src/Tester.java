public class Tester {

    public static void main (String[] args){
        System.out.println("**CS_2019_A_84**");
        //Q1
        System.out.println(CS_2019_A_84.sumPower3(1));

        //Q2
        System.out.println(CS_2019_A_84.average(new int[] {5,7,-2,10}));




        System.out.println("**S_2019_B_83**");

        //Q1
        int mat[][] =
                {
                        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
                        { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
                        { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
                        { 0, 0, 0, 0, 1, 0, 0, 1, 0, 0 },
                        { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1 },
                        { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
                        { 1, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1 },
                        { 1, 1, 0, 0, 1, 0, 0, 0, 0, 1 },
                        { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }
                };
        System.out.println(CS_2019_B_83.longestPath(mat, 5,7));

        //Q2
        int mat2[][] =
                {
                        { -99, -72, -64, -55, -28, -10, -5},
                        { -72, -53, -46, -38, 11, 13, 22},
                        { -63, -48, -27, -12, 14, 16, 23},
                        { -44, -29, -10, 0, 18, 20, 28},
                        { 0, 12, 14, 20, 28, 30, 35},
                };
        System.out.println(CS_2019_B_83.howManyNagativeNumbers(mat2));

        System.out.println("**S_2019_B_85**");

        //Q1
        int mat3[][] =
                {
                        { 1, 3, 1, 6},
                        { 2, 8, 1, 2},
                        { 6, 2, 7, 5},
                        { 2, 4, 1, 3}
                };
        System.out.println(CS_2019_B_85.howManyPaths(mat3));

        //Q2

        int[] a = {19,19,16,15,15,15,15,13,5};
        int[] b = {0,12,13,14,14,15,15,19,25,30,35};
        System.out.println(CS_2019_B_85.meetingPoint(a,b));
    }
}
