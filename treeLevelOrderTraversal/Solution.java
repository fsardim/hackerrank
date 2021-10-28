package treeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Solution {

	static String resposta = "";
	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	
	public static void levelOrder(Node root) {
		
		if(root == null)
			return;
		
		LinkedList<Node> queue = new LinkedList();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Node cur = queue.poll();
			System.out.print(cur.data + " ");
			
			if(cur.left != null)
				queue.add(cur.left);
			if(cur.right != null)
				queue.add(cur.right);
		}
		

    }

	public static Node insert(Node root, int data) {
		
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }	
}