package Tree3;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            // gan gia tri la node root
            return new TreeNode(data);
        }
        if (data < node.getData()) {
            // => Them du lieu vao ben phai
            node.setLeft(insert(node.getLeft(), data));
        } else if (data > node.getData()) {
            // => Them du lieu vao ben trai
            node.setRight(insert(node.getRight(), data));
        }
        return node;
    }
}
