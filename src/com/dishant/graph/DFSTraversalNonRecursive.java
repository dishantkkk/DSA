package com.dishant.graph;

import java.util.Stack;

public class DFSTraversalNonRecursive {
    static void preOrderNonRecursive(Node root) {
        if(root==null)
            return;
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);
        while(!nodeStack.isEmpty()) {
            Node temp = nodeStack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                nodeStack.push(temp.right);
            }
            if(temp.left!=null) {
                nodeStack.push(temp.left);
            }
        }
    }
    static void inOrderNonRecursive(Node root) {
        if(root==null)
            return;
        Stack<Node> nodeStack = new Stack<>();
        Node temp = root;
        while(!nodeStack.isEmpty() || temp!=null) {
            while(temp!=null) {
                nodeStack.push(temp);
                temp=temp.left;
            }
            temp=nodeStack.pop();
            System.out.print(temp.data+" ");
            temp=temp.right;
        }
    }
}
