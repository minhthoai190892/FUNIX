package HocLai;

// Java implementation of the approach


class GFG {

    // Representation of a node
    static class Node {
        int data;
        Node next;
    };

    // Function to insert node
    static Node insert(Node root, int item) {
        Node temp = new Node();
        Node ptr;
        temp.data = item;
        temp.next = null;

        if (root == null)
            root = temp;
        else {
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
    }

    static void display(Node root) {
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.next;
        }
    }

    static Node arrayToList(int arr[], int n) {
        Node root = null;
        for (int i = 0; i < n; i++)
            root = insert(root, arr[i]);
        return root;
    }

    // Driver code
    public static void main(String args[]) {
        int arr[] = {10,20,1010, 1, 2, 3, 4, 5 };
        int n = arr.length;
        Node root = arrayToList(arr, n);
        display(root);
    }
}

// This code is contributed by Arnab Kundu
