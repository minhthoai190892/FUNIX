package Tree;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }

    public int height() {
        if (isLeaf()) {
            return 1;
        }
        int leftNode = 0;
        int rightNode = 0;
        if (this.left != null) {
            leftNode = this.left.height();
        }
        if (this.right != null) {
            rightNode = this.right.height();
        }return (leftNode>rightNode)?(leftNode+1):(rightNode+1);
    }
}
