//13.Write a program in java to reverse of a pyramid.

class JavaProgram
{
    public static void main(String args[])
    {
        int i, j, k=1;
        for(i=0; i<5; i++)
        {
            for(j=0; j<k; j++)
            {
                System.out.print("* ");
            }
            k = k +1;
            System.out.println();
        }
    }
}



/*
OUTPUT: 
*
* *
* * *
* * * *
* * * * *

*/