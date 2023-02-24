import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {
    private Node root;

    public void addNode(int value, Integer parentValue) {
        if (root == null) {
            if (parentValue != null) {
                throw new IllegalArgumentException("Cannot add a child to a non-existent parent");
            }
            root = new Node(value, null);
        } else {
            Node parent = findNode(parentValue);
            if (parent == null) {
                throw new IllegalArgumentException("Parent node not found");
            }
            Node node = new Node(value, parent);
            parent.addChild(node);
        }
    }

    public Node findNode(int value) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.getValue() == value) {
                return node;
            }
            for (Node child : node.getChildren()) {
                queue.add(child);
            }
        }
        return null;
    }

    public List<Node> getLeafNodes() {
        List<Node> leafNodes = new ArrayList<>();
        getLeafNodes(root, leafNodes);
        return leafNodes;
    }

    private void getLeafNodes(Node node, List<Node> leafNodes) {
        if (node.isLeaf()) {
            leafNodes.add(node);
        } else {
            for (Node child : node.getChildren()) {
                getLeafNodes(child, leafNodes);
            }
        }
    }
    public int getDegree(int value) {
        Node node = findNode(value);
        return node.getDegree();
    }

    public int getHeight(int value) {
        Node node = findNode(value);
        return getHeight(node);
    }

    private int getHeight(Node node) {
        if (node.isLeaf()) {
            return 0;
        }
        int maxHeight = 0;
        for (Node child : node.getChildren()) {
            int height = getHeight(child);
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight + 1;
    }

    public int getDepth(int value) {
        Node node = findNode(value);
        return getDepth(node);
    }

    private int getDepth(Node node) {
        int depth = 0;
        while (node.getParent() != null) {
            depth++;
            node = node.getParent();
        }
        return depth;
    }

    public int getLevel(int value) {
        Node node = findNode(value);
        return getLevel(node);
    }
    private int getLevel(Node node) {
        if (node == null) {
            return -1;
        }
        int level = 0;
        while (node.getParent() != null) {
            level++;
            node = node.getParent();
        }
        return level;
    }

    public List<List<Node>> getSubtrees(int value) {
        List<List<Node>> subtrees = new ArrayList<>();
        Node node = findNode(value);
        for (Node child : node.getChildren()) {
            List<Node> subtree = new ArrayList<>();
            getSubtree(child, subtree);
            subtrees.add(subtree);
        }
        return subtrees;
    }

    private void getSubtree(Node node, List<Node> subtree) {
        subtree.add(node);
        for (Node child : node.getChildren()) {
            getSubtree(child, subtree);
        }
    }
}