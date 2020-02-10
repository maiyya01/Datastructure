package miscellaneous;

// JAVA program to insert element into binary tree

import java.util.LinkedList;
import java.util.Queue;

public class InsertIntoBinaryTree
{

    static class Node
    {
        int key;
        Node left, right;

        Node(int key)
        {
            this.key = key;
            left = null;
            right = null;
        }
    }

    static Node root;
    static Node temp;

    static void inorder(Node temp)
    {
        if ( temp == null)
            return;

        inorder(temp.left);
        System.out.println(temp.key);
        inorder(temp.right);
    }


    static void insert(Node temp, int key)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(temp);

        while ( !q.isEmpty())
        {
            temp = q.peek();
            q.remove();

            if ( temp.left == null)
            {
                temp.left = new Node(key);
                break;
            }
            else
            {
                q.add(temp.left);
            }

            if ( temp.right == null)
            {
                temp.right = new Node(key);
                break;
            }
            else
            {
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args)
    {
        root = new Node(10);

        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);

        System.out.println("Inorder traversor before insertion");
        inorder(root);
        int key = 12;
        insert(root, key);

        System.out.println("Inorder traversor after insertion");
        inorder(root);


    }

}
