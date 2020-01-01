package miscellaneous;

public class Factorial
{
    public static void  main(String[] args)
    {
        System.out.println("Factorial Result:" + factorial(5));
        System.out.println("Factorial Result:" + factorial(1,5));
    }

    public static int factorial(int n)
    {
        if ( n ==1 )
            return 1;
        return n * factorial(n-1);
    }

    public static int factorial(int accumulator, int n )
    {
        if (  n ==1)
                return accumulator;

        return factorial( accumulator*n, n-1);
    }


}
