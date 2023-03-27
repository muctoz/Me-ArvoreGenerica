public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.getRoot();
        tree.preOrderTraversal(root);
        tree.postOrderTraversal(root);
        tree.inOrderTraversal(root);
        tree.breadthFirstTraversal();
        tree.addNode(10, null);
        tree.addNode(20, 10);
        tree.addNode(30, 20);
        tree.addNode(40, 20);
        tree.addNode(50, 30);
        tree.addNode(60, 30);
        tree.addNode(70, 40);
        tree.addNode(80, 40);
        tree.addNode(90, 50);
        tree.addNode(4, 10);
        tree.addNode(6, 4);
        tree.addNode(3, 4);
        tree.addNode(5, 6);
        tree.addNode(7, 6);
        tree.addNode(100, 90);
        tree.addNode(101, 100);
        tree.addNode(102, 101);
        tree.addNode(103, 102);
        tree.addNode(104, 103);
        tree.addNode(105, 104);
        tree.addNode(106, 105);
        tree.addNode(107, 106);
        tree.addNode(110, 90);
        tree.addNode(120, 110);
        tree.addNode(130, 120);
        tree.addNode(12, 130);
        tree.addNode(14, 130);
        tree.addNode(16, 14);
        tree.addNode(15, 16);
        tree.addNode(17, 16);
        tree.addNode(18, 17);
        tree.addNode(19, 18);

        System.out.println("Height of node 10: " + tree.getHeight(10));
        System.out.println("Height of node 20: " + tree.getHeight(20));
        System.out.println("Height of node 50: " + tree.getHeight(50));
        System.out.println("Depth of node 10: " + tree.getDepth(10));
        System.out.println("Depth of node 20: " + tree.getDepth(20));
        System.out.println("Depth of node 50: " + tree.getDepth(50));
        System.out.println("Level of node 10: " + tree.getLevel(10));
        System.out.println("Level of node 20: " + tree.getLevel(20));
        System.out.println("Level of node 50: " + tree.getLevel(50));
        System.out.println("Degree of node 10: " + tree.getDegree(10));
        System.out.println("Degree of node 20: " + tree.getDegree(20));
        System.out.println("Degree of node 50: " + tree.getDegree(50));
        System.out.println("Leaf nodes: " + tree.getLeafNodes());
        System.out.println("Subtrees of node 20: " + tree.getSubtrees(20));

        System.out.println("Binary search tree:");
        tree.convertToBinarySearchTree();
        System.out.println("Height of node 10: " + tree.getHeight(10));
        System.out.println("Height of node 20: " + tree.getHeight(20));
        System.out.println("Height of node 50: " + tree.getHeight(50));
    }
}