package it.unibo.generics.graph.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import it.unibo.generics.graph.api.Graph;

public class GraphImpl<N> implements Graph<N>{

    Set<N> nodes; 
    Map<N, Set<N>> adjacency_list;

    public GraphImpl() {
        this.nodes = new HashSet<>(Collections.emptySet()); 
        this.adjacency_list = new HashMap<>(Collections.emptyMap());
    }

    @Override
    public void addNode(N node) {
        try {
            this.nodes.add(node);
            this.adjacency_list.put(node, new HashSet<>(Collections.emptySet())); 
        } catch (Exception e) {}
    }

    @Override
    public void addEdge(N source, N target) {
        try {
            this.adjacency_list.get(source).add(target);
        } catch (Exception e) { }
    }

    @Override
    public Set<N> nodeSet() {
        return this.nodes;
    }

    @Override
    public Set<N> linkedNodes(N node) {
        return adjacency_list.get(node);
    }

    @Override
    public List<N> getPath(N source, N target) {
        List<N> path_bfs = breadthFirstSearch(source, target);
        // TODO
        // List<N> path_dfs = depthFirstSearch(source, target);
        // if (path_dfs.size() < path_bfs.size()) return path_dfs;
        return path_bfs;
    }



    public List<N> breadthFirstSearch(N start_node, N target_node) {    //CHAT-GPT GENERATED
        List<N> result = new ArrayList<>();
        Set<N> visited = new HashSet<>();
        Queue<N> queue = new LinkedList<>();
        Map<N, N> parent_map = new HashMap<>();

        if (!this.nodes.contains(start_node) || !this.nodes.contains(target_node)) {
            return result; // Start or target node is not in the graph
        }

        queue.add(start_node);
        visited.add(start_node);

        while (!queue.isEmpty()) {
            N current_node = queue.poll();
            if (current_node.equals(target_node)) {
                N current = target_node;
                while (!current.equals(start_node)) {
                    result.add(current);
                    current = parent_map.get(current);
                }
                result.add(start_node);
                Collections.reverse(result);
                return result;
            }

            if (this.adjacency_list.containsKey(current_node)) {
                for (N neighbor : this.adjacency_list.get(current_node)) {
                    if (!visited.contains(neighbor)) {
                        queue.add(neighbor);
                        visited.add(neighbor);
                        parent_map.put(neighbor, current_node);
                    }
                }
            }
        }

        return result;
    }
}
