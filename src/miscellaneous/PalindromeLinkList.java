package miscellaneous;

import java.util.Stack;

public class PalindromeLinkList
{
    public static void main()
    {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six= new Node(6);
        Node seven = new Node(7);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean condition = isPalindrome(one);
        System.out.println(" IsPalindrome - " + condition);


    }

    static boolean isPalindrome(Node head)
    {
        Node slow = head;
        boolean isPalin = true;

        Stack<Integer> stack = new Stack<>() ;
        return true;

    }
}
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        next = null;
        data = d;
    }
}