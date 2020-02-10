package miscellaneous;

public class BinaryTree
{

    BNode root;

    BinaryTree(int key)
    {
        root = new BNode(key);
    }

    BinaryTree()
    {
        root = null;
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new BNode(1);

        tree.root.left = new BNode(2);
        tree.root.right = new BNode(3);

        tree.root.left.left = new BNode(4);
    }


}


class BNode
{
    int key;
    BNode left, right;

    public BNode(int item)
    {
        key = item;
        left = right = null;
    }

}
