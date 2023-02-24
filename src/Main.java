import java.util.List;


public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addNode(10, null); // raiz
        tree.addNode(20, 10);
        tree.addNode(30, 10);
        tree.addNode(40, 20);
        tree.addNode(50, 20);
        tree.addNode(60, 30);
        tree.addNode(70, 30);
        tree.addNode(80, 40);
        tree.addNode(90, 40);
        tree.addNode(100, 50);

        System.out.println("Leaf nodes:");
        List<Node> leafNodes = tree.getLeafNodes();
        for (Node leafNode : leafNodes) {
            System.out.println(leafNode);
        }

        System.out.println("Degree of node 20: " + tree.getDegree(20));
        System.out.println("Height of node 10: " + tree.getHeight(10));
        System.out.println("Depth of node 100: " + tree.getDepth(100));
        System.out.println("Level of node 60: " + tree.getLevel(60));

        System.out.println("Subtrees of node 20:");
        List<List<Node>> subtrees = tree.getSubtrees(20);
        for (List<Node> subtree : subtrees) {
            for (Node node : subtree) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}