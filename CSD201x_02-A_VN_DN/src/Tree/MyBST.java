package Tree;

import java.util.Objects;

public class MyBST {
    public TreeNode mRoot;

    /**
     * @param root truyền vào góc mà ta muốn thêm vào
     * @param data giá trị
     * @return
     */
    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        // kiem tra root có null không
        if (Objects.isNull(root)) {
            // root là rỗng thì giá trị đó làm root của cây
            root = newNode;
            return root;
        } else {
            // node tạm
            TreeNode temp = root;
            while (true) {
                if (value > temp.value) {
                    // đi vào phía bên phải
                    // kiiểm tra xem node right có null không
                    if (Objects.isNull(temp.right)) {
                        // null thì gán giá trị vào node
                        temp.right = newNode;
                        break;
                    } else {
                        // chưa null thì đi tiếp
                        temp = temp.right;
                    }
                } else {
                    // đi về bên trái
                    // kiểm tra bên trái có null không
                    if (Objects.isNull(temp.left)) {
                        temp.left = newNode;
                        break;
                    } else {

                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }

    public TreeNode insertIntoBST(TreeNode rootNode, int value) {
        TreeNode newNode = new TreeNode(value);
        if (Objects.isNull(rootNode)) {
            rootNode = newNode;
            return rootNode;
        }
        if (value < rootNode.value) {
            if (Objects.isNull(rootNode.left)) {
                rootNode.left = newNode;
            } else {

                insertIntoBST(rootNode.left, value);
            }
        } else {
            if (Objects.isNull(rootNode.right)) {
                rootNode.right = newNode;
            } else {

                insertIntoBST(rootNode.right, value);
            }
        }
        return rootNode;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (Objects.isNull(root)) {
            return null;
        }
        // di tim node can xoa
        if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else {
            // root == key| xac dinh duoc nut xoa
            // root là lá
            if (root.right == null && root.left == null) {
                return null;
            }
            // root chỉ có 1 con bên trái
            if (Objects.isNull(root.right) && Objects.nonNull(root.left)) {
                return root.left;// trả về cây con không null
            }
            // root chỉ có 1 con bên phai
            if (Objects.isNull(root.left) && Objects.nonNull(root.right)) {
                return root.right;
            }
            // root có 2 con
            // tìm node trái cùng của cây con bên phải
            TreeNode lefModeNode = findLeftModeNode(root.right);
            // gan gia tri vao root
            root.value = lefModeNode.value;
            // xoa node
            root.right = deleteNode(root.right, lefModeNode.value);
        }
        return root;

    }

    /**
     * Tìm node con trái cùng root
     * 
     * @param root
     * @return node can tim
     */
    public TreeNode findLeftModeNode(TreeNode root) {
        if (Objects.isNull(root)) {
            return null;
        }
        // tao doi tuong chi lay gia tri ben trai
        TreeNode lefMostNode = root;
        // dùng vòng lặp để duyệt qua các node bên trái
        while (lefMostNode.left != null) {
            // tiếp tục đi đến cuối cây
            lefMostNode = lefMostNode.left;
        }
        return lefMostNode;
    }

    public TreeNode searchBST(TreeNode root, int key) {
        if (Objects.isNull(root)) {
            return null;
        }
        if (key < root.value) {
            return searchBST(root.left, key);
        } else if (key > root.value) {
            return searchBST(root.right, key);

        } else {
            // root = key
            return root;
        }
    }

    // ! Pre-order Traversal [Node->L->R]
    public void PreOrder(TreeNode currentNode) {
        if (Objects.isNull(currentNode)) {
            return;
        }
        // duyet current node truoc
        System.out.print(currentNode.value + " ");
        // duyet ben phai -> duyet ben trai
        PreOrder(currentNode.left);
        PreOrder(currentNode.right);
    }
    // ! In-order Traversal [L->Node->R]
    public void InOrder(TreeNode currentNode) {
        if (Objects.isNull(currentNode)) {
            return;
        }
        // duyet current node truoc
        // duyet ben phai -> duyet ben trai
        InOrder(currentNode.left);
        System.out.print(currentNode.value + " ");
        InOrder(currentNode.right);
    }
    // ! Post-order Traversal [L->R-Node]
    public void PostOrder(TreeNode currentNode) {
        if (Objects.isNull(currentNode)) {
            return;
        }
        // duyet current node truoc
        // duyet ben phai -> duyet ben trai
        PostOrder(currentNode.left);
        PostOrder(currentNode.right);
        System.out.print(currentNode.value + " ");
    }
    public int height() {
        if (this.mRoot == null) {
            return 0;
        }
        return this.mRoot.height();
    }
}
