package com.Tree;
import java.util.*;

public class BinaryTree {
	
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
		
	}
	
	private TreeNode root;
	Scanner sc = new Scanner(System.in);
	
	public BinaryTree() {
		root = CreateTree();
	}

	private TreeNode CreateTree() {
		int item = sc.nextInt();
		TreeNode nn = new TreeNode(item);
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = CreateTree();
		}
		boolean hlr = sc.nextBoolean();
		if(hlr) {
			nn.right = CreateTree();
		}
		return nn;
	}
	
	//Display
	public void Display() {
		Display(this.root);
	}
	private void Display(TreeNode root) {
		if(root == null) return;
		
		if(root.left != null) System.out.print(root.left.val + "<--");
		else System.out.print(". <--");
		System.out.print(root.val);
		if(root.right != null) System.out.print ("-->"+root.right.val);
		else System.out.print("--> .");
		System.out.println();
		Display(root.left);
		Display(root.right);
	}
	
	//Max
	public int max() {
		int max_ele = Integer.MIN_VALUE;
		return max(this.root);
	}
	private int max(TreeNode root) {
		if(root == null) return Integer.MIN_VALUE;
		int lm = max(root.left);
		int rm = max(root.right);
		return Math.max(root.val , Math.max(lm,rm));
	}
	
	// Find
	public boolean find(int item) {
		return find(this.root, item);
	}
	private boolean find(TreeNode root,int item) {
		if(root == null) return false;
		if(root.val == item) return true;
		return find(root.left,item) || find(root.right,item);
	}
	
	//Height of tree
	public int height() {
		return height(this.root);
	}
	private  int height(TreeNode root) {
		if(root == null) return 0;
		
		int lh = height(root.left);
		int rh = height(root.right);
		return 1+Math.max(lh, rh);
	}
	
	//pre-order
	public void preorder() {
		preorder(this.root);
	}
	private void preorder(TreeNode root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.val+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	
	//post-order
	public void postorder() {
		postorder(this.root);
	}
	private void postorder(TreeNode root) {
		if(root == null) {
			return ;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.val+" ");
	}
	
	
	//in-order
	public void inorder() {
		inorder(this.root);
	}
	private void inorder(TreeNode root) {
		if(root == null) {
			return ;
		}
		inorder(root.left);
		inorder(root.right);
		System.out.print(root.val+" ");
	}
	
	
	//level-order
	public void levelorder() {
		levelorder(this.root);
	}
	private void levelorder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode rv = q.remove();
			System.out.print(rv.val+" ");
			if(rv.left!=null) q.add(rv.left);
			if(rv.right!=null) q.add(rv.right);
		}
		System.out.println();
	}
}
