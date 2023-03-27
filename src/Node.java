import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private Node parent;
    private List<Node> children;
    private Node left;
    private Node right;

    public Node(int value, Node parent) {
        this.value = value;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public Node getParent() {
        return parent;
    }

    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        children.add(child);
    }

    public int getDegree() {
        return children.size();
    }

    public boolean isLeaf() {
        return children.isEmpty();
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    public Node getLeft() {
        return left;
    }
    
    public void setLeft(Node left) {
        this.left = left;
    }
    
    public Node getRight() {
        return right;
    }
    
    public void setRight(Node right) {
        this.right = right;
    }
    

}