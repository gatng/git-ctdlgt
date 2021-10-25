package vn.nguyenthanhdat2004110046.tuan7;

 

public class node {
    int data;

    node next;

    public node(){}

    public node(int d){
        data = d;
        next = null;
    }

    public node (int d, node n){
        data = d;
        next = n;
    }
}
