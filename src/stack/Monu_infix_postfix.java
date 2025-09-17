import java.util.*;

public class Monu_infix_postfix {
	public class Node {
		int val;
		Node left;
		Node right;

		Node() {
		}

		Node(int val) {
			this.val = val;
		}

		Node(int val, Node left, Node right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}

	public Node expTree(String s) {
		String PostFix = getPostFix(s);
		Stack<Node> st = new Stack<>();
		for (int i = 0; i < PostFix.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				Node nn = new Node(ch);
				Node right = st.pop();
				Node.left = st.pop();
				nn.right = right;
				nn.left = left;
				st.push(nn);
			} else {
				st.push(new Node(ch));
			}
		}
		return st.peek();
	}

		public String getPostFix(String s) {
			StringBuilder sb = new StringBuilder();
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch >= '0' && ch <= '9')
					stack(ch);
				else if (ch == '(')
					stack.push(ch);
				else if (ch == ')') {
					while (stack.peek() != '(')
						sb.append(stack.pop());
					stack.pop();
				} else {
					while (!stack.isEmpty() && getValue(stack.peek()) > getValue(ch))
						sb.append(stack.pop());
					stack.push(ch);
				}
			}
			while (!stack.isEmpty())
				sb.append(stack.pop);
			return sb.toString();
		}

		public int getValue(char ch) {
			if (ch == '*' || ch == '/')
				return 2;
			else if (ch == '-' || ch == '+')
				return 1;
			else
				return -1;

		}
}