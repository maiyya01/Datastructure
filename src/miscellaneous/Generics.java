package miscellaneous;

class Store<T>
{
    private T item;

    public void setItem(T item)
    {
        this.item = item;
    }

    public T getItem()
    {
        return this.item;
    }

    @Override
    public String toString()
    {
        return this.item.toString();
    }

}

class Hashtable<K, V>
{
    private K key;
    private V value;

    public Hashtable(K key, V value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return key.toString() + "-" + value.toString();
    }

}
public class Generics {

    public static void main(String[] args)
    {
        System.out.println("Welcome to Generics demo");
        String str = "Hello World";

        Store<String> store = new Store<>();
        store.setItem(str);

        String storeItem = store.getItem();

        System.out.println(storeItem);

        Hashtable<String, Integer>  hashtable = new Hashtable<>("Mahesh", 5);
        System.out.println(hashtable);

    }
}
