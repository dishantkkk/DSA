package com.dishant.graph;

public class Node {
    Node left;
    Node right;
    int data;

    public Node() {}
    public Node(Node left, Node right, int data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }
    public Node(int data) {
        this.data = data;
    }
}
