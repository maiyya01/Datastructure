package sorting;

public class SelectionSort
{
    public static void main(String args[])
    {
        System.out.println("HI");
        int arr[] = { 10, 5, 30, 15, 50, 6 };
        SelectionSort obj = new SelectionSort();

        System.out.println("Array is not sorted...");
        obj.printArray(arr);
        obj.selectionSort(arr);
        System.out.println("Array is sorted...");
        obj.printArray(arr);

    }

    public void selectionSort(int arr[])
    {
        int min_idx;
        for ( int i=0; i<arr.length-1; i++)
        {
            min_idx = i;
            for ( int j=i+1; j<arr.length; j++)
            {
                if ( arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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
