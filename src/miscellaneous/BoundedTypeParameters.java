package miscellaneous;

public class BoundedTypeParameters
{

    public static <T extends Comparable<T>> T calcualteMin(T t1, T t2)
    {
        if ( t1.compareTo(t2) < 0)
            return t1;

        return t2;
    }

    public static void main(String[] args)
    {
        System.out.println(calcualteMin('C','A'));
        System.out.println(calcualteMin("Mahesh","VihaanA"));
        System.out.println(calcualteMin(10,15));
    }
}
