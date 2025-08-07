package com.Tree;
import com.Tree.BinaryTree;
public class BinaryTree_Client {
	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
//		bt.Display();
//		System.out.println(bt.max());
//		System.out.println(bt.find(70));
//		System.out.println(bt.height());
//		bt.preorder();
//		bt.postorder();
//		bt.inorder();
		bt.levelorder();
	}
}
//10 true 20 true 70 false false false true 50 false true 80 false false
