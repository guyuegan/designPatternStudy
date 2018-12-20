package composite;

public class CompositeTest {
    public static void main(String[] args) {
        Tree root = new Tree("根");
        TreeNode node1 = new TreeNode("枝丫1");
        TreeNode node2 = new TreeNode("枝丫2");

        node1.add(node2);
        root.add(node1);
        System.out.println("i have a tree now" + root);
    }
}
