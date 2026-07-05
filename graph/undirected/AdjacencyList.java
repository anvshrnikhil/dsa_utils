public class AdjacencyList {

    Map<Integer, Set<Integer>> initialize(int[][] edges) {
        Map<Integer, Set<Integer>> adjList = new HashMap<>();
        for(int[] edge : edges) {
            int source = edge[0], destination = edge[1];
            adjList.computeIfAbsent(source, key -> new HashSet<Integer>()).add(destination);
            adjList.computeIfAbsent(destination, key -> new HashSet<Integer>()).add(source);
        }
        return adjList;
    }

}