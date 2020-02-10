package miscellaneous;

public class TwoSumProblem

{
    public static void main(String[] args)
    {

        int[] myArray = {4,5,10,12};
        int[] outArray = twoNumbersSum(myArray, 14);

        if ( outArray.length == 2)
        {
            System.out.println("First Element is:" + outArray[0]);
            System.out.println("Second Element is:" + outArray[1]);
        }

    }

    private static int[] twoNumbersSum(int[] array, int targetSum)
    {

        for ( int i=0; i < array.length -1 ;i++) {
            int firstNum = array[i];
            for ( int j = i+1; j< array.length; j++ )
            {
                if ( firstNum + array[j] == targetSum)
                {
                    return new int[] { firstNum, array[j]};
                }
            }

        }
        return new int[0];
    }



}
