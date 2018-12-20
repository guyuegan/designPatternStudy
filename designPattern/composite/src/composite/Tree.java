package composite;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class Tree {
    private TreeNode root;

    public Tree() {}

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public void add(TreeNode child) {
        root.add(child);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root.getChildren().toString() +
                '}';
    }
}
