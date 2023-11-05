package com.greatlearning.lab3.q2;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Enter the num of elements in tree");
		
	     //	int element = 7;//Sc.nextInt();
		//System.out.println("Enter the root element");
		//TreeNode  root = new TreeNode(40);//sc.nextInt();
		
		//for(int i=1; i< element; i++) {
		//	System.out.print("Enter the element to be inserted in tree");
		//root.insert(root. sc.nextInt());
		//}
		
		TreeNode root = new TreeNode(40);
		
		root.insert(root,  20);
		root.insert(root,  60);
		root.insert(root,  10);
		root.insert(root,  30);
		root.insert(root,  50);
		root.insert(root,  70);
		
		FindingSumPair sumPair = new FindingSumPair();
		sumPair.checkPairPresent(root, 130);
	}

}
