package oops;

import java.util.Scanner;

class Node{
    int data;
    Node right;
    Node left;

    Node(int data)
    {
        this.data=data;
    }

}

public class bst
 { 
    static Scanner sc=null;
    public static void main(String[] args) 
    {
        sc=new Scanner(System.in);

        createtree();
    }
    static Node createtree()
    {

        Node root=null;
        System.out.println("enter data");
        int data=sc.nextInt();

        if(data==-1) return null;

        root=new Node(data);
        System.out.println("left node");
        root.left=createtree();

        System.out.println("right node");
        root.right=createtree();

        return root;
    }

    
}
