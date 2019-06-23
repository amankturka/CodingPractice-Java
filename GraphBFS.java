
//Implement Breadth First Search using queue
//In BFS,a node visits all of its neighbor first
//level order traversal 
class GraphBFS {
    int noVertices;
    LinkedList<Integer> adjacentNodes[];

    GraphBFS(int vertices) {
        noVertices = vertices;
        adjacentNodes = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adjacentNodes[i] = new LinkedList();
        }
    }

    void BFS(int root) {
        Queue<Integer> queue = new LinkedList<>();
        boolean visitedNodes[] = new boolean[noVertices];

        visitedNodes[root] = true;
        queue.add(root);

        while (!queue.isEmpty()) {
            int n = queue.remove();
            if (!visitedNodes[n]) {
                visitedNodes[n] = true;
                queue.add(n);
            }
        }
    }
}