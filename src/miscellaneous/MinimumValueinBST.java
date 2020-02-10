package miscellaneous;


public class MinimumValueinBST
{
    static class Node
    {
        int data;
        Node left, right;

        Node(int d)
        {
            data = d;
            left=right=null;

        }

    }

    static Node node;

    Node insert(Node node, int data)
    {
        if ( node == null )
            return new Node(data);
        else
        {
            if ( data<= node.data)
            {
                node.left = insert(node.left, data);
            }
            else
                node.right = insert(node.right,data);

            return node;
        }
    }

    int minValue( Node node)
    {
        Node current = node;

        while ( current.left != null)
        {
            current = current.left;
        }
        return (current.data);
    }

    public static void main(String[] args)
    {
        MinimumValueinBST tree = new MinimumValueinBST();
        Node root = null;
        root = tree.insert(root, 4);
        tree.insert(root, 4);
        tree.insert(root, 1);
        tree.insert(root, 4);
        tree.insert(root, 5);
        tree.insert(root, 7);

        System.out.println("Min:" + tree.minValue(root));
    }
}
