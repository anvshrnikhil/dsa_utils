

class Tree {

    int maxDepth(int root, Map<Integer, Set<Integer>> adjList) {
        int depth = 0;
        Map<Integer, Boolean> visited = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        visited.put(1, true);
        while(queue.size() > 1) {
            Integer value = queue.poll();
            if(value == null) {
                depth++;
                queue.add(null);
                continue;
            }
            adjList.getOrDefault(value, new HashSet<>()).stream().forEach(entry -> {
                if(!visited.getOrDefault(entry, false)) {
                    visited.put(entry, true);
                    queue.add(entry);
                }
            });
        }
        return depth;
    }

}