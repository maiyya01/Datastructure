package miscellaneous;

public class GenericMethod
{

    public <T> void showArray(T[] array)
    {
        for ( T item : array)
            System.out.println(item.toString());
    }

    public static void main(String[] args)
    {
        Integer[] integerArray = { 3,4,5,2,1};
        String[] stringArray = { "Mahesh", "Vihaan"};
        GenericMethod genericMethod = new GenericMethod();

        genericMethod.showArray(integerArray);
        genericMethod.showArray(stringArray);



    }
}
