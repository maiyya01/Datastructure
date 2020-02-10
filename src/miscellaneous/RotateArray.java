package miscellaneous;

public class RotateArray
{

    private void leftRotate(int arr[], int d, int n)
    {

        for ( int i=0; i < d; i++)
            leftRotateByOne(arr, n);

    }

    void leftRotateByOne(int arr[], int n)
    {

        int i , tmp;
        tmp = arr[0];

        for ( i = 0; i < n-1; i++)
            arr[i] = arr[i+1];

        arr[i] = tmp;
    }

    void printArray(int arr[], int n)
    {
        for ( int i=0; i< arr.length; i++)
            System.out.println(arr[i]+" ");
    }

    public static void main(String[] args)
    {
        System.out.println("*****");
        RotateArray rotate = new RotateArray();
        int arr[] = {1,2,3,4,5,6,7,8};
        rotate.leftRotate(arr, 3, 8);
        rotate.printArray(arr, 8);
    }
}
