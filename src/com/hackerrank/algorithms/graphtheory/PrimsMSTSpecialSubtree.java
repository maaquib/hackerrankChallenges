package com.hackerrank.algorithms.graphtheory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class PrimsMSTSpecialSubtree {

	public static class Graph {
		private int vertices;
		HashMap<Integer, LinkedList<Edge>> adjLists = new HashMap<>();

		public void addEdge(int from, int to, int weight) {
			LinkedList<Edge> adjList = adjLists.get(from);
			adjList.add(new Edge(from, to, weight));
			adjLists.put(from, adjList);

			adjList = adjLists.get(to);
			adjList.add(new Edge(to, from, weight));
			adjLists.put(to, adjList);
		}

		public Graph(int vertices) {
			this.vertices = vertices;
			for (int i = 0; i < vertices; i++) {
				adjLists.put(i, new LinkedList<>());
			}
		}
	}

	public static class Prims {
		private Edge[] mstEdge;
		private int[] dist;
		private boolean[] visited;
		private HashMap<Integer, Integer> map = new HashMap<>();

		public Prims(Graph g) {
			mstEdge = new Edge[g.vertices];
			visited = new boolean[g.vertices];

			dist = new int[g.vertices];
			for (int i = 0; i < dist.length; i++) {
				dist[i] = Integer.MAX_VALUE;
			}
			for (int i = 0; i < g.vertices; i++) {
				if (!visited[i]) {
					prims(g, i);
				}
			}
		}

		private void prims(Graph g, int src) {
			visited[src] = true;
			dist[src] = 0;
			map.put(src, dist[src]);
			while (!map.isEmpty()) {
				int i = deleteMinKey();
				scan(g, i);
			}
		}

		private void scan(Graph g, int src) {
			visited[src] = true;
			for (Edge edge : g.adjLists.get(src)) {
				Integer vertice = edge.to;
				if (!visited[vertice]) {
					if (edge.weight < dist[vertice]) {
						dist[vertice] = edge.weight;
						mstEdge[vertice] = edge;

						if (map.containsKey(edge.to)) {
							map.replace(edge.to, dist[edge.to]);
						} else {
							map.put(edge.to, dist[edge.to]);
						}
					}
				}
			}
		}

		private int deleteMinKey() {
			int min = 0;
			int minValue = Integer.MAX_VALUE;
			for (int key : map.keySet()) {
				if (map.get(key) < minValue) {
					min = key;
					minValue = map.get(key);
				}
			}
			map.remove(min);
			return min;
		}

		public int weight() {
			int weight = 0;
			for (Edge e : mstEdge) {
				if (e != null) {
					weight += e.weight;
				}
			}
			return weight;
		}
	}

	public static class Edge {
		int from;
		int to;
		int weight;

		public Edge(int from, int to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().trim().split("\\s+");
		int nodes = Integer.parseInt(line[0]);
		int edges = Integer.parseInt(line[1]);
		Graph g = new Graph(nodes);
		for (int i = 0; i < edges; i++) {
			line = sc.nextLine().trim().split("\\s+");
			int src = Integer.parseInt(line[0]) - 1;
			int dest = Integer.parseInt(line[1]) - 1;
			int weight = Integer.parseInt(line[2]);
			g.addEdge(src, dest, weight);
		}
		Prims prims = new Prims(g);
		System.out.println(prims.weight());
		sc.close();
	}
}
