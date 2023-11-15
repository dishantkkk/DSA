package com.dishant.graph;

import java.util.Stack;

public class DFSTraversalNonRecursive {
    private static Stack<Node> nodeStack;

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
    static void postOrderNonRecursive(Node root) {
        if(root == null)
            return;
        Node current = root;
        Stack<Node> nodeStack = new Stack<>();
        while(current!=null || !nodeStack.isEmpty()) {
            if(current != null) {
                nodeStack.push(current);
                current = current.left;
            } else {
                Node temp = nodeStack.peek().right;
                if(temp == null) {
                    temp = nodeStack.pop();
                    System.out.print(temp.data + " ");
                    while (!nodeStack.isEmpty() && temp == nodeStack.peek().right) {
                        temp = nodeStack.pop();
                        System.out.print(temp.data + " ");
                    }
                }
                else {
                    current = temp;
                }
            }
        }
    }
}
