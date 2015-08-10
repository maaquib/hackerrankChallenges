package com.hackerrank.algorithms.graphtheory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class DijkstraShortestReach2 {
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

		public int verticesCount() {
			return vertices;
		}
	}

	public static class Dijkstras {
		private int[] dist;

		private HashMap<Integer, Integer> map = new HashMap<>();

		public Dijkstras(Graph g, int src) {
			dist = new int[g.vertices];
			for (int i = 0; i < dist.length; i++) {
				dist[i] = -1;
			}

			dist[src] = 0;
			map.put(src, 0);
			while (!map.isEmpty()) {
				int key = deleteMinKey();
				for (Edge edge : g.adjLists.get(key)) {
					relax(edge);
				}
			}
			printDist(src);
		}

		private void printDist(int src) {
			for (int i = 0; i < dist.length; i++) {
				if (src != i) {
					System.out.print(dist[i] + " ");
				}
			}
		}

		private void relax(Edge edge) {
			if (dist[edge.to] > dist[edge.from] + edge.weight || dist[edge.to] == -1) {
				dist[edge.to] = dist[edge.from] + edge.weight;

				if (map.containsKey(edge.to)) {
					map.replace(edge.to, dist[edge.to]);
				} else {
					map.put(edge.to, dist[edge.to]);
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
		int testCases = Integer.parseInt(line[0]);
		for (int i = 0; i < testCases; i++) {
			line = sc.nextLine().trim().split("\\s+");
			int nodes = Integer.parseInt(line[0]);
			int edges = Integer.parseInt(line[1]);
			Graph g = new Graph(nodes);
			for (int j = 0; j < edges; j++) {
				line = sc.nextLine().trim().split("\\s+");
				int src = Integer.parseInt(line[0]) - 1;
				int dest = Integer.parseInt(line[1]) - 1;
				int weight = Integer.parseInt(line[2]);
				g.addEdge(src, dest, weight);
			}
			line = sc.nextLine().trim().split("\\s+");
			int src = Integer.parseInt(line[0]) - 1;
			new Dijkstras(g, src);
			System.out.println();
		}
		sc.close();
	}
}
