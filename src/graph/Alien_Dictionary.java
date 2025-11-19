package graph;

import java.util.*;

public class Alien_Dictionary {
	public static void main(String args[]) {
		String[] word = { "baa", "abcd", "abca", "cab", "cad" };
		String res = alignOrder(word);
		System.out.println(res);
	}

	public static String alignOrder(String[] words) {
		HashMap<Character, List<Character>> map = new HashMap<>();

		for (int i = 0; i < words.length; i++) {
			for (char ch : words[i].toCharArray()) {
				if (!map.containsKey(ch)) {
					map.put(ch, new ArrayList<>());
				}
			}
		}
		for (int i = 0; i < words.length - 1; i++) {
			String s1 = words[i];
			String s2 = words[i + 1];
			if (s1.startsWith(s2) && s1.length() > s2.length()) {
				return "";
			}
			for (int j = 0; j < Math.min(s1.length(), s2.length()); j++) {
				if (s1.charAt(j) != s2.charAt(j)) {
					map.get(s1.charAt(j)).add(s2.charAt(j));
					break;
				}
			}
		}
		int[] in_deg = new int[26];
		for (char ch : map.keySet()) {
			for (char nbrs : map.get(ch)) {
				in_deg[nbrs - 'a']++;
			}
			// in_deg[ch-'a'] = map.get(ch).size();
		}
		Queue<Character> q = new LinkedList<>();
		for (char ch : map.keySet()) {
			if (in_deg[ch - 'a'] == 0) {
				q.add(ch);
			}
		}
		StringBuilder sb = new StringBuilder();
		while (!q.isEmpty()) {
			char ch = q.poll();
			sb.append(ch);
			for (char nbrs : map.get(ch)) {
				in_deg[nbrs - 'a']--;
				if (in_deg[nbrs - 'a'] == 0) {
					q.add(nbrs);
				}
			}
		}
		return sb.length() == map.size() ? sb.toString() : "";
	}
}
