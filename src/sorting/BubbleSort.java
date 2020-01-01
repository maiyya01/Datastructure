package sorting;

public class BubbleSort
{

    public static void main(String args[])
    {
        System.out.println("HI");
        int arr[] = { 10, 5, 30, 15, 50, 6 };
        BubbleSort obj = new BubbleSort();

        System.out.println("Array is not sorted...");
        obj.printArray(arr);
        obj.bubbleSort(arr);
        System.out.println("Array is sorted...");
        obj.printArray(arr);

    }

    public void bubbleSort(int arr[])
    {


        int n = arr.length;
        for ( int i =0; i< n - 1; i++)
            for ( int j = 0; j < n - i - 1 ; j++ )
            {
                if (arr[j] > arr[j+1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1 ] = tmp;
                }
            }
    }

    public void printArray(int arr[])
    {
        int n = arr.length;

        for ( int i =0; i< n; ++i)
        {
            System.out.println(arr[i]);
        }
    }

    
}
