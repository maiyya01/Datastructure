package miscellaneous;

public class GCD {

    public static void main(String[] args)
    {

        System.out.println("GCD: " + gcdIterative(7,9));
        System.out.println("GCD: " + gcdRecurvise(5,2));
    }

    public static int gcdIterative(int num1, int num2)
    {
        while ( num2 != 0)
        {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static int gcdRecurvise(int num1, int num2)
    {
        if ( num2 == 0) return num1;
        return gcdRecurvise(num2, num1 % num2);
    }
}
