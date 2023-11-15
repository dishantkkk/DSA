package com.dishant.graph;

import static com.dishant.graph.DFSTraversalRecursive.*;
import static com.dishant.graph.DFSTraversalNonRecursive.*;


public class MainClass {
    public static void main(String... args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.print("Pre-Order Traversal: ");
        preOrder(root);
        System.out.println();
        System.out.print("Pre-Order Traversal non recursive: ");
        preOrderNonRecursive(root);
        System.out.println();
        System.out.print("In-Order Traversal: ");
        inOrder(root);
        System.out.println();
        System.out.print("In-Order Traversal non recursive: ");
        inOrderNonRecursive(root);
        System.out.println();
        System.out.print("Post-Order Traversal: ");
        postOrder(root);
        System.out.println();
        System.out.print("Post-Order Traversal non recursive: ");
        postOrderNonRecursive(root);
    }
}
