public class BSTNode <String extends Comparable<String>>{
    protected String info;
    protected BSTNode left;
    protected BSTNode right;

    public BSTNode getLeft() {
        return left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode link) {
        right = link;
    }

    public void setLeft(BSTNode link)
    // The info in a BST node
    // Alink to the left child node // Alink to the right child node
    // Sets left link of this BSTNode.
    {
        left = link;
    }

    public BSTNode(String info) {
        this.info = info;
        left = null;
        right = null;
    }
    public void setInfo(String info)
    // Sets info of this BSTNode.
    {
        this.info = info;
    }
    public String getInfo()
    // Returns info of this BSTNode.
    {
        return info;
    }

}
