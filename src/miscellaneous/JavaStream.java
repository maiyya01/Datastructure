package miscellaneous;

import java.util.Arrays;
import java.util.List;

public class JavaStream
{

    public static void main(String[] args)
    {

        List<Integer> listInt = Arrays.asList(12,23,34,45);

        int sum = listInt.stream().filter( i -> i > 15).mapToInt(i -> i).sum();

        System.out.println("Sum- " + sum);

    }

}
