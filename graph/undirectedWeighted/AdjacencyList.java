
class Node {
    int id;
    int weight;

    public Node(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return id == node.id && weight == node.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight);
    }

    @Override
    public String toString() {
        return "{" + id +
                ", " + weight +
                '}';
    }

}

public class AdjacencyList {


    Map<Integer, Set<Node>> initialize(int[][] edges) {
        Map<Integer, Set<Node>> adjList = new HashMap<>();
        for(int[] edge : edges) {
            int source = edge[0], destination = edge[1], weight = edge[2];
            adjList.computeIfAbsent(source, key -> new HashSet<Node>()).add(new Node(destination, weight));
            adjList.computeIfAbsent(destination, key -> new HashSet<Node>()).add(new Node(source, weight));
        }
        return adjList;
    }

}