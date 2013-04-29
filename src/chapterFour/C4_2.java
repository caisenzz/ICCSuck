/**
 * 
 */
package chapterFour;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Ethan.C 
 * Given a directed graph, design an algorithm to find out
 * whether there is a route between two nodes.
 */
public class C4_2 {
	public enum State {
		Unvisited, Visited, Visiting;
	}

	class Node {
		public char label;
		public State state;
		public List<Node> neighors;

		public Node(char lab) {
			label = lab;
			state = State.Unvisited;
		}

		public List<Node> getAdjacent() {
			return this.neighors;
		}
	}

	static class Graph {
		private List<Node> vertices;

		public List<Node> getNodes() {
			return this.vertices;
		}

		/*
		 * public List<Node> getAdjacent(Node v){ return v.neighbors; }
		 */

		public static boolean search(Graph g, Node start, Node end) {
			LinkedList<Node> q = new LinkedList<Node>();
			for (Node u : g.getNodes()) {
				u.state = State.Unvisited;
			}
			start.state = State.Visiting;
			q.add(start);
			Node u;
			while (!q.isEmpty()) {
				u = q.removeFirst();
				if (u != null) {
					for (Node v : u.getAdjacent()) {
						if (v.state == State.Unvisited) {
							if (v == end) {
								return true;
							} else {
								v.state = State.Visiting;
								q.add(v);
							}
						}
					}
					u.state = State.Visited;
				}
			}
			return false;
		}

	}
}
