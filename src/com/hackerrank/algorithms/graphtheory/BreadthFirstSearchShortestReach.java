package com.hackerrank.algorithms.graphtheory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import sun.misc.Queue;

public class BreadthFirstSearchShortestReach {

	public static class Graph {
		private HashMap<Integer, LinkedList<Integer>> adjLists = new HashMap<>();

		private int nodes;

		public Graph(int nodes) {
			this.nodes = nodes;
		}

		public void addEdge(int u, int w) {
			if (adjLists.get(u) == null) {
				adjLists.put(u, new LinkedList<>());
			}
			if (adjLists.get(w) == null) {
				adjLists.put(w, new LinkedList<>());
			}
			LinkedList<Integer> adjList = adjLists.get(u);
			adjList.add(w);
			adjLists.put(u, adjList);
			adjList = adjLists.get(w);
			adjList.add(u);
			adjLists.put(w, adjList);
		}

		public int[] bredthFirstSearch(int start) throws InterruptedException {
			boolean[] visited = new boolean[nodes];
			int[] par = new int[nodes];
			int[] dist = new int[nodes];
			for (int i = 0; i < dist.length; i++) {
				dist[i] = -1;
			}
			Queue<Integer> q = new Queue<>();
			q.enqueue(start);
			visited[start] = true;
			dist[start] = 0;
			while (!q.isEmpty()) {
				int parent = q.dequeue();
				for (Integer item : adjLists.get(parent)) {
					if (!visited[item]) {
						dist[item] = dist[parent] + 6;
						par[item] = parent;
						q.enqueue(item);
						visited[item] = true;
					}
				}
			}
			return dist;
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < testCases; i++) {
			String[] line = sc.nextLine().trim().split("\\s+");
			int nodes = Integer.parseInt(line[0]);
			int edges = Integer.parseInt(line[1]);
			Graph g = new Graph(nodes);
			for (int j = 0; j < edges; j++) {
				line = sc.nextLine().trim().split("\\s+");
				g.addEdge(Integer.parseInt(line[0]) - 1, Integer.parseInt(line[1]) - 1);
			}
			line = sc.nextLine().trim().split("\\s+");
			int start = Integer.parseInt(line[0]) - 1;
			int[] dist = g.bredthFirstSearch(start);
			for (int j = 0; j < dist.length; j++) {
				if (j != start) {
					System.out.print(dist[j] + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
