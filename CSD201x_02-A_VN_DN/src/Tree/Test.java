package Tree;

public class Test {
    public static void main(String[] args) {
        MyBST myBST = new MyBST();
        // myBST.mRoot = myBST.insert(myBST.mRoot, 5);
        // myBST.mRoot = myBST.insert(myBST.mRoot, 1);
        // myBST.mRoot = myBST.insert(myBST.mRoot, 6);
        // myBST.mRoot = myBST.insert(myBST.mRoot, 0);
        // myBST.mRoot = myBST.insert(myBST.mRoot, 3);
        // myBST.mRoot = myBST.insert(myBST.mRoot, 7);
        // myBST.mRoot = myBST.insert(myBST.mRoot, 2);
        // myBST.mRoot = myBST.insert(myBST.mRoot, 4);

        // System.out.println("Done");
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 5);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 1);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 6);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 0);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 3);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 7);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 2);
        myBST.mRoot = myBST.insertIntoBST(myBST.mRoot, 4);
        // myBST.deleteNode(myBST.mRoot, 1);
        System.out.println(myBST.searchBST(myBST.mRoot, 7).value);
        myBST.PreOrder(myBST.mRoot);
        System.out.println();
        myBST.InOrder(myBST.mRoot);
        System.out.println();
        myBST.PostOrder(myBST.mRoot);
        System.out.println();
        System.out.println(myBST.height());
        System.out.println("Done");
    }
}
