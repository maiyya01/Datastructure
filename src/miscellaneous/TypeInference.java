package miscellaneous;

import java.util.ArrayList;
import java.util.List;

class Bucket<T>
{

    private T item;

    public void  setItem(T t )
    {
        this.item = t;
    }


    public T getItem() {
        return this.item;
    }
}

public class TypeInference
{
    public static <T> void addStore(T t, List<Bucket<T>> list)
    {
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString() + " has been added to the list");


    }


    public static void main(String[] args)
    {

        List<Bucket<String>> list = new ArrayList<>();
        TypeInference.<String>addStore("Mahesh",list);

    }
}
